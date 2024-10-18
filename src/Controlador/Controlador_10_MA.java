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

public class Controlador_10_MA implements ActionListener {

    private Login vlog;
    private Menu_Principal_Admin VMPA;
    private Registro_Empleado VRE;
    private Registro_pedidos VRPE;
    private BuscarModificar_Empleado VBME;
    private Buscar_Empleado VBE;
    private Generar_Informes VGI;

    public Controlador_10_MA(Login vlog, Menu_Principal_Admin VMPA, Registro_Empleado VRE, Registro_pedidos VRPE, BuscarModificar_Empleado VBME, Buscar_Empleado VBE, Generar_Informes VGI) {
        this.vlog = vlog;
        this.VMPA = VMPA;
        this.VRE = VRE;
        this.VRPE = VRPE;
        this.VBME = VBME;
        this.VBE = VBE;
        this.VGI = VGI;

        this.VMPA.getBtnCerrarSesion().addActionListener(this);
        this.VMPA.getBtnBuscarEmpleados().addActionListener(this);
        this.VMPA.getBtnEditarEmpleado().addActionListener(this);
        this.VMPA.getBtnRegistrarEmpleado().addActionListener(this);
        this.VMPA.getBtnRegistrarPedidos().addActionListener(this);
        this.VMPA.getBtnGenerarInforme().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(VMPA.getBtnCerrarSesion())) {
            VMPA.dispose();
            vlog.setVisible(true);
        }
        if (e.getSource().equals(VMPA.getBtnRegistrarEmpleado())) {
            VMPA.dispose();
            VRE.setVisible(true);
        }
        if (e.getSource().equals(VMPA.getBtnRegistrarPedidos())) {
            VMPA.dispose();
            VRPE.setVisible(true);
        }
        if (e.getSource().equals(VMPA.getBtnEditarEmpleado())) {
            VMPA.dispose();
            VBME.setVisible(true);
        }
        if (e.getSource().equals(VMPA.getBtnBuscarEmpleados())) {
            VMPA.dispose();
            VBE.setVisible(true);
        }
        if (e.getSource().equals(VMPA.getBtnGenerarInforme())) {
            VMPA.dispose();
            VGI.setVisible(true);
        }

    }

}
