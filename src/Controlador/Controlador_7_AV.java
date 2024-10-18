/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DAO_Paciente;
import Modelo.DAO_Trabajador;
import Modelo.DAO_Vacunacion;
import Modelo.DTO_Paciente;
import Modelo.DTO_Trabajador;
import Modelo.DTO_Vacunacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import vistas_proyecto.Admin_Vacunas;
import vistas_proyecto.Menu_Principal;

/**
 *
 * @author User
 */
public class Controlador_7_AV implements ActionListener {

    private DTO_Vacunacion dtoVac;
    private DAO_Vacunacion daoVac;
    private Admin_Vacunas Vav;
    private Menu_Principal VMprinV;

    public Controlador_7_AV(DTO_Vacunacion dtoVac, DAO_Vacunacion daoVac, Admin_Vacunas Vav, Menu_Principal VMprinV) {
        this.dtoVac = dtoVac;
        this.daoVac = daoVac;
        this.Vav = Vav;
        this.VMprinV = VMprinV;

        this.Vav.getBt_regis().addActionListener(this);
        this.Vav.getBtnRegresar().addActionListener(this);
    }

    public void mensaje(String ms, String tlt) {
        JOptionPane.showMessageDialog(null, ms, tlt, 1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(Vav.getBtnRegresar())) {
            Vav.dispose();
            VMprinV.setVisible(true);
        }

        if (e.getSource().equals(Vav.getBt_regis())) {
            dtoVac.setDocP(Integer.parseInt(Vav.getTxt_docP().getText()));
            dtoVac.setLote(Vav.getTxt_lote().getText());
            dtoVac.setFecha(LocalDate.now());
            dtoVac.setMarca(Vav.getTxt_marca().getText());
            dtoVac.setN_dosis(Integer.parseInt(Vav.getTxt_dosis().getText()));
            dtoVac.setEps(Vav.getTxt_eps().getText());

            if (daoVac.insertar(dtoVac)) {
                mensaje("Vacuna puesta", "vacunacion");
                Vav.dispose();
                VMprinV.setVisible(true);
            }
        }
    }

}
