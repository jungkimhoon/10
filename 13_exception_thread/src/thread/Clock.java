package thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;

public class Clock extends JFrame implements Runnable{
	public Clock() {
		
		setForeground(Color.RED);
		setFont(new Font("돋움체",Font.BOLD,30));
		setBounds(300,400,300,100);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			};
		});
		
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void paint(Graphics g) {
		SimpleDateFormat sDF = new SimpleDateFormat("HH시 mm분 ss초");
		Date date = new Date();
		g.clearRect(0, 0, 300, 100);
		g.drawString(sDF.format(date), 30, 80);
		
	}
	@Override
	public void run() {//throws InterruptedException{ //자바 제공 Override 구현부에 throws 불가
		while(true) {
			repaint();
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Clock();
	}


}
