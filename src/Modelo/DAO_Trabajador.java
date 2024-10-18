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
 * @author ESTUDIANTE
 */
public class DAO_Trabajador extends Conexion {

    Connection con = getConexion();

    public boolean insertar(DTO_Trabajador trab) {
        int cod = 0;
        if (trab.getCargo().equals("Personal Medico")) {
            cod = 501;
        } else if (trab.getCargo().equals("Administrativo")) {
            cod = 502;
        }

        PreparedStatement pst;
        String stns = "INSERT INTO usuario VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement pst2;
        String stm = "INSERT INTO CORREO VALUES(?,?)";
        try {

            pst2 = con.prepareStatement(stm);
            pst2.setString(1, trab.getCorreo());
            pst2.setString(2, trab.getContra());
            pst2.execute();

            pst = con.prepareStatement(stns);
            pst.setInt(1, trab.getDocumento());
            pst.setString(2, trab.getNombre());
            pst.setString(3, trab.getApellido());
            pst.setDate(4, Date.valueOf(trab.getFechaNam()));
            pst.setString(5, trab.getT_Documento());
            pst.setInt(6, trab.getTelefono());
            pst.setString(7, trab.getCorreo());
            pst.setInt(8, cod);
            pst.execute();

            return true;

        } catch (SQLException ex) {
            mensaje("El dato no se pudo insertar...", "Insertar");
            return false;
        }

    }

    public boolean actulizar(DTO_Trabajador trab) {

        int id = trab.getDocumento();
        int cod = 0;
        if (trab.getCargo().equals("Personal Medico")) {
            cod = 501;
        } else if (trab.getCargo().equals("Administrativo")) {
            cod = 502;
        }
        PreparedStatement pst;
        String stns = "UPDATE usuario set(?,?,?,?,?,?,?,?) where Documento_Usuario = " + id;
        PreparedStatement pst2;
        String stm = "UPDATE correo join usuario on correo.Correo = usuario.Correo_Correo set correo.Correo = ?,correo.Contrasena = ? where usuario.Documento_Usuario= " + id;
        try {
            pst = con.prepareStatement(stns);

            pst.setString(1, trab.getNombre());
            pst.setString(2, trab.getApellido());
            pst.setDate(3, Date.valueOf(trab.getFechaNam()));
            pst.setString(4, trab.getT_Documento());
            pst.setInt(5, trab.getTelefono());
            pst.setString(6, trab.getCorreo());
            pst.setInt(7, cod);
            pst.execute();

            pst2 = con.prepareStatement(stm);
            pst2.setString(1, trab.getCorreo());
            pst2.setString(2, trab.getContra());
            pst2.execute();
            return true;

        } catch (SQLException ex) {
            mensaje("El dato no se pudo insertar...", "Insertar");
            return false;
        }
    }

