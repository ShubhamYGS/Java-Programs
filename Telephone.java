import java.awt.*; 
import java.awt.event.*; 
import java.io.*;
import java.util.*;
class TelDirectory extends Frame implements ActionListener
{ 
	Label l1,l2,l3; 
	Button b1,b2; 
	TextField t1,t2,t3;
	FileReader in=null; 
	FileWriter out=null;
	Panel p1,p2,p3,p4,p5;
	String name,no,addr;
	TelDirectory(String r) 
	{ 
		super(r);
		p1=new Panel(new GridLayout(4,2,100,100));
		l1=new Label("Name:"); 
		//l1.setBounds(100,100,100,20);
		t1=new TextField(20); 
		//t1.setBounds(300,100,100,20); 
		l2=new Label("Phone NO:"); 
		//l2.setBounds(100,200,100,20); 
		t2=new TextField(20); 
		//t2.setBounds(300,200,100,20);
		l3=new Label("Address:"); 
		//l3.setBounds(100,300,100,20);
		t3=new TextField(20); 
		//t3.setBounds(300,300,100,20);
		b1=new Button("OK"); 
		b2=new Button("Cancel"); 
		//b1.setBounds(100,400,100,20);
		//b2.setBounds(300,400,100,20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(b1);
		p1.add(b2);
		add(p1);
		setSize(700,700); 
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b=(Button)e.getSource();
		if(b==b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		if(b==b1)
		{
			 name=t1.getText();
			 no=t2.getText();
			 addr=t3.getText();
			try
			{  
				out=new FileWriter("TelDir.txt",true); 
				out.append(name+"\n"+no+"\n"+addr);
				out.close();
				in=new FileReader("TelDir.txt");
				int c; 
				while((c=in.read())!=-1)
				{ 
					System.out.print((char)c); 
				} 
				t1.setText("");
				t2.setText("");
				t3.setText("");
				out.close();
			}
			catch(Exception ae)
			{
				System.out.println(ae);
			}
		}
	}
}
public class Telephone
{ 
	public static void main(String args[]) 
	{ 
		TelDirectory t=new TelDirectory("Telephone Directory");  
	}
}
