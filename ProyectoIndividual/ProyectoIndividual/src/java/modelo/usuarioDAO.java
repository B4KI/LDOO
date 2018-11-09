/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yair
 */
public class usuarioDAO {
    
    private Connection conexion;
    
    private void abrirConexion() throws SQLException{
        String dbURI="jdbc:derby://localhost:1527/ProyectoIndividual";
        String username="fcfm";
        String password="lsti01";
        conexion=DriverManager.getConnection(dbURI,username,password);
    }
    
    private void cerrarConexion() throws SQLException{ 
        conexion.close();
        
    }


    public void insertar(usuario u) throws SQLException{
        String a= u.getCorreo();
        String b = u.getPassword();
        abrirConexion();
        
        try{
        String sql = "INSERT INTO Datos VALUES('" + a + "','" + b + "')";
        Statement stmt = conexion.createStatement();
        stmt.executeUpdate(sql);
        }catch(SQLException e){}
        cerrarConexion();
    }
    
     public List buscar()throws SQLException{
        ResultSet mensajes;
        
        List beans = new ArrayList();
        abrirConexion();
        try{
            String sql = "SELECT * FROM FCFM.DATOS";
            Statement stmt = conexion.createStatement();
            mensajes= stmt.executeQuery(sql);
        
            while(mensajes.next()){
                String  CORREO = mensajes.getString("CORREO");
                String PASSWORD = mensajes.getString("PASSWORD");
                
                usuario c = new usuario();
                c.setCorreo(CORREO);
                c.setPassword(PASSWORD);
                beans.add(c);  
                
            }   
        }catch(SQLException e){}
            
            cerrarConexion();
            return beans;
        
        
    }
}