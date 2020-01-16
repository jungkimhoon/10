package interface_1;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LoginResult extends JFrame implements WindowListener, ActionListener{
	private String a, b;
	
	public LoginResult(String a, String b) {
		
			this.a = a;
			this.b = b;
					
			setBounds(800,500,300,300);
			setVisible(true);
			
			addWindowListener(this);
			
		}
	
		@Override
	public void paint(Graphics g) {
			if(a.equals("angel") && b.equals("1004")) {
//				g.drawString("성공", 50, 80);
				JOptionPane.showMessageDialog(this, "성공");
			}else {
//				g.drawString("실패", 50, 80);
				JOptionPane.showMessageDialog(this, "실패");
			}
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
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
		setVisible(false);
		
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
	
}
