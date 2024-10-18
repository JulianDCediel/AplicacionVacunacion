/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DAO_Trabajador;
import Modelo.DTO_Paciente;
import Modelo.DTO_Trabajador;
import Modelo.DataE;
import Modelo.DataP;
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
import vistas_proyecto.InformeEmpleados;

/**
 *
 * @author Franquito UwU
 */
public class Controlador_InformeEmpleados implements ActionListener {

    private InformeEmpleados infE;
    private Generar_Informes VGI;
    private DAO_Trabajador daoT;
    private DTO_Trabajador dtoT;

    public Controlador_InformeEmpleados(InformeEmpleados infE, Generar_Informes VGI, DAO_Trabajador daoT, DTO_Trabajador dtoT) {
        this.infE = infE;
        this.VGI = VGI;
        this.daoT = daoT;
        this.dtoT = dtoT;

        this.infE.getBtnGenerar().addActionListener(this);
        this.infE.getBtnRegresar().addActionListener(this);
    }

    public void mensaje(String ms, String tlt) {
        JOptionPane.showMessageDialog(null, ms, tlt, 1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(infE.getBtnGenerar())) {
            Document documento = new Document();
            String[] titulos = {"Documento", "Nombre", "Apellidos", "Fecha Nacimiento", "Tipo Documento", "Correo", "Cargo"};
            DefaultTableModel dm = new DefaultTableModel(null, titulos);
            infE.getTblEmpleados().setModel(dm);

            try {
                String ruta = System.getProperty("user.home");
                PdfWriter.getInstance(documento, new FileOutputStream("InformeEmpleados.pdf"));
                documento.setMargins(0, 0, 0, 0);
                Image header = Image.getInstance("src/vistas_proyecto_Iconos/secretaria.jpg");
                header.scaleToFit(600, 1000);
                header.setAlignment(Chunk.ALIGN_CENTER);

                Paragraph parrafo = new Paragraph();
                parrafo.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo.add("Creado por MAC © para Secretaria de salud de bogota\n\n");
                parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.BLACK));
                parrafo.add("INFORME EMPLEADOS\n\n");
                documento.open();
                documento.add(header);
                documento.add(parrafo);
 
                PdfPTable tabla = new PdfPTable(7);
                tabla.addCell("Documento");
                tabla.addCell("Nombre");
                tabla.addCell("Apellidos");
                tabla.addCell("Fecha Nacimiento");
                tabla.addCell("Tipo Documento");
                tabla.addCell("Correo");
                tabla.addCell("Cargo");
                if (daoT.informe(dtoT)) {
                    for (DTO_Trabajador pac : DataE.L_E) {
                        Object[] fila = {pac.getDocumento(), pac.getNombre(), pac.getApellido(), pac.getFechaNam(), pac.getT_Documento(), pac.getCorreo(), pac.getCargo()};
                        dm.addRow(fila);
                        tabla.addCell(String.valueOf(pac.getDocumento()));
                        tabla.addCell(pac.getNombre());
                        tabla.addCell(pac.getApellido());
                        tabla.addCell(String.valueOf(pac.getFechaNam()));
                        tabla.addCell(pac.getT_Documento());
                        tabla.addCell(pac.getCorreo());
                        tabla.addCell(pac.getCargo());
                    }
                    documento.add(tabla);
                    documento.close();
                    mensaje("informe creado", "informe");
                } else {
                    mensaje("error al generar informe", "informe");
                }
            } catch (DocumentException | FileNotFoundException ex) {
            }catch (IOException ex) {
                Logger.getLogger(Controlador_InformeEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            }
            DataE.L_E.clear();
        }

        if (e.getSource().equals(infE.getBtnRegresar())) {
            infE.dispose();
            VGI.setVisible(true);
        }
    }

}
