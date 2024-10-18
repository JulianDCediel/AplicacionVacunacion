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
import vistas_proyecto.Admin_Vacunas;
import vistas_proyecto.BuscarModificar_Paciente;
import vistas_proyecto.Login;
import vistas_proyecto.Menu_Principal;
import vistas_proyecto.Registro_Paciente;

/**
 *
 * @author User
 */
public class Controlador_2_MV implements ActionListener {

    private Login vlog;
    private Menu_Principal VMprinV;
    private Registro_Paciente VRP;
    private BuscarModificar_Paciente VMP;
    private Admin_Vacunas VAV;
    private DTO_Trabajador dtoT;
    private DAO_Trabajador daoT;

    public Controlador_2_MV(Login vlog, Menu_Principal VMprinV, Registro_Paciente VRP, BuscarModificar_Paciente VMP, Admin_Vacunas VAV, DTO_Trabajador dtoT, DAO_Trabajador daoT) {
        this.vlog = vlog;
        this.VMprinV = VMprinV;
        this.VRP = VRP;
        this.VMP = VMP;
        this.VAV = VAV;
        this.dtoT = dtoT;
        this.daoT = daoT;
        this.VMprinV.getBtnAdministrarVacunas().addActionListener(this);
        this.VMprinV.getBtnEditarPaciente().addActionListener(this);
        this.VMprinV.getBtnRegistrarPaciente().addActionListener(this);
        this.VMprinV.getBtnCerrarSesion().addActionListener(this);
    }

 
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(VMprinV.getBtnCerrarSesion())) {
            VMprinV.dispose();
            vlog.setVisible(true);
        }
        if (e.getSource().equals(VMprinV.getBtnRegistrarPaciente())) {
            VMprinV.dispose();
            VRP.setVisible(true);
        }
        if (e.getSource().equals(VMprinV.getBtnEditarPaciente())) {
            VMprinV.dispose();
            VMP.setVisible(true);
        }
        if (e.getSource().equals(VMprinV.getBtnAdministrarVacunas())) {
            VAV.getTxt_docE().setText(String.valueOf(dtoT.getDocumento()));
            VAV.getComB_tdE().setSelectedItem(dtoT.getT_Documento());
            VAV.getTxt_docE().setEditable(false);
            VAV.getComB_tdE().setEnabled(false);
            String fecha = String.valueOf(LocalDate.now());
            VAV.getTxt_fecha().setText(fecha);
           
            VMprinV.dispose();
            VAV.setVisible(true);
        }
    }
}
