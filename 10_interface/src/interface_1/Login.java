package interface_1;

/* 1. ��� ��ư�� ������ JTextField(idT, pwdT)�� ���� �ʱ�ȭ
 * 2. �α��� ��ư�� ������ ���ο� â�� ���� => LoginResult class Ȱ��
 * angel, 1004�� �α��� ���� �ƴϸ� ����		
 * 
 * �α��� ���� or �α��� ����
 * ������ â ����� �α���â ���� */

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements WindowListener, ActionListener {
	private JButton loginB, cancelB;
	private JLabel idL, pwdL;
	private JTextField idT;
	private JPasswordField pwdT;
	
	public void init() {
		this.setLayout(null); //������� ��ġ
		
		setBounds(800,400,400,520);
		idL = new JLabel("���̵�");
		pwdL = new JLabel("��й�ȣ");
		
		loginB = new JButton("�α���");
		cancelB = new JButton("���");
		
		idT = new JTextField();
		pwdT = new JPasswordField();
		
//		idL.setLocation(50, 80);
//		idL.setSize(50, 30);
		idL.setBounds(50, 20, 50, 30);
		pwdL.setBounds(40, 55, 70, 30);
		
		idT.setBounds(100, 20, 120, 30);	
		pwdT.setBounds(100, 55, 120, 30);
		
		loginB.setBounds(40, 100, 90, 30);
		cancelB.setBounds(135, 100, 90, 30);
		
		Container c = this.getContentPane();
		c.add(idL);
		c.add(idT);
		c.add(pwdL);
		c.add(pwdT);
		c.add(loginB);
		c.add(cancelB);
		
		setBounds(800,500,300,300);
		setVisible(true);
		getContentPane().setBackground(new Color(230,230,250));
		
		this.addWindowListener(this);
		cancelB.addActionListener(this);
		loginB.addActionListener(this);
	}
	
	public String getId() {
		return idT.getText();
	}
	
	public String getPw() {
		return pwdT.getText();
	}
	
	public void page() {
		setBounds(900,600,300,300);
		setVisible(true);
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
		if(e.getSource()==cancelB) {
			idT.setText("");
			pwdT.setText("");
		}
		
		if(e.getActionCommand()=="�α���") {
			new LoginResult(idT.getText(), pwdT.getText());
			idT.setText("");
			pwdT.setText("");
		}
//		if(e.getSource()==loginB) {
//			new LoginResult(idT.getText(), pwdT.getText());
//			idT.setText("");
//			pwdT.setText("");
//		}
	}

	public static void main(String[] args) {
		new Login().init();
		
	}

}
