package interface_1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class WindowTest extends Frame implements MouseListener, MouseMotionListener {
	int rocationX, rocationY;
	
	public WindowTest() {
		setForeground(Color.black);
		setTitle("내가 만든 윈도우");
		setBounds(800,400,300,400);
		setVisible(true);
		
		//이벤트 처리
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowExit()); //WindowListener을 windowexit클래스를 생성해서 사용		
	}
	
	
	public static void main(String[] args) {
		new WindowTest();

	}

	//Mouse Listener Override = Event Handler
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭");
		System.out.println("X : "+ e.getX()+"\t Y : "+e.getY());	
		rocationX = e.getX();	
		rocationY = e.getY();
		repaint();
	}
	
	public void paint(Graphics g) {
		g.drawString("X , Y : "+ rocationX +", "+rocationY, rocationX, rocationY);
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스 IN");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스 OUT");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//MouseMotionListener Override = Event Handler
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("마우스 드래그");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {		
	}
}
