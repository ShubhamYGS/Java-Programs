import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

class StopWatch extends Thread {
	static JTextField tf;
	static boolean pause = true;
	static int min = 0, sec = 0;
	static long ms = 0;
	static int started = 0, lc = 1;
	
	public void run() {
			while(true) {
				if(!pause) {
					try {
						Thread.sleep(1);
						ms++;
						update();
						if(ms > 1000) {
							sec++;
							ms = 0;
							update();
							if(sec > 60) {
								min++;
								sec = 0;
								update();
							}
						}
					}
					catch(Exception e) {
						System.out.println("Stopwatch interruped");
						e.printStackTrace();
					}
				}
				else {
					min = 0;
					sec = 0;
					ms = 0;
					update();
				}
			}
	}
	
	void update() {
		tf.setText(min+" Mins "+sec+" sec "+ms+" ms");
	}
	
	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		JFrame fr = new JFrame("Stop Watch");
		JTextArea laps = new JTextArea();
		fr.setLayout(null);
		fr.setSize(400, 500);
   
		tf = new JTextField();
		tf.setBounds(125, 75, 150, 50);
		JButton start = new JButton("Start");
		start.setBounds(60, 150, 75, 45);
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pause = false;
				laps.setText("");
				lc = 1;
				if(started==0) {
					sw.start();
					started = 1;
				}
			}
		});
		
		JButton lap = new JButton("Lap");
		lap.setBounds(150, 150, 75, 45);
		lap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				laps.setText(laps.getText()+"\n"+"Lap "+lc+": "+min+" Mins "+sec+" sec "+ms+" ms");
				lc++;
			}
		});
		
		JButton stop = new JButton("Stop");
		stop.setBounds(240, 150, 75, 45);
		stop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pause = true;
				laps.setText("");
				lc = 1;
			}
		});
		
		
		laps.setBounds(100, 250, 200, 100);
   
		fr.add(tf);
		fr.add(start);
		fr.add(stop);
		fr.add(lap);
		fr.add(laps);
		fr.setVisible(true);
		
	}
   
}
