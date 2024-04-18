import java.io.*;

public class SearchThread extends Thread {
    File f1;
    String fname;
    static String str;
    String line;
    LineNumberReader reader = null;

    SearchThread(String fname) {
        this.fname = fname;
        f1 = new File(fname);
    }

    public void run() {
        try {
            FileReader fr = new FileReader(f1);
            reader = new LineNumberReader(fr);
            while ((line = reader.readLine()) != null) {
                if (line.contains(str)) {
                    System.out.println("String found in " + fname + " at line " + reader.getLineNumber());
                    return; // Stop the thread when string is found
                }
            }
            reader.close(); // Close the reader after finishing reading the file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Thread t[] = new Thread[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String to search");
        str = br.readLine();

        FilenameFilter filter = (dir, name) -> name.endsWith(".txt");

        File dir1 = new File(".");
        File[] files = dir1.listFiles(filter);
        if (files == null || files.length == 0) {
            System.out.println("No files available with .txt extension");
        } else {
            for (int i = 0; i < files.length; i++) {
                t[i] = new SearchThread(files[i].getName());
                t[i].start();
            }
        }
    }
}


//2

<!DOCTYPE html>
<html>
<body>
<form method="post" action="Slip7.jsp">
    Enter Any Number : <input type="text" name="num"><br><br>
    <input type="submit" value="Display">
</form>
</body>
</html>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<%
    int n = Integer.parseInt(request.getParameter("num"));
    int rem, r;

    if (n < 10) { 
        out.println("Sum of first and last digit is ");
%>
        <font size="18" color="red"><%= n %></font>
<%
    } else {
        rem = n % 10;
        do {
            r = n % 10;
            n = n / 10;
        } while (n > 0);
        n = rem + r;
        out.println("Sum of first and last digit is ");
%>
        <font size="18" color="red"><%= n %></font>
<%
    }
%>
</body>
</html>
