/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DAO_Trabajador;
import Modelo.DTO_Trabajador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vistas_proyecto.BuscarModificar_Empleado;
import vistas_proyecto.Menu_Principal_Admin;
import vistas_proyecto.Modificar_Empleado;

/**
 *
 * @author Franquito UwU
 */
public class Controlador_BuscarEditarEmpleado implements ActionListener {

    private DTO_Trabajador tra;
    private DAO_Trabajador dtra;
    private BuscarModificar_Empleado modE;
    private Modificar_Empleado modE2;
    private Menu_Principal_Admin mnuA;

    public Controlador_BuscarEditarEmpleado(DTO_Trabajador tra, DAO_Trabajador dtra, BuscarModificar_Empleado modE, Modificar_Empleado modE2, Menu_Principal_Admin mnuA) {
        this.tra = tra;
        this.dtra = dtra;
        this.modE = modE;
        this.modE2 = modE2;
        this.mnuA = mnuA;
        this.modE.getBtnContinuar().addActionListener(this);
        this.modE.getBtnRegresar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(modE.getBtnContinuar())) {
            tra.setDocumento(Integer.parseInt(modE.getTxtNumDoc().getText()));
            if (dtra.validarEdit(tra)) {

                modE2.getTxtNom().setText(tra.getNombre());
                modE2.getTxtApe().setText(tra.getApellido());
                modE2.getTxt_telef().setText(String.valueOf(tra.getTelefono()));
                System.out.println(tra.getTelefono());
                modE2.getTxtCar().setText(tra.getCargo());
                modE2.getTxtCor1().setText(tra.getCorreo());
                modE2.getTxtTd().setText(tra.getT_Documento());
                modE2.getTxtDoc().setText(String.valueOf(tra.getDocumento()));
                modE2.getTxtFec().setText(String.valueOf(tra.getFechaNam()));
                modE.dispose();
                modE2.setVisible(true);
            } else {
                mensaje("El Registro NO ha Sido Encontrado", "Buscar Editar Empleado");
            }

        }

        if (e.getSource().equals(modE.getBtnRegresar())) {
            modE.dispose();
            mnuA.setVisible(true);
        }
    }

    public void mensaje(String ms, String tlt) {
        JOptionPane.showMessageDialog(null, ms, tlt, 1);
    }
}
