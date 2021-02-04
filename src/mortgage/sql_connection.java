/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mortgage;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author prime
 */
public class sql_connection 
{
    Connection cin = null;
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:G:\\Netbeans project\\Database\\mort.db");
            JOptionPane.showMessageDialog(null , "Connection Established");
            return con;
            
        }
        
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null , e);
            return null;
        }
        
    }
    
}
