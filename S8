public class s8_1 extends Thread
 { 
 String str; 
 int n; 
 s8_1(String str, int n) 
 { 
 this.str = str; 
 this.n = n; 
 } 
 
 public void run() 
 { 
 try 
 { 
 for (int i = 0; i < n; i++) 
 { 
 System.out.println(getName() + " : " + str); 
 } 
 } catch (Exception e) 
 { 
   e.printStackTrace(); 
 } 
 } 
 public static void main(String[] args) 
{ 
 s8_1 t1 = new s8_1("COVID19", 10); 
 s8_1 t2 = new s8_1("LOCKDOWN2020", 20); 
 s8_1 t3 = new s8_1("VACCINATED", 30); 
 t1.start(); 
 t2.start(); 
 t3.start(); 
 } 
}


//2


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <center>
        <h1>The required Result is:</h1>
        <h2>
            <% 
            int n = 0;
            int flag = 0;
            String ns = request.getParameter("n");
            if (ns != null && !ns.isEmpty()) {
                n = Integer.parseInt(ns);
                if (n > 1) {
                    for (int i = 2; i <= n / 2; i++) {
                        if (n % i == 0) {
                            flag = 1;
                            break;
                        }
                    }
                }
            }
            if (flag == 0) {
                out.println("<pre>");
                out.println(n + " is a prime no.");
                out.println("</pre>");
            } else {
                out.println("<pre>");
                out.println(n + " is not a prime no.");
                out.println("</pre>");
            }
            %>
        </h2>
    </center>
</body>
</html>
