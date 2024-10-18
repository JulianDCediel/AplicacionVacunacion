/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asanc
 */
public class ListEmpleados {
     public DefaultTableModel mostrarPacientes()
        {
            String [] nombresColumnas = {"Tipo","Documento","Nombre","Apellidos","Correo","Fecha nacimiento", "Cargo"};
            String [] registros = new String[7];

            DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);

            String sql = "SELECT * FROM usuario";

            Conexion cn = new Conexion();

            PreparedStatement pst = null;

            ResultSet rs = null;

            try
            {
                Connection aux = cn.getConexion();

                pst = aux.prepareStatement(sql);                        

                rs = pst.executeQuery();

                while(rs.next())
                {
                    registros[0] = rs.getString("Tipo");

                    registros[1] = rs.getString("Documento");

                    registros[2] = rs.getString("Nombre");
                    
                    registros[3] = rs.getString("Apellidos");
                    
                    registros[4] = rs.getString("Correo");
                    
                    registros[5] = rs.getString("Fecha nacimiento");
                    
                    registros[6] = rs.getString("Cargo");
                   

                    modelo.addRow(registros);

                }


            }
            catch(SQLException e)
            {

                JOptionPane.showMessageDialog(null,"Error al conectar");

            }
            finally
            {
                try
                {
                    if (rs != null) rs.close();

                    if (pst != null) pst.close();

                    //if (cn != null) cn.close();
                }
                catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
            }
             return modelo;
        }
}
