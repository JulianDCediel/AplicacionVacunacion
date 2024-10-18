/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DAO_Lote;
import Modelo.DAO_Vacunacion;
import Modelo.DTO_Lote;
import Modelo.DTO_Vacunacion;
import Modelo.DataL;
import Modelo.DataPuestas;
import Modelo.DataV;
import Modelo.Puestas;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
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
import vistas_proyecto.InformeDosisGENERAL;

/**
 *
 * @author Franquito UwU
 */
public class Controlador_InformeDosisGENERAL implements ActionListener {

    private InformeDosisGENERAL infD;
    private Generar_Informes VGI;
    private DAO_Vacunacion daoV;
    private DTO_Vacunacion dtoV;
    private DAO_Lote daoL;
    private DTO_Lote dtoL;
    private Puestas puesta;

    public Controlador_InformeDosisGENERAL(InformeDosisGENERAL infD, Generar_Informes VGI, DAO_Vacunacion daoV, DTO_Vacunacion dtoV, DAO_Lote daoL, DTO_Lote dtoL, Puestas puesta) {
        this.infD = infD;
        this.VGI = VGI;
        this.daoV = daoV;
        this.dtoV = dtoV;
        this.daoL = daoL;
        this.dtoL = dtoL;
        this.puesta = puesta;
        this.infD.getBtnGenerar().addActionListener(this);
        this.infD.getBtnRegresar().addActionListener(this);
    }

    public void mensaje(String ms, String tlt) {
        JOptionPane.showMessageDialog(null, ms, tlt, 1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(infD.getBtnGenerar())) {
            int canP = 0, canR = 0, pp = 0, pm = 0, ps = 0;
            Document documento = new Document();
            String[] titulos = {"Documento", "Fecha de Aplicacion", "Dosis", "No Lote", "Tipo de vacuna"};
            DefaultTableModel dm = new DefaultTableModel(null, titulos);
            infD.getTblDosis().setModel(dm);

            try {
                String ruta = System.getProperty("user.home");
                PdfWriter.getInstance(documento, new FileOutputStream("InformeVacunacion.pdf"));
                documento.setMargins(0, 0, 0, 0);
                Image header = Image.getInstance("src/vistas_proyecto_Iconos/secretaria.jpg");
                header.scaleToFit(600, 1000);
                header.setAlignment(Chunk.ALIGN_CENTER);

                Paragraph parrafo = new Paragraph();
                parrafo.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo.add("Creado por MAC © para Secretaria de salud de bogota\n\n");
                parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.BLACK));
                parrafo.add("INFORME VACUNACION\n\n");
                documento.open();
                documento.add(header);
                documento.add(parrafo);
                PdfPTable tabla = new PdfPTable(5);
                tabla.addCell("Documento");
                tabla.addCell("Fecha de Aplicacion");
                tabla.addCell("Dosis");
                tabla.addCell("No Lote");
                tabla.addCell("Tipo de vacuna");

                PdfPTable tabla2 = new PdfPTable(5);
                tabla2.addCell("No Lote");
                tabla2.addCell("Fabricante");
                tabla2.addCell("Recibidas");
                tabla2.addCell("Aplicadas");
                tabla2.addCell("Restantes");
                if (daoV.informe(dtoV) && daoL.informe(dtoL) && daoV.informe2(puesta)) {

                    for (DTO_Vacunacion vac : DataV.L_vac) {
                        Object[] fila = {vac.getDocP(), vac.getFecha(), vac.getN_dosis(), vac.getLote(), vac.getMarca()};
                        dm.addRow(fila);
                        tabla.addCell(String.valueOf(vac.getDocP()));
                        tabla.addCell(String.valueOf(vac.getFecha()));
                        tabla.addCell(String.valueOf(vac.getN_dosis()));
                        tabla.addCell(vac.getLote());
                        tabla.addCell(vac.getMarca());

                        canP++;
                    }

                    for (DTO_Lote lote : DataL.L_lote) {
                        for (Puestas pues : DataPuestas.l_pues) {
                            if (lote.getN_lote().equals(pues.getLote())) {
                                tabla2.addCell(lote.getN_lote());
                                tabla2.addCell(lote.getLab());
                                tabla2.addCell(String.valueOf(lote.getCantidad()));
                                tabla2.addCell(String.valueOf(pues.getPeustas()));
                                tabla2.addCell(String.valueOf(lote.getCantidad() - pues.getPeustas()));
                            }
                        }

                        canR += lote.getCantidad();
                    }
                    infD.getTxtDosisAplicadas().setText(String.valueOf(canP));
                    infD.getTxtDosisRecibidas().setText(String.valueOf(canR));
                    infD.getTxtDosisRestantes().setText(String.valueOf(canR - canP));
                    tabla.addCell("");
                    tabla.addCell("");
                    tabla.addCell("Aplicadas:" + String.valueOf(canP));
                    tabla.addCell("recibidas:" + String.valueOf(canR));
                    tabla.addCell("Total:" + String.valueOf(canR - canP));

                    documento.add(tabla);
                    Paragraph parrafo2 = new Paragraph();
                    parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
                    parrafo2.add("...\n\n");
                    documento.add(parrafo2);
                    documento.add(tabla2);
                    documento.close();
                    mensaje("informe creado", "informe");

                } else {
                    mensaje("error al generar informe", "informe");
                }
            } catch (DocumentException | FileNotFoundException ex) {
            } catch (IOException ex) {
                Logger.getLogger(Controlador_InformeDosisGENERAL.class.getName()).log(Level.SEVERE, null, ex);
            }
            DataL.L_lote.clear();
            DataV.L_vac.clear();
        }

        if (e.getSource().equals(infD.getBtnRegresar())) {
            infD.getTblDosis().clearSelection();
            infD.dispose();
            VGI.setVisible(true);
        }
    }

}
