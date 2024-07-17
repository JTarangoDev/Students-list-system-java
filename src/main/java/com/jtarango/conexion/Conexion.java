package com.jtarango.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConexion(){
        Connection conexion = null;
        var baseDatos = "estudiantes_db";
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var usuario = "root";
        var password = "admin";

        //Cargamos la clase del driver de mysql en memoria
        try {
            //Se inicializa la clase "com.mysql.cj.jdbc.Driver" del driver
            // y se establece la conexion con el metodo .getConnection()
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Ocurrió un error en la conexión: " + e.getMessage());
        }

        return conexion;
    }

    public static void main(String[] args) {
        var conexion = Conexion.getConexion();
        if (conexion != null){
            System.out.println("Conexion exitosa: " + conexion);
        }else {
            System.out.println("Error al conectarse");
        }
    }
}
