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
		setTitle("���� ���� ������");
		setBounds(800,400,300,400);
		setVisible(true);
		
		//�̺�Ʈ ó��
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowExit()); //WindowListener�� windowexitŬ������ �����ؼ� ���		
	}
	
	
	public static void main(String[] args) {
		new WindowTest();

	}

	//Mouse Listener Override = Event Handler
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺 Ŭ��");
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
		System.out.println("���콺 IN");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("���콺 OUT");
		
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
		System.out.println("���콺 �巡��");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {		
	}
}
