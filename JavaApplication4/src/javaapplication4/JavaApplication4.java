/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class JavaApplication4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
       try{ 
        //step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@172.16.0.70:1521:cas","fdp38","fdp38"); 
     
    if (con!=null){
        System.out.println("Connected with oracle");
        //step3 create the statement object  
        Statement stmt=con.createStatement();  
  //step4 execute query  
        ResultSet rs=stmt.executeQuery("select * from addressbook");  
        while(rs.next())  
        System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
  //step5 close the connection object  
       }con.close();
       
    }catch(Exception e){System.out.println(e); }
  }
}