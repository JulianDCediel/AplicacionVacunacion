/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DAO_Lote;
import Modelo.DTO_Lote;
import Modelo.DataL;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vistas_proyecto.Generar_Informes;
import vistas_proyecto.InformeVacunas;

/**
 *
 * @author Franquito UwU
 */
public class Controlador_InformeVacunas implements ActionListener {

    private InformeVacunas infV;
    private Generar_Informes VGI;
    private DAO_Lote daoL;
    private DTO_Lote dtoL;

    public Controlador_InformeVacunas(InformeVacunas infV, Generar_Informes VGI, DAO_Lote daoL, DTO_Lote dtoL) {
        this.infV = infV;
        this.VGI = VGI;
        this.daoL = daoL;
        this.dtoL = dtoL;

        this.infV.getBtnGenerar().addActionListener(this);
        this.infV.getBtnRegresar().addActionListener(this);
    }

    public void mensaje(String ms, String tlt) {
        JOptionPane.showMessageDialog(null, ms, tlt, 1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(infV.getBtnGenerar())) {
            int can = 0;
            Document documento = new Document();
            String[] titulos = {"No Lote", "Producto", "Fabricante", "Cantidad", "Fecha Entrega", "Fecha Vencimiento"};
            DefaultTableModel dm = new DefaultTableModel(null, titulos);
            infV.getTblVacunas().setModel(dm);

            try {
                String ruta = System.getProperty("user.home");
                PdfWriter.getInstance(documento, new FileOutputStream("InformeLotes.pdf"));
                documento.setMargins(0, 0, 0, 0);
                Image header = Image.getInstance("src/vistas_proyecto_Iconos/secretaria.jpg");
                header.scaleToFit(600, 1000);
                header.setAlignment(Chunk.ALIGN_CENTER);

                Paragraph parrafo = new Paragraph();
                parrafo.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo.add("Creado por MAC © para Secretaria de salud de bogota\n\n");
                parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.BLACK));
                parrafo.add("INFORME LOTES\n\n");
                documento.open();
                documento.add(header);
                documento.add(parrafo);
                PdfPTable tabla = new PdfPTable(6);
                tabla.addCell("No Lote");
                tabla.addCell("Producto");
                tabla.addCell("Fabricante");
                tabla.addCell("Cantidad");
                tabla.addCell("Fecha Entrega");
                tabla.addCell("Fecha Vencimiento");
                if (daoL.informe(dtoL)) {
                    for (DTO_Lote lote : DataL.L_lote) {
                        Object[] fila = {lote.getN_lote(), lote.getDetalle(), lote.getLab(), lote.getCantidad(), lote.getF_entr(), lote.getF_ven()};
                        dm.addRow(fila);

                        tabla.addCell(lote.getN_lote());
                        tabla.addCell(lote.getDetalle());
                        tabla.addCell(lote.getLab());
                        tabla.addCell(String.valueOf(lote.getCantidad()));
                        tabla.addCell(String.valueOf(lote.getF_entr()));
                        tabla.addCell(String.valueOf(lote.getF_ven()));
                        can += lote.getCantidad();
                    }
                    infV.getTxtDosisRecibidas().setText(String.valueOf(can));
                    tabla.addCell("");
                    tabla.addCell("");
                    tabla.addCell("Total:");
                    tabla.addCell(String.valueOf(can));
                    tabla.addCell("");
                    tabla.addCell("");
                    documento.add(tabla);
                    documento.close();
                    mensaje("informe creado", "informe");
                } else {
                    mensaje("error al generar informe", "informe");
                }
            } catch (DocumentException | FileNotFoundException ex) {
            } catch (IOException ex) {
                Logger.getLogger(Controlador_InformeVacunas.class.getName()).log(Level.SEVERE, null, ex);
            }
            DataL.L_lote.clear();

        }

        if (e.getSource().equals(infV.getBtnRegresar())) {
            infV.dispose();
            VGI.setVisible(true);
        }
    }

}
