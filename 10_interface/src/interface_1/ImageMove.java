package interface_1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ImageMove extends Frame implements MouseListener, MouseMotionListener, WindowListener, ActionListener{
	/**
	 * <font style="color: red;">����, ������, ��, �Ʒ��� �̵���Ű�� ��ư�̴�.</font>
	 */
	public Button reset,left,right,up,down = null;
	public int x = 100;	
	public int y = 100;
	/**
	 * �̹����� ���� ��ġ�̴�.
	 */
	public void init() {
		
		setTitle("���̵�");
		setBounds(800,400,500,500);
		setVisible(true);
		
		reset = new Button("�ʱ�ȭ");
		left = new Button("��");
		right = new Button("��");
		up = new Button("��");
		down = new Button("��");
		
		Panel p = new Panel();
		p.setLayout(new GridLayout(1,5,3,0));
		p.add(reset);
		p.add(left);
		p.add(right);
		p.add(up);
		p.add(down);
	
		this.add("North",p);
		this.addWindowListener(this);
		
		reset.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);
		up.addActionListener(this);
		down.addActionListener(this);
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
	}
	
	public void paint(Graphics g) { //Graphics ���� ���� ���� //Call Back Method //JVM�� Frameâ�� ����������� �ش� �޼ҵ� ȣ�� (setVisible(true)�� ��) // repaint()
		 //���� (new�� �Ͱ� ����)
		Image img = Toolkit.getDefaultToolkit().getImage("D:/java_se/WORK1/10_interface/godol.jpg"); //�̹��� �ҷ�����
		g.drawImage(img, x, y, this);
	}
	
	public static void main(String[] args) {
		new ImageMove().init();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.print("X : "+ x+"\t Y : "+y);
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==reset) {
			x = 100;
			y = 100;
		}
		else if(e.getSource()==left) {
			if(x <= -90) x = 480;
			x -= 20;
		}
		else if(e.getSource()==right) {
			if(x >= 480) x = -120;
			x += 20;
		}
		else if(e.getSource()==up) {
			if(y <= 0) y = 480;
			y -= 20;
		}
		else if(e.getSource()==down) {
			if(y >= 480) y = 0;
			y += 20;
		}		

		repaint();
	}
}


