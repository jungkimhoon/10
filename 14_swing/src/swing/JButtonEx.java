package swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JButtonEx extends JFrame{
	private Icon icon1 = new ImageIcon("image/brown.jpg");
	private Icon icon2 = new ImageIcon("image/conny.jpg");
	private Icon icon3 = new ImageIcon("image/sally.jpg");
	private Icon icon4 = new ImageIcon("image/boss.jpg");
	private ButtonGroup bg = new ButtonGroup();

	private JRadioButton[] jb = new JRadioButton[4];
	
	public JButtonEx() {
		super("이미지");
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(2,2));
		for(int i=0; i<4; i++) {
			jb[i] = new JRadioButton(i+1+"번 버튼",icon1);
			con.add(jb[i]);
			jb[i].setToolTipText(i+1+"번째 버튼이다. 눌러..");
			jb[i].setMnemonic(i+49);
			jb[i].setRolloverIcon(icon2);
			jb[i].setPressedIcon(icon3);
			jb[i].setSelectedIcon(icon4);
			bg.add(jb[i]);
		}
		pack();
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JButtonEx();
	}
}
