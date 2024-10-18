/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DAO_Paciente;
import Modelo.DTO_Paciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas_proyecto.BuscarModificar_Paciente;
import vistas_proyecto.Menu_Principal;
import vistas_proyecto.Modificar_Paciente;
import vistas_proyecto.Registro_Paciente;

/**
 *
 * @author User
 */
public class Controlador_5_BMP implements ActionListener {
    
    private DTO_Paciente dtoP;
    private DAO_Paciente daoP;
    private BuscarModificar_Paciente VBMP;
    private Menu_Principal VMprinV;
    private Modificar_Paciente VMP;
    
    public Controlador_5_BMP(DTO_Paciente dtoP, DAO_Paciente daoP, BuscarModificar_Paciente VBMP, Menu_Principal VMprinV, Modificar_Paciente VMP) {
        this.dtoP = dtoP;
        this.daoP = daoP;
        this.VBMP = VBMP;
        this.VMprinV = VMprinV;
        this.VMP = VMP;
        
        this.VBMP.getBtnRegresar().addActionListener(this);
        this.VBMP.getBtrnContinuar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(VBMP.getBtnRegresar())) {
            VBMP.dispose();
            VMprinV.setVisible(true);
            
        }
        if (e.getSource().equals(VBMP.getBtrnContinuar())) {
            
            dtoP.setDocumento(Integer.parseInt(VBMP.getLabelDocumento().getText()));
            if(daoP.validar(dtoP)){
                VBMP.getLabelDocumento().setText(null);
                VBMP.dispose();
                VMP.getTxt_nom().setText(dtoP.getNombre());
                VMP.getTxt_ape().setText(dtoP.getApellido());
                VMP.getTxt_corr().setText(dtoP.getCorreo());
                VMP.getTxt_eps().setText(dtoP.getEps());
                VMP.getComBox_RC3().setSelectedItem(dtoP.getRegimen());
                VMP.getTxt_fec().setText(String.valueOf(dtoP.getFechaN()));
                VMP.getTxt_doc().setText(String.valueOf(dtoP.getDocumento()));
                VMP.getTxt_sang().setText(dtoP.getT_Sangre());
                VMP.getCombox_td().setSelectedItem(dtoP.getT_Documento());
                VMP.getTxt_doc().setEditable(false);
                VMP.setVisible(true);
            }
            
        }
    }
    
}
