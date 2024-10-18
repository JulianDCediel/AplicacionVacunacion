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

import vistas_proyecto.Menu_Principal_Admin;
import vistas_proyecto.Modificar_Empleado;

/**
 *
 * @author Franquito UwU
 */
public class Controlador_EditarEmpleado implements ActionListener {

    private DTO_Trabajador tra;
    private DAO_Trabajador dtra;
    private Modificar_Empleado modE;
    private Menu_Principal_Admin mnuA;

    public Controlador_EditarEmpleado(DTO_Trabajador tra, DAO_Trabajador dtra, Modificar_Empleado modE, Menu_Principal_Admin mnuA) {
        this.tra = tra;
        this.dtra = dtra;
        this.modE = modE;
        this.mnuA = mnuA;

        this.modE.getBtnRegresar().addActionListener(this);
        this.modE.getBtnDel().addActionListener(this);
        this.modE.getBtnMod().addActionListener(this);
    }

    public void mensaje(String ms, String tlt) {
        JOptionPane.showMessageDialog(null, ms, tlt, 1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(modE.getBtnRegresar())) {
            modE.dispose();
            mnuA.setVisible(true);
        }

        if (e.getSource().equals(modE.getBtnMod())) {
            tra.setNombre(modE.getTxtNom().getText());
            tra.setApellido(modE.getTxtApe().getText());
            tra.setCorreo(modE.getTxtCor1().getText());
            tra.setT_Documento(modE.getTxtDoc().getText());
            tra.setContra(String.valueOf(modE.getTxtCon().getPassword()));
            tra.setCargo(modE.getTxtCar().getText());
            tra.setFechaNam(LocalDate.parse(modE.getTxtFec().getText()));
            tra.setTelefono(Integer.parseInt(modE.getTxt_telef().getText()));

            if (dtra.actulizar(tra)) {
                mensaje("PACIENTE ACTUALIZADO", "MODIFICAR");
                modE.dispose();
                mnuA.setVisible(true);
            }
        }

        if (e.getSource().equals(modE.getBtnDel())) {
            String[] arreglo = {"SI", "NO"};
            int op = JOptionPane.showOptionDialog(null, "¿ESTA SEGURO QUE DESEA ELIMINAR EL EMPLEADO?", "ELIMINAR", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "NO");
            if (arreglo[op].equals("SI")) {
                if (dtra.eliminar(tra)) {
                    mensaje("TRABAJADOR ELIMINADO", "ELIMINAR");
                    modE.dispose();
                    mnuA.setVisible(true);
                }
            }

        }

    }
}
