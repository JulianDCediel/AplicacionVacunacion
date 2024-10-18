/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author asanc
 */
import Modelo.DAO_Lote;
import Modelo.DAO_Trabajador;
import Modelo.DTO_Lote;
import Modelo.DTO_Trabajador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import vistas_proyecto.Menu_Principal_Admin;
import vistas_proyecto.Registro_Empleado;

public class Controlador_8_RE implements ActionListener {

    private Menu_Principal_Admin VMprinA;
    private Registro_Empleado VRE;
    private DTO_Trabajador dtoTrabajador;
    private DAO_Trabajador daoTrabajador;

    public Controlador_8_RE(Menu_Principal_Admin VMprinA, Registro_Empleado VRE, DTO_Trabajador dtoTrabajador, DAO_Trabajador daoTrabajador) {
        this.VMprinA = VMprinA;
        this.VRE = VRE;
        this.dtoTrabajador = dtoTrabajador;
        this.daoTrabajador = daoTrabajador;

        this.VRE.getBtnRegistrar().addActionListener(this);
        this.VRE.getBtnRegresar().addActionListener(this);
    }

    public void mensaje(String ms, String tlt) {
        JOptionPane.showMessageDialog(null, ms, tlt, 1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(VRE.getBtnRegresar())) {
            VRE.dispose();
            VMprinA.setVisible(true);
        }
        if (e.getSource().equals(VRE.getBtnRegistrar())) {
            dtoTrabajador.setNombre(VRE.getTxtNombre().getText());
            dtoTrabajador.setApellido(VRE.getTxtApellidos().getText());
            dtoTrabajador.setCorreo(VRE.getTxtCorreo().getText());
            dtoTrabajador.setFechaNam(LocalDate.parse(VRE.getTxtFechaNaci().getText()));
            dtoTrabajador.setT_Documento(String.valueOf(VRE.getCmbxT_Documento().getSelectedItem()));
            dtoTrabajador.setCargo(VRE.getTxtCargo().getText());
            dtoTrabajador.setDocumento(Integer.parseInt(VRE.getTxtNumeroDocumento().getText()));
            dtoTrabajador.setTelefono(Integer.parseInt(VRE.getTxt_telef().getText()));
            dtoTrabajador.setContra(String.valueOf(VRE.getTxtContraseña().getPassword()));
            if (daoTrabajador.insertar(dtoTrabajador)) {
                mensaje("EMPLEADO AGREGADO", "REGISTRO");
                VRE.dispose();
                VMprinA.setVisible(true);
            } else {

                System.out.println(dtoTrabajador.getNombre());
                System.out.println(dtoTrabajador.getApellido());
                System.out.println(dtoTrabajador.getCargo());
                System.out.println(dtoTrabajador.getCorreo());
                System.out.println(dtoTrabajador.getFechaNam());
                System.out.println(dtoTrabajador.getTelefono());
                System.out.println(dtoTrabajador.getT_Documento());
                System.out.println(dtoTrabajador.getDocumento());
                mensaje("DATOS INVALIDOS", "REGISTRO");
            }
        }
    }

}
