package nested;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Card { 
	private Frame frame;
	private CardLayout card; //�ϳ��� frame�� ���� ȭ���� �����ư��鼭 ������
	
	public Card() {
		frame = new Frame();
		card = new CardLayout();
		frame.setLayout(card);
		
		String[] title = {"����","��Ȳ","���","�ʷ�","�Ķ�","����"};
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA};
		Panel[] p = new Panel[6];
		for(int i=0; i<p.length; i++) {
			p[i] = new Panel();
			p[i].setBackground(color[i]);
				
			frame.add(p[i], title[i]);
			
			p[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					card.next(frame);
					//card.show(frame, "�Ķ�"); ���ϴ� �� ���
				}
			});
		}
				
		frame.setBounds(700,500,300,300);
		frame.setVisible(true);	
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
			
	public static void main(String[] args) {
		new Card();
	}

}
