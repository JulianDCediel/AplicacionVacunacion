/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author asanc
 */
public class Conexion {

    //Variables para la coneccion con al dao y dto
    private String DB = "secsalud", USR = "root", KEY = "", HST = "localhost", URL = "jdbc:mysql://" + HST + ":3306/" + DB;
    Connection con = null;

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.URL, this.USR, this.KEY);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al establecer coneccion con la base de datos...", "Conexion", 0);
        }
        return con;
    }

}
