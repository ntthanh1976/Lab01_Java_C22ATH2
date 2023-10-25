package context;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbContext {
    public String hostname="pc300";
    public String dbName="bookdb";
    public String user="sa";
    public String password="sa";
    
    public Connection getConnection()
    {
        Connection conn =null;
        try {           
            String url = "jdbc:sqlserver://" + hostname + ";databaseName=" + dbName + ";user=" + user +
                    ";password="+ password;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");            
            conn = DriverManager.getConnection(url);          
        } catch (Exception ex) {
            System.out.println("Loi xay ra:" + ex.toString());
        }
        return conn;
    }    
    public static void main(String[] args) {        
        System.out.println(new DbContext().getConnection());       
    }
}
