/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DAO_Trabajador;
import Modelo.DTO_Trabajador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import vistas_proyecto.BuscarModificar_Empleado;
import vistas_proyecto.Buscar_Empleado;
import vistas_proyecto.Datos_Empleado;
import vistas_proyecto.Menu_Principal_Admin;

/**
 *
 * @author Franquito UwU
 */
public class Controlador_BuscarEmpleado implements ActionListener{
    private DAO_Trabajador daot;
    private DTO_Trabajador dtot;
    private Buscar_Empleado bem;
    private Datos_Empleado dataEmp;
    private Menu_Principal_Admin mnuA;
    
    public Controlador_BuscarEmpleado(DAO_Trabajador daot, DTO_Trabajador dtot, Buscar_Empleado bem, Datos_Empleado dataEmp, Menu_Principal_Admin mnuA) {
        this.daot = daot;
        this.dtot = dtot;
        this.bem = bem;
        this.dataEmp = dataEmp;
        this.mnuA = mnuA;
        
        this.bem.getBtnContinuar().addActionListener(this);
        this.bem.getBtnRegresar().addActionListener(this);
    }
    
    public void mensaje(String ms, String tlt) {
        JOptionPane.showMessageDialog(null, ms, tlt, 1);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
                
        if(e.getSource().equals(bem.getBtnRegresar())) {
            bem.dispose();
            mnuA.setVisible(true);
        }
        
        if(e.getSource().equals(bem.getBtnContinuar())) {
            dtot.setDocumento(Integer.parseInt(bem.getTxtDoc().getText()));
            
            if(daot.consulta(dtot)) {
                dataEmp.getTxtNom().setText(dtot.getNombre());
                dataEmp.getTxtApe().setText(dtot.getApellido());
                dataEmp.getTxtCor1().setText(dtot.getCorreo());
                dataEmp.getTxtFec().setText(String.valueOf(dtot.getFechaNam()));
                dataEmp.getTxtTd().setText(dtot.getT_Documento());
                dataEmp.getTxtCar().setText(dtot.getCargo());
                dataEmp.getTxtDoc().setText(String.valueOf(dtot.getDocumento()));
                
                
                bem.dispose();
                dataEmp.setVisible(true);
            } else {
                mensaje("El Empleado NO ha Sido Encontrado", "Buscar Empleado");
            }
            
        }
        
        
    }
    
}
