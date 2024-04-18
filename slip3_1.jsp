//html

<html>
<body>
<form action="slip3_1.jsp" metod="get">
Enter the patient no :<input type=text namme="p1"><br>
Enter the patient name :<input type=text namme="p2"><br>
Enter the patient address :<input type=text namme="p3"><br>
Enter the patient age:<input type=text namme="p4"><br>
Enter the patient Disease:<input type=text namme="p5"><br>
<input type=submit value=submit>
</form>
</body>
</html>


//jsp

<%@page language="java" %>
<html>
<body>
<%

    int no=Integer.parseInt(request.getParameter("p1"));
	int name=Integer.parseInt(request.getParameter("p2"));
	int address=Integer.parseInt(request.getParameter("p3"));
	int age=Integer.parseInt(request.getParameter("p4"));
	int disease=Integer.parseInt(request.getParameter("p5"));
	out.println(no+"\t"+name+"\t"+address+"\t"+age+"\t"+disease);
%>
</body>
</html>



//2

import java.util.*;
import java.io.*;
public class Slip3_2
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		int n;
		LinkedList a=new LinkedList();
		do
		{
			System.out.println("1) Add element at the end of the list");
            System.out.println("2) Delete first element of the list");
			System.out.println("3) contents of list in reverse order");
			System.out.println("4) display");
			System.out.println("5) Exit");
			System.out.println("Enter your choice");
			n=Integer.parseInt(br.readLine());
			switch(n)
			{
				case 1:System.out.println("Enter the name to enter in LinkedList");
					   name=br.readLine();
					   a.add(name);
					   break;
				case 2:a.removeFirst();
					   break;
				case 3:System.out.println("Reverse the LinkedList");
					   Collections.reverse(a);
					   break;
				case 4:System.out.println(" Display linkedList");
					   System.out.println(a);
					   break;
				case 5:return ;
			}
		}while(n!=5);
	}
}
	