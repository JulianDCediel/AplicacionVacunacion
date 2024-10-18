/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas_proyecto.Datos_Empleado;
import vistas_proyecto.Menu_Principal_Admin;

/**
 *
 * @author Franquito UwU
 */
public class Controlador_DatosEmpleado implements ActionListener{
    private Datos_Empleado daE;
    private Menu_Principal_Admin VMprinA;

    public Controlador_DatosEmpleado(Datos_Empleado daE, Menu_Principal_Admin VMprinA) {
        this.daE = daE;
        this.VMprinA = VMprinA;
        
        this.daE.getBtnRegresar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(daE.getBtnRegresar())) {
            daE.dispose();
            VMprinA.setVisible(true);
        }
    }
}
