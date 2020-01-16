package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;



public class WindowTest extends Frame {
	public WindowTest() {
		//setTitle("����"); Ÿ��Ʋ ����
		super("���� ���� Ÿ��Ʋ"); //�θ� ȣ��
		//new Frame("���� ���� ������").setVisible(true); ���ο� â���� �ϳ� �� ���
		
		setForeground(Color.white);
		setBackground(new Color(250,69,243));
		//this.setSize(300,400);
		setBounds(800,400,300,400);
		setVisible(true);
	}

	
	@Override
	public void paint(Graphics g) { //Graphics ���� ���� ���� //Call Back Method //JVM�� Frameâ�� ����������� �ش� �޼ҵ� ȣ�� (setVisible(true)�� ��) // repaint()
		g.drawLine(70, 100, 230, 300);
		g.drawLine(230, 100, 70, 300); //����
		g.drawRect(70,100,160,200); 	//�簢��
		g.drawOval(70, 100, 160, 200);	//��
		g.drawString("����",200,200);
	}



	public static void main(String[] args) {
		new WindowTest();
		
		
	}

}
