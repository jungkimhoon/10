package a1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScoreForm extends JFrame implements ActionListener{
	private JLabel hakL, nameL, korL, engL, mathL;
	private JTextField  hakT, nameT, korT, engT, mathT;
	private JButton inputB, printB, searchB, rankB, saveB, loadB;
	private Score score; // score �������̽� ����
	private JTextArea output;
	private ScoreImpl impl = new ScoreImpl();
	
	public ScoreForm() {
		
		hakL = new JLabel("����");
		nameL = new JLabel("�̸�");
		korL = new JLabel("����");
		engL = new JLabel("����");
		mathL = new JLabel("����");
		
		hakT = new JTextField(20);
		nameT = new JTextField(20);
		korT = new JTextField(20);
		engT = new JTextField(20);
		mathT = new JTextField(20);
		
		JPanel j1 = new JPanel();
		j1.add(hakL); j1.add(hakT);

		JPanel j2 = new JPanel();
		j2.add(nameL); j2.add(nameT);
		
		JPanel j3 = new JPanel();
		j3.add(korL); j3.add(korT);
		
		JPanel j4 = new JPanel();
		j4.add(engL); j4.add(engT);
		
		JPanel j5 = new JPanel();
		j5.add(mathL); j5.add(mathT);
		
		JPanel jp = new JPanel(new GridLayout(5,1,3,1));
		
		jp.add(j1);
		jp.add(j2);
		jp.add(j3);
		jp.add(j4);
		jp.add(j5);
		
		inputB = new JButton("�Է�");
		printB = new JButton("���");
		searchB = new JButton("�˻�");
		rankB = new JButton("����");
		saveB = new JButton("����");
		loadB = new JButton("����");
		
		JPanel bp = new JPanel(new GridLayout(1,6,5,3));
		bp.add(inputB);
		bp.add(printB);
		bp.add(searchB);
		bp.add(rankB);
		bp.add(saveB);
		bp.add(loadB);
		
		output = new JTextArea();
		JScrollPane scroll = new JScrollPane(output);
		
		Container con = this.getContentPane();
		con.add("West",jp);
		con.add("South",bp);
		con.add("Center",scroll);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300,300,600,300);
		setVisible(true);
		
		event();
	}
	
	
	public void event() {
		inputB.addActionListener(this);
		printB.addActionListener(this);
		searchB.addActionListener(this);
		rankB.addActionListener(this);
		saveB.addActionListener(this);
		loadB.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == inputB) {
			ScoreDTO dto = new ScoreDTO();
			dto.setHak(hakT.getText());
			dto.setName(nameT.getText());
			dto.setKor(Integer.parseInt(korT.getText()));
			dto.setEng(Integer.parseInt(engT.getText()));
			dto.setMath(Integer.parseInt(mathT.getText()));
			impl.input(dto);
			JOptionPane.showMessageDialog(this, "��ϿϷ�");
			
			hakT.setText("");
			nameT.setText("");
			korT.setText("");
			engT.setText("");
			mathT.setText("");
			
		}else if(e.getSource() == printB) {
			impl.print(output);
		}else if(e.getSource() == searchB) {
			
		}else if(e.getSource() == rankB) {
			impl.tot_desc();
		}else if(e.getSource() == saveB) {
			impl.save();
		}else if(e.getSource() == loadB) {
			impl.load();
		}
		
	}
	
	
	
	
	
	
}