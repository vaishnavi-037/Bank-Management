/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsimulator;
import java.sql.*; 
/**
 *
 * @author enggv
 */

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsimulator","root","");    
            s = c.createStatement(); 
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  