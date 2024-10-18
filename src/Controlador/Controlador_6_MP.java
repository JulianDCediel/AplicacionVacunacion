/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DAO_Paciente;
import Modelo.DTO_Paciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import vistas_proyecto.Menu_Principal;
import vistas_proyecto.Modificar_Paciente;

/**
 *
 * @author User
 */
public class Controlador_6_MP implements ActionListener {

    private DTO_Paciente dtoP;
    private DAO_Paciente daoP;
    private Menu_Principal VMprinV;
    private Modificar_Paciente VMP;

    public Controlador_6_MP(DTO_Paciente dtoP, DAO_Paciente daoP, Menu_Principal VMprinV, Modificar_Paciente VMP) {
        this.dtoP = dtoP;
        this.daoP = daoP;
        this.VMprinV = VMprinV;
        this.VMP = VMP;

        this.VMP.getBtnRegresar().addActionListener(this);
        this.VMP.getBt_mod().addActionListener(this);
        this.VMP.getBt_eli().addActionListener(this);
    }

    public void mensaje(String ms, String tlt) {
        JOptionPane.showMessageDialog(null, ms, tlt, 1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(VMP.getBtnRegresar())) {
            VMP.dispose();
            VMprinV.setVisible(true);
        }

        if (e.getSource().equals(VMP.getBt_mod())) {

            dtoP.setNombre(VMP.getTxt_nom().getText());
            dtoP.setApellido(VMP.getTxt_ape().getText());
            dtoP.setCorreo(VMP.getTxt_corr().getText());
            dtoP.setT_Sangre(VMP.getTxt_sang().getText());
            dtoP.setEps(VMP.getTxt_eps().getText());
            dtoP.setT_Documento(String.valueOf(VMP.getCombox_td().getSelectedItem()));
            dtoP.setFechaN(LocalDate.parse(VMP.getTxt_fec().getText()));
            dtoP.setRegimen(String.valueOf(VMP.getComBox_RC3().getSelectedItem()));

            if (daoP.actulizar(dtoP)) {
                mensaje("PACIENTE ACTUALIZADO", "MODIFICAR");
                VMP.dispose();
                VMprinV.setVisible(true);
            }
        }
        if (e.getSource().equals(VMP.getBt_eli())) {
            String[] arreglo = {"SI", "NO"};
            int op = JOptionPane.showOptionDialog(null, "¿ESTA SEGURO QUE DESEA ELIMINAR EL PACIENTE?", "ELIMINAR", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "NO");
            if (arreglo[op].equals("SI")) {
                if (daoP.eliminar(dtoP)) {
                    mensaje("PACINETE ELIMINADO", "ELIMINAR");
                    VMP.dispose();
                    VMprinV.setVisible(true);
                }else{
                    System.out.println(dtoP.getDocumento());
                }
            }

        }
    }

}
