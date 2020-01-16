package network;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient extends JFrame{
	private JTextField input;
	private JTextArea output;
	private JButton send;
	
	public ChatClient() {
		send = new JButton("����");
		input = new JTextField();
		JPanel jp = new JPanel(new BorderLayout());
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add("Center",input); p.add("East",send);
		
		output = new JTextArea();
		output.setEditable(false);
		JScrollPane scroll = new JScrollPane(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		Container c = this.getContentPane();
		c.add("South",p);
		c.add("Center",scroll);
				
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(300,300,500,300);
		event();	
	}
	
	public void event() {
		
	}

	private void service() {
		String serverIP = JOptionPane.showInputDialog
				(this,"���� IP�� �Է��ض�","192.168.0.131");
		if(serverIP == null || serverIP.length() == 0) {
			System.out.println("���� IP�� �Էµ��� �ʾҵ�.");
			System.exit(0);
		}
		
		String nickName = JOptionPane.showInputDialog
				(this,"�г��� �Է��ض�.","�г���",JOptionPane.INFORMATION_MESSAGE);
		if(nickName == null || nickName.length() == 0) {
			nickName = "guest";
		}
		
	}
	
	public static void main(String[] args) {
		new ChatClient().service();
		
	}

	
}
