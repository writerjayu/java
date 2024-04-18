import java.sql.*;

public class DBMetaData {
    public static void main(String[] args) {
        ResultSet rs = null;
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/dbtry", "postgres", "redhat");
            DatabaseMetaData dbmd = conn.getMetaData();
            System.out.println("Database Product name = " + dbmd.getDatabaseProductName());
            System.out.println("User name = " + dbmd.getUserName());
            System.out.println("Database driver name= " + dbmd.getDriverName());
            System.out.println("Database driver version = " + dbmd.getDriverVersion());
            System.out.println("Database product name = " + dbmd.getDatabaseProductName());
            System.out.println("Database Version = " + dbmd.getDriverMajorVersion());
            rs = dbmd.getTables(null, null, null, new String[]{"TABLE"});
            System.out.println("List of tables...");
            while (rs.next()) {
                String tblName = rs.getString("TABLE_NAME");
                System.out.println("Table : " + tblName);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//2


import java.lang.Math;
class MyThread extends Thread 
{
 public MyThread(String s) 
{ 
super(s); 
} 
public void run() 
{ 
System.out.println(getName()+"thread created."); 
while(true) 
{ 
System.out.println(this); 
int s=(int)(Math.random()*5000); 
System.out.println(getName()+"is sleeping for :"+s+"msec"); 
try{ 
Thread.sleep(s); 
} 
catch(Exception e) 
{ 
} 
} 
}
} 
class s13_2
{ 
public static void main(String args[]) 
{ 
      MyThread t1=new MyThread("shradha"),t2=new MyThread("pooja"); 
       t1.start(); 
       t2.start(); 
         try 
         { 
           t1.join(); 
            t2.join(); 
            } 
         catch(Exception e) 
             { 
             } 
             System.out.println(t1.getName()+"thread dead."); 
              System.out.println(t2.getName()+"thread dead."); 
               } 
 }
