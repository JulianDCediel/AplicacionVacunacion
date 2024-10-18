/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DAO_Lote;
import Modelo.DTO_Lote;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import vistas_proyecto.Menu_Principal_Admin;
import vistas_proyecto.Registro_pedidos;

/**
 *
 * @author asanc
 */
public class Controlador_9_RP implements ActionListener{
    private Registro_pedidos vRegistroPedi;
    private Menu_Principal_Admin VMprinA;
    private DTO_Lote dtoLote;
    private DAO_Lote daoLote;

    public Controlador_9_RP(Registro_pedidos vRegistroPedi, Menu_Principal_Admin VMprinA, DTO_Lote dtoLote, DAO_Lote daoLote) {
        this.vRegistroPedi = vRegistroPedi;
        this.VMprinA = VMprinA;
        this.dtoLote = dtoLote;
        this.daoLote = daoLote;
        
        this.vRegistroPedi.getBtnRegresar().addActionListener(this);
        this.vRegistroPedi.getBtnRegistrar().addActionListener(this);
    }
    
    public void mensaje(String ms, String tlt) {
           JOptionPane.showMessageDialog(null, ms, tlt, 1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vRegistroPedi.getBtnRegresar()){
            vRegistroPedi.dispose();
            VMprinA.setVisible(true);
        }
        
        if(e.getSource().equals(vRegistroPedi.getBtnRegistrar())){
            dtoLote.setCantidad(Integer.parseInt(vRegistroPedi.getTxtCantidadV().getText()));
            dtoLote.setDetalle(vRegistroPedi.getTxtNombreProduct().getText());
            dtoLote.setEps(vRegistroPedi.getTxtEpsDirigida().getText());
            dtoLote.setF_entr(LocalDate.parse(vRegistroPedi.getTxtFechaEntre().getText()));
            dtoLote.setLab(vRegistroPedi.getTxtFabricante().getText());
            dtoLote.setN_lote(vRegistroPedi.getTxtNumerodeLote().getText());
            dtoLote.setF_ven(LocalDate.parse(vRegistroPedi.getTxtFechaVenci().getText()));
            if(daoLote.insertar(dtoLote)){
                mensaje("PEDIDO AGREGADO", "REGISTRO");
                vRegistroPedi.dispose();
                VMprinA.setVisible(true);
            }else{
                mensaje("DATOS INVALIDOS", "REGISTRO");
            }
        }
    }
    
    
}
