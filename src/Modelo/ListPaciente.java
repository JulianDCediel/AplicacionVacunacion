/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asanc
 */
public class ListPaciente {
    public DefaultTableModel mostrarPacientes()
        {
            String [] nombresColumnas = {"Tipo","Numero","Nombre","Apellidos","Correo","Regimen","RH"};
            String [] registros = new String[7];

            DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);

            String sql = "SELECT * FROM paciente";

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

                    registros[1] = rs.getString("Numero");

                    registros[2] = rs.getString("Nombre");
                    
                    registros[3] = rs.getString("Apellidos");
                    
                    registros[4] = rs.getString("Nombre");
                    
                    registros[5] = rs.getString("Correo");
                    
                    registros[6] = rs.getString("Regimen");
                    
                    registros[7] = rs.getString("RH");

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