    public boolean consulta(DTO_Trabajador trab) {

        PreparedStatement pst;
        String stm = "SELECT U.*,C.*,Ca.* FROM USUARIO as U join CORREO as C on U.Correo_Correo = C.Correo join CARGO as Ca on Ca.idCargo = U.Cargo_idCargo WHERE U.Documento_Usuario = ?";
        ResultSet rst;
        try {
            pst = con.prepareStatement(stm);
            pst.setInt(1, trab.getDocumento());
            rst = pst.executeQuery();
            if (rst.next()) {
                trab.setDocumento(rst.getInt("Documento_Usuario"));
                trab.setNombre(rst.getString("NombreUsuario"));
                trab.setApellido(rst.getString("ApellidoUsuario"));
                trab.setFechaNam(LocalDate.parse(rst.getString("FechaNacimiento")));
                trab.setT_Documento(rst.getString("TipoDocumento"));
                trab.setCorreo(rst.getString("Correo"));
                trab.setCargo(rst.getString("CargoNombre"));
                trab.setContra(rst.getString("Contrasena"));
                trab.setTelefono(rst.getInt("U.Telefono"));
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            mensaje("Error al ejecutar la sentencia SQL...", "");
            return false;
        }
    }

    public boolean eliminar(DTO_Trabajador trab) {

        PreparedStatement pst;
        String stm = "DELETE FROM USUARIO WHERE Documento_Usuario = ?";
        PreparedStatement pst2;
        String stm2 = "DELETE FROM CORREO WHERE Correo = ?";
        try {
            pst = con.prepareStatement(stm);
            pst.setInt(1, trab.getDocumento());
            pst.execute();
            pst2 = con.prepareStatement(stm2);
            pst2.setString(1, trab.getCorreo());
            pst2.execute();
            return true;
        } catch (SQLException ex) {
            mensaje("", "");
            return false;
        }
    }

    public boolean validar(DTO_Trabajador trab) {

        PreparedStatement pst;

        String stm = "SELECT U.*,C.*,Ca.* FROM usuario as U join correo as C on U.Correo_Correo = C.Correo join cargo as Ca on Ca.idCargo = U.Cargo_idCargo WHERE C.Correo = ? and C.Contrasena = ?";
        ResultSet rst;
        try {
            pst = con.prepareStatement(stm);
            pst.setString(1, trab.getCorreo());
            pst.setString(2, trab.getContra());
            rst = pst.executeQuery();
            if (rst.next()) {
                trab.setDocumento(rst.getInt("U.Documento_Usuario"));
                trab.setNombre(rst.getString("U.NombreUsuario"));
                trab.setApellido(rst.getString("U.ApellidoUsuario"));
                trab.setFechaNam(LocalDate.parse(rst.getString("U.FechaNacimiento")));
                trab.setT_Documento(rst.getString("U.TipoDocumento"));
                trab.setCorreo(rst.getString("U.Correo_Correo"));
                trab.setCargo(rst.getString("Ca.CargoNombre"));
                trab.setContra(rst.getString("C.Contrasena"));
                return true;
            } else {
                mensaje("correo o contraseña incorrectos", "Login");
                return false;
            }
        } catch (SQLException ex) {
            mensaje("Error al ejecutar la sentencia SQL...", "");
            return false;
        }
    }

    public boolean validarEdit(DTO_Trabajador trab) {
        PreparedStatement pst;

        String stm = "SELECT U.*,C.*,Ca.* FROM usuario as U join correo as C on U.Correo_Correo = C.Correo join cargo as Ca on Ca.idCargo = U.Cargo_idCargo WHERE U.Documento_Usuario = ?";
        ResultSet rst;
        try {
            pst = con.prepareStatement(stm);
            pst.setInt(1, trab.getDocumento());
            rst = pst.executeQuery();
            if (rst.next()) {
                trab.setDocumento(rst.getInt("U.Documento_Usuario"));
                trab.setNombre(rst.getString("U.NombreUsuario"));
                trab.setApellido(rst.getString("U.ApellidoUsuario"));
                trab.setFechaNam(LocalDate.parse(rst.getString("U.FechaNacimiento")));
                trab.setT_Documento(rst.getString("U.TipoDocumento"));
                trab.setCorreo(rst.getString("C.Correo"));
                trab.setCargo(rst.getString("Ca.CargoNombre"));
                trab.setContra(rst.getString("C.Contrasena"));
                trab.setTelefono(rst.getInt("U.Telefono"));
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

    public boolean informe(DTO_Trabajador trab) {

        PreparedStatement pst;
        String stm = "SELECT U.*,C.*,Ca.* FROM USUARIO as U join CORREO as C on U.Correo_Correo = C.Correo join CARGO as Ca on Ca.idCargo = U.Cargo_idCargo";
        ResultSet rst;
        try {
            pst = con.prepareStatement(stm);
            rst = pst.executeQuery();
            while (rst.next()) {
                trab.setDocumento(rst.getInt("Documento_Usuario"));
                trab.setNombre(rst.getString("NombreUsuario"));
                trab.setApellido(rst.getString("ApellidoUsuario"));
                trab.setFechaNam(LocalDate.parse(rst.getString("FechaNacimiento")));
                trab.setT_Documento(rst.getString("TipoDocumento"));
                trab.setCorreo(rst.getString("Correo_Correo"));
                trab.setCargo(rst.getString("CargoNombre"));
                trab.setContra(rst.getString("Contrasena"));

                DTO_Trabajador prob = new DTO_Trabajador();
                prob.setDocumento(trab.getDocumento());
                prob.setNombre(trab.getNombre());
                prob.setApellido(trab.getApellido());
                prob.setFechaNam(trab.getFechaNam());
                prob.setT_Documento(trab.getT_Documento());
                prob.setCorreo(trab.getCorreo());
                prob.setCargo(trab.getCargo());
                prob.setContra(trab.getContra());
                DataE.L_E.add(prob);

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
