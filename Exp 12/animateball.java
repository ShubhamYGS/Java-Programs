import java.awt.*;
import java.awt.event.*;
import java.math.*;
public class animateball extends Frame implements ActionListener
{
	Button b;
	animateball()
	{
		addWindowListener(new mywindow());
		b=new Button("New Ball");
		b.addActionListener(this);
		setLayout(new FlowLayout());
		add(b);
		setSize(600,600);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		ball b1=new ball();
		Thread t1=new Thread(b1);
		t1.start();
	}
	class ball implements Runnable
	{
		int x=5,y=30,dx=3,dy=3;
		Color co;
		Graphics g;
		public void run()
		{
			int r=(int)(Math.random()*255);
			int gr=(int)(Math.random()*255);
			int b=(int)(Math.random()*255);
			g=getGraphics();
			co=new Color(r,gr,b);
			g.setColor(co);
			while(true)
			{
				move();
				try
				{
					Thread.sleep(30);
				}
				catch(Exception e)
				{}
			}
		}
		public void move()
		{
			Dimension ds=getSize();
			if(x>(ds.width)-35)
				dx=-3;
			if(y>(ds.height)-35)
				dy=-3;
			if(x<5)
				dx=3;
			if(y<30)
				dy=3;
			g.clearRect(x,y,30,30);
			x=x+dx;
			y=y+dy;
			g.fillOval(x,y,30,30);
		}
	}
	public static void main(String args[])
	{
		animateball b=new animateball();
	}
}
class mywindow extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}
