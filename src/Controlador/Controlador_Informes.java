/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas_proyecto.Generar_Informes;
import vistas_proyecto.InformeDosisGENERAL;
import vistas_proyecto.InformeEmpleados;
import vistas_proyecto.InformePacientes;
import vistas_proyecto.InformeVacunas;
import vistas_proyecto.Menu_Principal_Admin;

/**
 *
 * @author Franquito UwU
 */
public class Controlador_Informes implements ActionListener {
    private Generar_Informes geI;
    private Menu_Principal_Admin VMprinA;
    private InformeEmpleados infE;
    private InformePacientes infP;
    private InformeVacunas infV;
    private InformeDosisGENERAL infD;

    public Controlador_Informes(Generar_Informes geI, Menu_Principal_Admin VMprinA, InformeEmpleados infE, InformePacientes infP, InformeVacunas infV, InformeDosisGENERAL infD) {
        this.geI = geI;
        this.VMprinA = VMprinA;
        this.infE = infE;
        this.infP = infP;
        this.infV = infV;
        this.infD = infD;
        
        this.geI.getBtnInfDos().addActionListener(this);
        this.geI.getBtnInfEmp().addActionListener(this);
        this.geI.getBtnInfPac().addActionListener(this);
        this.geI.getBtnInfVac().addActionListener(this);
        this.geI.getBtnRegresar().addActionListener(this);
    }


    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(geI.getBtnRegresar())) {
            geI.dispose();
            VMprinA.setVisible(true);
        }
        
        if(e.getSource().equals(geI.getBtnInfEmp())) {
            geI.dispose();
            infE.setVisible(true);
        }
        
        if(e.getSource().equals(geI.getBtnInfPac())) {
            geI.dispose();
            infP.setVisible(true);
        }
        
        if(e.getSource().equals(geI.getBtnInfVac())) {
            geI.dispose();
            infV.setVisible(true);
        }
        
        if(e.getSource().equals(geI.getBtnInfDos())) {
            geI.dispose();
            infD.setVisible(true);
        }        
    }
    
    
}
