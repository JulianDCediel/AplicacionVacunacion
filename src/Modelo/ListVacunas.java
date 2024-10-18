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
public class ListVacunas {
     public DefaultTableModel mostrarPacientes()
        {
            String [] nombresColumnas = {"No Lote","Fabricante","Cantidad","Producto","Fecha entrega","Fecha vencimiento"};
            String [] registros = new String[6];

            DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);

            String sql = "SELECT * FROM lote";

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
                    registros[0] = rs.getString("No Lote");

                    registros[1] = rs.getString("Fabricante");

                    registros[2] = rs.getString("Cantidad");
                    
                    registros[3] = rs.getString("Apellidos");
                    
                    registros[4] = rs.getString("Producto");
                    
                    registros[5] = rs.getString("Fecha entrega");
                    
                    registros[6] = rs.getString("Fecha vencimiento");
                   

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
