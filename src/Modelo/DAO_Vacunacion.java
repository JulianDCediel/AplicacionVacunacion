/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.mysql.jdbc.ResultSetRow;
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
public class DAO_Vacunacion extends Conexion {

    Connection con = getConexion();

    public boolean insertar(DTO_Vacunacion vac) {

        int cod = 0;
        if (vac.getEps().equals("Sanitas")) {
            cod = 1001;
        } else if (vac.getEps().equals("Compensar")) {
            cod = 1002;
        } else if (vac.getEps().equals("Sura")) {
            cod = 1003;
        } else if (vac.getEps().equals("Salud Total")) {
            cod = 1004;
        }

        PreparedStatement pst;
        String stns = "INSERT INTO vacunacion VALUES(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(stns);
            pst.setDate(1, Date.valueOf(vac.getFecha()));
            pst.setInt(2, vac.getDocP());
            pst.setInt(3, cod);
            pst.setInt(4, vac.getN_dosis());
            pst.setString(5, vac.getLote());
            pst.execute();

            return true;

        } catch (SQLException ex) {
            mensaje("El dato no se pudo insertar...", "Insertar");
            return false;
        }
    }

    public boolean informe(DTO_Vacunacion vac) {
        PreparedStatement pst;
        String stns = "SELECT v.*,lo.*,la.*,p.* from vacunacion as v join lote as lo on v.LOTE_idLote = lo.idLote join laboratorio as la on lo.LABORATORIO_NIT = la.NIT join paciente as p on v.Paciente_idPaciente = p.Documento_Paciente";
        ResultSet rst;
        try {
            pst = con.prepareStatement(stns);
            rst = pst.executeQuery();
            while (rst.next()) {
                vac.setDocP(rst.getInt("v.Paciente_idPaciente"));
                vac.setMarca(rst.getString("la.RazonSocial"));
                vac.setN_dosis(rst.getInt("v.Dosis"));
                vac.setFecha(LocalDate.parse(String.valueOf(rst.getDate("v.Fecha_Aplicada"))));
                vac.setLote(rst.getString("v.LOTE_idLote"));

                DTO_Vacunacion prob = new DTO_Vacunacion();
                prob.setDocP(vac.getDocP());
                prob.setMarca(vac.getMarca());
                prob.setN_dosis(vac.getN_dosis());
                prob.setFecha(vac.getFecha());
                prob.setLote(vac.getLote());
                DataV.L_vac.add(prob);
            }

            return true;

        } catch (SQLException ex) {
            mensaje("El dato no se pudo insertar...", "Insertar");
            return false;
        }

    }

    public boolean informe2(Puestas puesta) {
        PreparedStatement pst;

        String stns = "SELECT v.LOTE_idLote,la.RazonSocial,COUNT(v.LOTE_idLote) puestas from vacunacion as v join lote as lo on v.LOTE_idLote = lo.idLote join laboratorio as la on lo.LABORATORIO_NIT = la.NIT join paciente as p on v.Paciente_idPaciente = p.Documento_Paciente GROUP BY v.LOTE_idLote";
        ResultSet rst;
        try {
            pst = con.prepareStatement(stns);
            rst = pst.executeQuery();
            while (rst.next()) {
                puesta.setPeustas(rst.getInt("puestas"));
                puesta.setLote(rst.getString("v.LOTE_idLote"));

                
                Puestas prob = new Puestas();
                prob.setLote(puesta.getLote());
                prob.setPeustas(puesta.getPeustas());
                DataPuestas.l_pues.add(prob);

            }

            return true;

        } catch (SQLException ex) {
            mensaje("El dato no se pudo insertar...", "Insertar");
            return false;
        }

    }

    public void mensaje(String ms, String tlt) {
        JOptionPane.showMessageDialog(null, ms, tlt, 1);
    }
}
