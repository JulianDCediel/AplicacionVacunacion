/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DAO_Paciente;
import Modelo.DTO_Paciente;
import Modelo.DataP;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
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
import vistas_proyecto.InformePacientes;

/**
 *
 * @author Franquito UwU
 */
public class Controlador_InformePacientes implements ActionListener {

    private InformePacientes infP;
    private Generar_Informes VGI;
    private DAO_Paciente daoPac;
    private DTO_Paciente dtoPac;

    public Controlador_InformePacientes(InformePacientes infP, Generar_Informes VGI, DAO_Paciente daoPac, DTO_Paciente dtoPac) {
        this.infP = infP;
        this.VGI = VGI;
        this.daoPac = daoPac;
        this.dtoPac = dtoPac;

        this.infP.getBtnGenerar().addActionListener(this);
        this.infP.getBtnRegresar().addActionListener(this);
    }

    public void mensaje(String ms, String tlt) {
        JOptionPane.showMessageDialog(null, ms, tlt, 1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(infP.getBtnGenerar())) {

            Document documento = new Document();
            String[] titulos = {"Documento", "Nombre", "Apellidos", "RH", "Regimen", "Tipo Documento", "Correo"};
            DefaultTableModel dm = new DefaultTableModel(null, titulos);
            infP.getTblPacientes().setModel(dm);

            try {
                String ruta = System.getProperty("user.home");
                PdfWriter.getInstance(documento, new FileOutputStream("InformePacientes.pdf"));
                documento.setMargins(0, 0, 0, 0);
                Image header = Image.getInstance("src/vistas_proyecto_Iconos/secretaria.jpg");
                header.scaleToFit(600, 1000);
                header.setAlignment(Chunk.ALIGN_CENTER);

                Paragraph parrafo = new Paragraph();
                parrafo.setAlignment(Paragraph.ALIGN_CENTER);
                parrafo.add("Creado por MAC © para Secretaria de salud de bogota\n\n");
                parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.BLACK));
                parrafo.add("INFORME PACIENTES\n\n");
                documento.open();
                documento.add(header);
                documento.add(parrafo);
                PdfPTable tabla = new PdfPTable(7);
                tabla.addCell("Documento");
                tabla.addCell("Nombre");
                tabla.addCell("Apellidos");
                tabla.addCell("RH");
                tabla.addCell("Regimen");
                tabla.addCell("Tipo Documento");
                tabla.addCell("Correo");

                if (daoPac.informe(dtoPac)) {
                    for (DTO_Paciente pac : DataP.L_pac) {
                        Object[] fila = {pac.getDocumento(), pac.getNombre(), pac.getApellido(), pac.getT_Sangre(), pac.getRegimen(), pac.getT_Documento(), pac.getCorreo()};
                        dm.addRow(fila);
                        tabla.addCell(String.valueOf(pac.getDocumento()));
                        tabla.addCell(pac.getNombre());
                        tabla.addCell(pac.getApellido());
                        tabla.addCell(pac.getT_Sangre());
                        tabla.addCell(pac.getRegimen());
                        tabla.addCell(pac.getT_Documento());
                        tabla.addCell(pac.getCorreo());

                    }
                    documento.add(tabla);
                    documento.close();
                    mensaje("informe creado", "informe");
                } else {
                    mensaje("error al generar informe", "informe");
                }

            } catch (DocumentException | FileNotFoundException ex) {
                mensaje("error al generar informee", "informe");
                System.out.println(ex);
            } catch (IOException exs) {
                Logger.getLogger(Controlador_InformePacientes.class.getName()).log(Level.SEVERE, null, exs);
            }
            DataP.L_pac.clear();
        }

        if (e.getSource().equals(infP.getBtnRegresar())) {
            infP.dispose();
            VGI.setVisible(true);
        }
    }

}
