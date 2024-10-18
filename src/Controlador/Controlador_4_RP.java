/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DAO_Paciente;
import Modelo.DAO_Vacunacion;
import Modelo.DTO_Paciente;
import Modelo.DTO_Vacunacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import vistas_proyecto.Menu_Principal;
import vistas_proyecto.Registro_Paciente;

/**
 *
 * @author User
 */
public class Controlador_4_RP implements ActionListener {

    private DTO_Paciente dtoP;
    private DAO_Paciente daoP;
    private Menu_Principal VMprinV;
    private Registro_Paciente VRp;

    public Controlador_4_RP(DTO_Paciente dtoP, DAO_Paciente daoP, Menu_Principal VMprinV, Registro_Paciente VRp) {
        this.dtoP = dtoP;
        this.daoP = daoP;
        this.VMprinV = VMprinV;
        this.VRp = VRp;

        this.VRp.getBtnRegistrar().addActionListener(this);
        this.VRp.getBtnRegresar().addActionListener(this);
    }

    public void mensaje(String ms, String tlt) {
        JOptionPane.showMessageDialog(null, ms, tlt, 1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(VRp.getBtnRegresar())) {
            VRp.dispose();
            VMprinV.setVisible(true);
        }

        if (e.getSource().equals(VRp.getBtnRegistrar())) {
            dtoP.setNombre(VRp.getTxt_Nom().getText());
            dtoP.setApellido(VRp.getTxt_apell().getText());
            dtoP.setCorreo(VRp.getTxt_Corr().getText());
            dtoP.setT_Sangre(VRp.getTXT_TS().getText());
            dtoP.setDocumento(Integer.parseInt(VRp.getTxt_doc().getText()));
            dtoP.setEps(VRp.getTxt_eps().getText());
            dtoP.setT_Documento(String.valueOf(VRp.getComBox_TD().getSelectedItem()));
            dtoP.setFechaN(LocalDate.parse(VRp.getTxt_nac().getText()));
            dtoP.setRegimen(String.valueOf(VRp.getComBox_RC().getSelectedItem()));

            if (daoP.insertar(dtoP)) {
                mensaje("PACIENTE AGREGADO", "REGISTRO");
                VRp.dispose();
                VMprinV.setVisible(true);
            }else{
                
                System.out.println(dtoP.getDocumento());
                mensaje("DATOS INVALIDOS", "REGISTRO");       
            }
        }
    }

}
