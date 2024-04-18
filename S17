import java.io.*;
import java.util.*;
class s17_1
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



//2


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class s17_2 implements Runnable {
    private JTextField textField;

    public s17_2(JTextField textField) {
        this.textField = textField;
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            textField.setText(Integer.toString(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Number Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Start");
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                s17_2 numberDisplay = new s17_2(textField);
                Thread thread = new Thread(numberDisplay);
                thread.start();
            }
        });
    }
}
