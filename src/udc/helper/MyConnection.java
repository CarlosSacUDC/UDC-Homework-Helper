package udc.helper;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author carlos
 */
public class MyConnection {
    
    public Connection getConnection(){
        Connection newCon = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            newCon = DriverManager.getConnection("jdbc:mysql://localhost/java_login_register","root","");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return newCon;
    }
        
    
}
