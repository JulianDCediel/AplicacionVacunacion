/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DAO_Lote extends Conexion {

    Connection con = getConexion();

    public boolean insertar(DTO_Lote lote) {
        int cod = 0;
        int lab = 0;
        if (lote.getEps().equals("Sanitas")) {
            cod = 1001;
        } else if (lote.getEps().equals("Compensar")) {
            cod = 1002;
        } else if (lote.getEps().equals("Sura")) {
            cod = 1003;
        } else if (lote.getEps().equals("Salud Total")) {
            cod = 1004;
        }

        if (lote.getLab().equals("Moderna")) {
            lab = 500;
        } else if (lote.getLab().equals("Pfizer")) {
            lab = 501;
        } else if (lote.getLab().equals("Sinovac")) {
            lab = 502;
        }
        PreparedStatement pst;
        String stns = "INSERT INTO lote VALUES(?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(stns);
            pst.setString(1, lote.getN_lote());
            pst.setInt(2, cod);
            pst.setString(3, lote.getDetalle());
            pst.setDate(4, Date.valueOf(lote.getF_ven()));
            pst.setDate(5, Date.valueOf(lote.getF_entr()));
            pst.setInt(6, lote.getCantidad());
            pst.setInt(7, lab);
            pst.execute();
            return true;

        } catch (SQLException ex) {
            System.out.println(ex);
            mensaje("El dato no se pudo insertar...", "Insertar");
            return false;
        }
    }

    public boolean informe(DTO_Lote lote) {
        PreparedStatement pst;
        String stns = "SELECT l.*,e.*,la.* from lote as l join eps as e on l.EPS_idEPS = e.idEPS join laboratorio as la on l.LABORATORIO_NIT = la.NIT";
        ResultSet rst;
        try {
            pst = con.prepareStatement(stns);
            rst = pst.executeQuery();

            while (rst.next()) {
                lote.setN_lote(rst.getString("l.idLote"));
                lote.setEps(rst.getString("e.NombreEps"));
                lote.setDetalle(rst.getString("l.DescripcionLote"));
                lote.setF_ven(LocalDate.parse(String.valueOf(rst.getDate("l.FechaVencimiento"))));
                lote.setF_entr(LocalDate.parse(String.valueOf(rst.getDate("l.FechaEntrega"))));
                lote.setCantidad(rst.getInt("l.Cantidad"));
                lote.setLab(rst.getString("la.razonSocial"));
               

                DTO_Lote prob = new DTO_Lote();
                prob.setN_lote(lote.getN_lote());
                prob.setEps(lote.getEps());
                prob.setDetalle(lote.getDetalle());
                prob.setF_ven(lote.getF_ven());
                prob.setF_entr(lote.getF_entr());
                prob.setCantidad(lote.getCantidad());
                prob.setLab(lote.getLab());
                DataL.L_lote.add(prob);

            }

            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            mensaje("El dato no se pudo insertar...", "Insertar");
            return false;
        }
    }

    public void mensaje(String ms, String tlt) {
        JOptionPane.showMessageDialog(null, ms, tlt, 1);
    }
}
