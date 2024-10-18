/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas_proyecto.BuscarModificar_Empleado;
import vistas_proyecto.Buscar_Empleado;
import vistas_proyecto.Generar_Informes;
import vistas_proyecto.Login;
import vistas_proyecto.Menu_Principal_Admin;
import vistas_proyecto.Registro_Empleado;
import vistas_proyecto.Registro_pedidos;

/**
 *
 * @author User
 */
public class Controlador_3_MA implements ActionListener {

    private Login vlog;
    private Menu_Principal_Admin VMprinA;
    private Registro_Empleado VRE;
    private BuscarModificar_Empleado VME;
    private Generar_Informes G_in;
    private Registro_pedidos Rped;
    private Buscar_Empleado bem;

    public Controlador_3_MA(Login vlog, Menu_Principal_Admin VMprinA, Registro_Empleado VRE, BuscarModificar_Empleado VME, Generar_Informes G_in, Buscar_Empleado bem) {
        this.vlog = vlog;
        this.VMprinA = VMprinA;
        this.VRE = VRE;
        this.VME = VME;
        this.G_in = G_in;
        this.bem = bem;
        
        this.VMprinA.getBtnRegistrarEmpleado().addActionListener(this);
        this.VMprinA.getBtnBuscarEmpleados().addActionListener(this);
        this.VMprinA.getBtnEditarEmpleado().addActionListener(this);
        this.VMprinA.getBtnGenerarInforme().addActionListener(this);
        this.VMprinA.getBtnRegistrarPedidos().addActionListener(this);
        this.VMprinA.getBtnCerrarSesion().addActionListener(this);
        this.VMprinA.getBtnRegistrarPedidos().addActionListener(this);

    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(VMprinA.getBtnCerrarSesion())) {
            VMprinA.dispose();
            vlog.setVisible(true);
        }
        if (e.getSource().equals(VMprinA.getBtnRegistrarEmpleado())) {
            VMprinA.dispose();
            VRE.setVisible(true);
        }
         if (e.getSource().equals(VMprinA.getBtnEditarEmpleado())) {
            VMprinA.dispose();
            VME.setVisible(true);
        }
         if (e.getSource().equals(VMprinA.getBtnGenerarInforme())) {
            VMprinA.dispose();
            G_in.setVisible(true);
        }
        if (e.getSource().equals(VMprinA.getBtnRegistrarPedidos())) {
            VMprinA.dispose();
            Rped.setVisible(true);
        }
        
        if(e.getSource().equals(VMprinA.getBtnBuscarEmpleados())) {
            VMprinA.dispose();
            bem.setVisible(true);
        }
    }

}
