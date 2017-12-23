/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dartz
 */
public class consulta extends Conexion{
    
    
    
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
    /*public static void main(String[] args)
    {
        consulta co = new consulta();
        System.out.println(co.autentiticacion("dartz160", "avefenix"));
    }*/
    
}
    

