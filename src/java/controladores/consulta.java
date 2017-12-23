/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class consulta extends Conexion{
    
    public Connection token;
    
    public boolean autentiticacion (String usuario, String contrasena){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try{
            String consulta;
            consulta = "select * from usuario where Login = ? and Password = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1,usuario);
            pst.setString(2, contrasena);
            
            rs = pst.executeQuery();
            
            
            if(rs.absolute(1))
            {
                return true;
            }
            
        
        }catch (Exception e){
            System.err.println("erro" +e);
            
        }finally{
            
            try {
                if(getConexion()!=null) getConexion().close();
                if(pst != null)pst.close();
                if(rs != null) rs.close();
            
            }catch(Exception e){
                    System.err.println("error" + e);
            }
        }
        
        return false;
    }
    
    
    
    /*public int getPrivilegio(String usuario, String contrasena)
    {
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try{
            String consulta;
            consulta = "select * from usuario where Login = ? and Password = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1,usuario);
            pst.setString(2, contrasena);
            
            rs = pst.executeQuery();
            
            if(rs.absolute(1))
                int d = rs.getInt("Tipo_Usuario_idTipo_Usuario");
            {
                return d;
            }
            
        
        }catch (Exception e){
            System.err.println("erro" +e);
            
        }finally{
            
            try {
                if(getConexion()!=null) getConexion().close();
                if(pst != null)pst.close();
                if(rs != null) rs.close();
            
            }catch(Exception e){
                    System.err.println("error" + e);
            }
        }
        return 0;
    }
            
    
    
   /* public ResulSet login (String user, String pass)
    {
        PreparedStatement pst = null;
        ResultSet rs = null;
        
                
        try{
            String consulta;
            String privi;
            consulta = "select * from usuario where Login = ? and Password = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1,user);
            pst.setString(2,pass);
            
            rs = pst.executeQuery();
            privi = rs.getString(3);

            
            
        }catch (Exception e){}*/
        
       /* return 0;*/
      
    

    

}