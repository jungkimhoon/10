package interface_1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


//Frame은 BorderLayout(동서남북 위치 고정)
public class WindowTest2 extends Frame implements WindowListener, ActionListener{
	private Button newB, exitB = null;
	private TextArea area;
	
	public void init() {
		newB = new Button("새로 만들기");
		exitB = new Button("끝내기"); // button
		area = new TextArea();
		
		Panel p = new Panel(); // Panel은 가운데 기준 ==> FlowLayout 순서대로 배치
		p.add(newB);
		p.add(exitB);
		p.setBackground(new Color(255,100,100)); // panel
		
		this.add("North",p);
		this.add("Center",area);
		
		setBounds(800,400,300,400);
		setVisible(true);
		
		this.addWindowListener(this);
		
		newB.addActionListener(this);
		exitB.addActionListener(this);
	}

	public static void main(String[] args) {
		new WindowTest2().init();
		
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

	//ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==exitB) System.exit(0);
		else if(e.getSource()==newB) {
			area.setText(" ");
			area.setText("");
		}
	}
	
}
