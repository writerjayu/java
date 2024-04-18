import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class servletDatabase extends HttpServlet { 
    Connection cn;

    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/stud", "root", "password");
            System.out.println("Connected to database");
        } catch(Exception ce) { 
            System.out.println("Error: " + ce.getMessage());
        }
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter(); 
        try {
            int rno = Integer.parseInt(req.getParameter("t1")); 
            String qry = "SELECT * FROM student WHERE rollno=" + rno; 
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(qry); 
            pw.print("<table border=1>");
            while (rs.next()) {
                pw.print("<tr>");
                pw.print("<td>" + rs.getInt(1) + "</td>");
                pw.print("<td>" + rs.getString(2) + "</td>");
                pw.print("<td>" + rs.getFloat(3) + "</td>");
                pw.print("</tr>");
            }
            pw.print("</table>");
        } catch(Exception se) {
            System.out.println("Error: " + se.getMessage());
        }
        pw.close();
    }
} 


//2

import java.sql.*;

public class ResultSetMetaData {
    public static void main(String[] args) {
        try {
            Statement stmt;
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/stud", "postgres", "password");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            ResultSetMetaData rsmd = rs.getMetaData();
            int noOfColumns = rsmd.getColumnCount();
            System.out.println("Number of columns = " + noOfColumns);
            for (int i = 1; i <= noOfColumns; i++) {
                System.out.println("Column No : " + i);
                System.out.println("Column Name : " + rsmd.getColumnName(i));
                System.out.println("Column Type : " + rsmd.getColumnTypeName(i));
                System.out.println("Column display size : " + rsmd.getColumnDisplaySize(i));
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Error: PostgreSQL JDBC Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
