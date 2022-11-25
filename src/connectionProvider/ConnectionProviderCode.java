/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectionProvider;
import java.sql.Connection; //RETURN SQL CONNELCTION
import javax.swing.JOptionPane;
import java.sql.DriverManager;
/**
 *
 * @author Girish Doshi
 */
public class ConnectionProviderCode {
    public static Connection getcon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentResultSystem","root","Drashti$1996");
            return con;
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e.toString());
            return null;
        }
    }
    public static void main(String[] args){
        ConnectionProviderCode con = new ConnectionProviderCode();
        Connection c = con.getcon();
    }
}
