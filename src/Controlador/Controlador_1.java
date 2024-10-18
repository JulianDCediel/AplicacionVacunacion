package Controlador;

import Modelo.DAO_Trabajador;
import Modelo.DTO_Trabajador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas_proyecto.Login;
import vistas_proyecto.Menu_Principal;
import vistas_proyecto.Menu_Principal_Admin;

public class Controlador_1 implements ActionListener {

    private Login vlog;
    private Menu_Principal VMprinV;
    private Menu_Principal_Admin VMprinA;
    private DTO_Trabajador dtoT;
    private DAO_Trabajador daoT;

    public Controlador_1(Login vlog, Menu_Principal VMprinV, Menu_Principal_Admin VMprinA, DTO_Trabajador dtoT, DAO_Trabajador daoT) {
        this.vlog = vlog;
        this.VMprinV = VMprinV;
        this.VMprinA = VMprinA;
        this.dtoT = dtoT;
        this.daoT = daoT;
        this.vlog.getBtnIniciar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vlog.getBtnIniciar())) {
            dtoT.setCorreo(vlog.getLabelCorreo().getText());
            dtoT.setContra(String.valueOf(vlog.getLabelContraseña().getPassword()));

            if (daoT.validar(dtoT)) {
                vlog.getLabelCorreo().setText(null);
                vlog.getLabelContraseña().setText(null);
                
                if (dtoT.getCargo().equals("Personal Medico")) {
                    vlog.dispose();
                    VMprinV.setVisible(true);
                } else if (dtoT.getCargo().equals("Administrativo")) {
                    vlog.dispose();
                    VMprinA.setVisible(true);
                }
            }
        }
    }

}
