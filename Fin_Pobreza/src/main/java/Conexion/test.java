/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = Conexiondb.getConnection();
        if (con != null) {
            System.out.println("Conexión exitosa");
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    }
    

