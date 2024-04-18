import java.util.Random;
class Square extends Thread
{
 int x;
 Square(int n)
 {
 x = n;
 }
 public void run()
 {
 int sqr = x * x;
 System.out.println("Square of " + x + " = " + sqr );
 }
}
class Cube extends Thread
{
 int x;
 Cube(int n)
 {
 x = n;
 }
 public void run()
 {
 int cub = x * x * x;
 System.out.println("Cube of " + x + " = " + cub );
 }
}
class Number extends Thread
{
 public void run()
 {
 Random random = new Random();
 for(int i =0; i<10; i++)
 {
 int randomInteger = random.nextInt(100);
 System.out.println("Random Integer generated : " + randomInteger);
 Square s = new Square(randomInteger);
 s.start();
 Cube c = new Cube(randomInteger);
 c.start();
 try {
 Thread.sleep(1000);

 } catch (InterruptedException ex) {
 System.out.println(ex);
}
 }
 }
}
public class Slip7_1{
 public static void main(String args[])
 {
 Number n = new Number();
 n.start();
 }
}




//2


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
   static final String DB_URL = "jdbc:mysql://localhost/";
   static final String USER = "guest";
   static final String PASS = "guest123";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          Statement stmt = conn.createStatement();) {		      
         String sql = "CREATE DATABASE STUDENTS";
         stmt.executeUpdate(sql);
         System.out.println("Database created successfully...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}

public class insert1 { 
    public static void main(String args[]) { 
        String id = "id1"; 
        String pwd = "pwd1"; 
        String fullname = "JAVA"; 
        String email = "Java.com"; 
 
        try { 
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "login1", "pwd1"); 
            Statement stmt = con.createStatement(); 
 
            // Inserting data in database 
            String q1 = "insert into userid values('" +id+ "', '" +pwd+ "', '" +fullname+ "', '" +email+ "')"; 
            int x = stmt.executeUpdate(q1); 
            if (x > 0) 
                System.out.println("Successfully Inserted"); 
            else 
                System.out.println("Insert Failed"); 
 
            con.close(); 
        } 
        catch(Exception e) { 
            System.out.println(e); 
        } 
    } 
}
