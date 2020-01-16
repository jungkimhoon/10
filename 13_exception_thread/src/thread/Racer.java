package thread;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Racer extends Canvas implements Runnable{
	private Image img;
	public int x;
	static int rank;
	

	public Racer() {
		img = Toolkit.getDefaultToolkit().getImage("horse.gif");
//		setBackground(new Color((int)(Math.random()*256),((int)Math.random()*256),((int)Math.random()*256)));
	}
	@Override
	public  void paint(Graphics g) {
		g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
		g.drawImage(img, x, 0, 100, this.getHeight(), this); //x, y, width, height
	}

	@Override
	public void run() {
		
		for(int i=0; i<800; i+=(int)(Math.random()*10+1)) {
			x = i;
			repaint();
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			if(i>=780) {
				++rank;
				System.out.println(Thread.currentThread().getName()+" "+rank+"µî µµÂø");	
				break;
			}
			
		}
		
	
	}
}
