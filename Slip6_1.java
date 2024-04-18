import java.io.*;
import java.util.*;
class Slip6_1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		TreeSet ts=new TreeSet();
		int i,n,no,choice;
		System.out.println("Enter How many numbers :");
		               n=Integer.parseInt(br.readLine());
		               System.out.println("Enter the numbers :");
		                for(i=0;i<n;i++)
		                {
			              no=Integer.parseInt(br.readLine());
			             ts.add(no);
		                }
		do
		{
			System.out.println("1)Search fo number:");
			System.out.println("2)dispaly all");
			System.out.println("3)exit");
			System.out.println("Enter you choice:");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
		     case 1:System.out.println("Enter th no to be searched ");
						n=Integer.parseInt(br.readLine());
					if(ts.contains(n))
					{
						System.out.println("Elemnt present:\t"+n);
					}
					else
						System.out.println("Not Present \t"+n);
					break;
			case 2:System.out.println(ts);
				break;
			case 3:return;
	        }
		}while(choice!=3);
}
}


import java.awt.*;
import java.applet.*;
public class Slip6_2 extends Applet implements Runnable
{
    int r,g1,y,i;
    Thread t;
    public void init()
    {
        r=0;g1=0;y=0;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        try        { for (i=24;i>=1;i--)
        {
            t.sleep(100);
            if (i>=16 && i<24)
            {
                g1=1;
                repaint();
            }
            if (i>=8 && i<16)
            {
                y=1;
                repaint();
            }
            if (i>=1 && i<8)
            {
                r=1;
                repaint();
            }
        }
                      if (i==0)
            {
                run();
            }
        }
        catch(Exception e)
        {
        }
    }
    public void paint(Graphics g) {
        g.drawOval(100,100,100,100);
        g.drawOval(100,225,100,100);
        g.drawOval(100,350,100,100);
        g.drawString("start",200,200);
        if (r==1)
        { g.setColor(Color.red);
            g.fillOval(100,100,100,100);
            g.drawOval(100,100,100,100);
            g.drawString("stop",200,200);
            r=0;
        }
        if (g1==1)
        { g.setColor(Color.green);
            g.fillOval(100,225,100,100);
            g1=0;
            g.drawOval(100,225,100,100);
            g.drawString("go",200,200);
        }
        if (y==1)
        { g.setColor(Color.yellow);
            g.fillOval(100,350,100,100);
            y=0;
            g.drawOval(100,350,100,100);
            g.drawString("slow",200,200);
        }
    }
}