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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asanc
 */
public class DAO_Paciente extends Conexion {

    Connection con = getConexion();

    public boolean insertar(DTO_Paciente paciente) {

        int cod = 0;
        if (paciente.getEps().equals("Sanitas")) {
            cod = 1001;
        } else if (paciente.getEps().equals("Compensar")) {
            cod = 1002;
        } else if (paciente.getEps().equals("Sura")) {
            cod = 1003;
        } else if (paciente.getEps().equals("Salud Total")) {
            cod = 1004;
        }
        PreparedStatement pst;
        String stns = "INSERT INTO paciente VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            pst = con.prepareStatement(stns);
            pst.setInt(1, paciente.getDocumento());
            pst.setString(2, paciente.getNombre());
            pst.setString(3, paciente.getApellido());
            pst.setDate(4, Date.valueOf(paciente.getFechaN()));
            pst.setString(5, paciente.getCorreo());
            pst.setString(6, paciente.getRegimen());
            pst.setInt(7, cod);
            pst.setString(8, paciente.getT_Sangre());
            pst.setString(9, paciente.getT_Documento());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            mensaje("El dato no se pudo insertar...", "Insertar");
            return false;
        }
    }

    public boolean actulizar(DTO_Paciente paciente) {

        int cod = 0;
        if (paciente.getEps().equals("Sanitas")) {
            cod = 1001;
        } else if (paciente.getEps().equals("Compensar")) {
            cod = 1002;
        } else if (paciente.getEps().equals("Sura")) {
            cod = 1003;
        } else if (paciente.getEps().equals("Salud Total")) {
            cod = 1004;
        }
        int id = paciente.getDocumento();
        PreparedStatement pst;
        String stm = "UPDATE paciente SET Nombre=?,Apellido=?,Fecha_Nacimiento=?,Correo=?,TipoRegimen=?,EPS_idEPS1=?,GrupoSanguineo=?,TipoDocumento=? WHERE Documento_Paciente=" + id;

        try {
            pst = con.prepareStatement(stm);

            pst.setString(1, paciente.getNombre());
            pst.setString(2, paciente.getApellido());
            pst.setDate(3, Date.valueOf(paciente.getFechaN()));
            pst.setString(4, paciente.getCorreo());
            pst.setString(5, paciente.getRegimen());
            pst.setInt(6, cod);
            pst.setString(7, paciente.getT_Sangre());
            pst.setString(8, paciente.getT_Documento());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            mensaje("El dato no se pudo insertar...", "Insertar");
            return false;
        }

    }

    public boolean eliminar(DTO_Paciente paciente) {
        eliminarVacunacion(paciente);
        PreparedStatement pst;
        String stm = "DELETE FROM paciente WHERE Documento_Paciente = ?";

        try {
            pst = con.prepareStatement(stm);
            pst.setInt(1, paciente.getDocumento());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            mensaje("No se pudo eliminar el registro", "ELIMINARs");
            return false;
        }
    }

        public boolean eliminarVacunacion(DTO_Paciente paciente) {
        PreparedStatement pst;
        String stm = "DELETE FROM vacunacion WHERE Paciente_idPaciente = ?";

        try {
            pst = con.prepareStatement(stm);
            pst.setInt(1, paciente.getDocumento());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            mensaje("No se pudo eliminar el registro", "ELIMINARs");
            return false;
        }
    }
    public boolean validar(DTO_Paciente paciente) {
        Connection con = getConexion();
        PreparedStatement pst;
        System.out.println(paciente.getT_Documento());
        String stm = "SELECT P.*, E.* FROM paciente as P join eps as E on P.EPS_idEPS1 = E.idEPS WHERE P.Documento_Paciente = ?";
        ResultSet rst;
        try {
            pst = con.prepareStatement(stm);
            pst.setInt(1, paciente.getDocumento());
            rst = pst.executeQuery();
            if (rst.next()) {
                paciente.setDocumento(rst.getInt("P.Documento_Paciente"));
                paciente.setNombre(rst.getString("P.Nombre"));
                paciente.setApellido(rst.getString("P.Apellido"));
                paciente.setFechaN(LocalDate.parse(String.valueOf(rst.getDate("P.Fecha_Nacimiento"))));
                paciente.setCorreo(rst.getString("P.Correo"));
                paciente.setRegimen(rst.getString("P.TipoRegimen"));
                paciente.setEps(rst.getString("E.NombreEps"));
                paciente.setT_Sangre(rst.getString("P.GrupoSanguineo"));
                paciente.setT_Documento(rst.getString("P.TipoDocumento"));
                return true;
            } else {
                mensaje("documento invalido", "Modificar");
                return false;
            }
        } catch (SQLException ex) {
            mensaje("Error al ejecutar la sentencia SQL...", "");
            return false;
        }
    }

    public boolean informe(DTO_Paciente paciente) {
        Connection con = getConexion();
        PreparedStatement pst;

        String stm = "SELECT P.*, E.* FROM paciente as P join eps as E on P.EPS_idEPS1 = E.idEPS";
        ResultSet rst;
        try {
            pst = con.prepareStatement(stm);
            rst = pst.executeQuery();
            while (rst.next()) {
                paciente.setDocumento(rst.getInt("P.Documento_Paciente"));
                paciente.setNombre(rst.getString("P.Nombre"));
                paciente.setApellido(rst.getString("P.Apellido"));
                paciente.setFechaN(LocalDate.parse(String.valueOf(rst.getDate("P.Fecha_Nacimiento"))));
                paciente.setCorreo(rst.getString("P.Correo"));
                paciente.setRegimen(rst.getString("P.TipoRegimen"));
                paciente.setEps(rst.getString("E.NombreEps"));
                paciente.setT_Sangre(rst.getString("P.GrupoSanguineo"));
                paciente.setT_Documento(rst.getString("P.TipoDocumento"));
 
                DTO_Paciente prob  = new DTO_Paciente();
                prob.setDocumento(paciente.getDocumento());
                prob.setNombre(paciente.getNombre());
                prob.setApellido(paciente.getApellido());
                prob.setT_Sangre(paciente.getT_Sangre());
                prob.setRegimen(paciente.getRegimen());
                prob.setT_Documento(paciente.getT_Documento());
                prob.setCorreo(paciente.getCorreo());
                DataP.L_pac.add(prob);

            }
 
            return true;

        } catch (SQLException ex) {
            mensaje("Error al ejecutar la sentencia SQL...", "");
            return false;
        }
    }

    public void mensaje(String ms, String tlt) {
        JOptionPane.showMessageDialog(null, ms, tlt, 1);
    }
}
