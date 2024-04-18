import java.awt.*;
import java.awt.event.*;

class Slip4_1 extends Frame implements Runnable
{
            Thread t;
            Label l1;
            int f;
            Slip4_1()
            {
                        t=new Thread(this);
                        t.start();
                        setLayout(null);
                        l1=new Label("Hello JAVA");
                        l1.setBounds(100,100,100,40);
                        add(l1);
                        setSize(300,300);
                        setVisible(true);
                        f=0;
            }
            public void run()
            {
                        try
                        {
                                    if(f==0)
                                    {
                                                t.sleep(200);
                                                l1.setText("");
                                                f=1;
                                    }
                                    if(f==1)
                                    {
                                                t.sleep(200);
                                                l1.setText("Hello Java");
                                                f=0;
                                    }
                        }
                        catch(Exception e)
                        {
                                    System.out.println(e);
                        }
                        run();
            }
            public static void main(String a[])
            {
                        new Slip4_1();
            }
}

//2


import java.io.*;
import java.util.*;
public class Slip4_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cname;
        int n, code;
        Hashtable a = new Hashtable();
        do {
            System.out.println("1) Add new City and its code");
            System.out.println("2) Remove a city name");
            System.out.println("3) Search and display a city");
            System.out.println("4) Display");
            System.out.println("5) Exit");
            System.out.println("Enter your choice");
            n = Integer.parseInt(br.readLine());
            switch (n) {
                case 1:
                    System.out.println("Enter the new City and its code");
                    cname = br.readLine();
                    code = Integer.parseInt(br.readLine());
                    a.put(cname, code);
                    break;
                case 2:
                    System.out.println("Enter the city to be deleted");
                    cname = br.readLine();
                    a.remove(cname);
                    break;
                case 3:
                    System.out.println("Enter the City to be Searched and displayed");
                    cname = br.readLine();
                    System.out.println(a.get(cname));
                    break;
                case 4:
                    System.out.println(a);
                    break;
                case 5:
                    return;
            }
        } while (n != 5);
    }
}
