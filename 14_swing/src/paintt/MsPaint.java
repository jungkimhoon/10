package paintt;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

public class MsPaint extends JFrame {
	
	private JTextField x1T, x2T, y1T, y2T, z1T, z2T;
	private JLabel x1L, x2L, y1L, y2L, z1L, z2L;
	private JCheckBox fill;
	private JRadioButton line, circle, rect, roundRect, pen;
	private JComboBox combo;
	private DrCanvas can;
	private JButton draw;

	
	
	public MsPaint() {
		can = new DrCanvas();
	
		x1T = new JTextField("0",4);
		x2T = new JTextField("0",4);
		y1T = new JTextField("0",4);
		y2T = new JTextField("0",4);
		z1T = new JTextField("0",4);
		z2T = new JTextField("0",4);
		
		x1L = new JLabel("x1");
		x2L = new JLabel("x2");
		y1L = new JLabel("y1");
		y2L = new JLabel("y2");
		z1L = new JLabel("z1");
		z2L = new JLabel("z2");
		
		fill = new JCheckBox("ä���");
		
		JPanel up = new JPanel();
		up.add(x1L);
		up.add(x1T);
		up.add(y1L);
		up.add(y1T);
		up.add(x2L);
		up.add(x2T);
		up.add(y2L);
		up.add(y2T);
		up.add(z1L);
		up.add(z1T);
		up.add(z2L);
		up.add(z2T);
		up.add(fill);
		
		line = new JRadioButton("��");
		circle = new JRadioButton("��");
		rect = new JRadioButton("�簢��");
		roundRect = new JRadioButton("�ձٻ簢��");
		pen = new JRadioButton("��");
		
		ButtonGroup group = new ButtonGroup();
		group.add(line);
		group.add(circle);
		group.add(rect);
		group.add(roundRect);
		group.add(pen);
		
		String color[] = {"������", "������", "�Ķ���", "�ʶ���"};
		combo = new JComboBox<String>(color);
		draw = new JButton("�׸���");
		
		JPanel down = new JPanel();
		down.add(line);
		down.add(circle);
		down.add(rect);
		down.add(roundRect);
		down.add(pen);
		down.add(combo);
		down.add(draw);
		
		add("North",up);
		add("South",down);
		add("Center",can);
		
		setVisible(true);
		setBounds(300,300,600,600);
			
		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				x1T.setText(e.getX()+"");
				y1T.setText(e.getY()+"");
				ShapeDTO dto = new ShapeDTO();
				
			}
		});
		
		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		draw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		new MsPaint();
	}

	
	
		
}
