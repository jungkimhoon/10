package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//JFrame - BorderLayout
public class MsPaint extends JFrame {
	private JLabel x1L, y1L, x2L, y2L, z1L, z2L;
	private JTextField x1T, y1T, x2T, y2T, z1T, z2T;
	private JCheckBox fill;
	private JRadioButton line, circle, rect, roundRect, pen;
	private JComboBox combo;
	private JButton draw, reset;
	private DrCanvas can;
	private ArrayList<ShapeDTO> list;
	
	public MsPaint(String title) {
		x1L = new JLabel("x1");
		y1L = new JLabel("y1");
		x2L = new JLabel("x2");
		y2L = new JLabel("y2");
		z1L = new JLabel("z1");
		z2L = new JLabel("z2");
		
		x1T = new JTextField("0",4);
		y1T = new JTextField("0",4);
		x2T = new JTextField("0",4);
		y2T = new JTextField("0",4);
		z1T = new JTextField("50",4);
		z2T = new JTextField("50",4);
		
		fill = new JCheckBox("ä���");
		
		line = new JRadioButton("��");
		circle = new JRadioButton("��");
		rect = new JRadioButton("�簢��", true);
		roundRect = new JRadioButton("�ձٻ簢��");
		pen = new JRadioButton("����");
		
		ButtonGroup group = new ButtonGroup();
		group.add(line);
		group.add(circle);
		group.add(rect);
		group.add(roundRect);
		
		String rainbow[] = {"������", "��Ȳ��", "�����", "�ʷϻ�", "�Ķ���", "����", "�����"};
		combo = new JComboBox<String>(rainbow);
		
		draw = new JButton("�׸���");
		reset = new JButton("����");
		can = new DrCanvas(this);
		list = new ArrayList<ShapeDTO>(); //�θ� = �ڽ�
		
		Object ob = new String();
		
		JPanel northP = new JPanel();//FlowLayout(������ġ-�߾�)
		northP.add(x1L); northP.add(x1T);
		northP.add(y1L); northP.add(y1T);
		northP.add(x2L); northP.add(x2T);
		northP.add(y2L); northP.add(y2T);
		northP.add(z1L); northP.add(z1T);
		northP.add(z2L); northP.add(z2T);
		northP.add(fill);
		
		JPanel southP = new JPanel();
		southP.add(line);
		southP.add(circle);
		southP.add(rect);
		southP.add(roundRect);
		southP.add(pen);
		southP.add(combo);
		southP.add(draw);
		southP.add(reset);
		
		Container c = this.getContentPane();
		c.add("North", northP);
		c.add("South", southP);
		c.add("Center", can);
		
		setTitle(title);
		setBounds(900,100,700,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				list.removeAll(list);
				can.repaint();	
				x1T.setText("0");
				x2T.setText("0");
				y1T.setText("0");
				y2T.setText("0");
			}
		});
		
		//�̺�Ʈ
		draw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.repaint();
			}
		});
		
		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x1T.setText(e.getX()+"");
				y1T.setText(e.getY()+"");
				System.out.println("list������ = "+list.size());
			}
		});
		can.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {

				x2T.setText(e.getX()+"");
				y2T.setText(e.getY()+"");
				
				can.repaint();
				
				ShapeDTO dto = new ShapeDTO();
				
				if(pen.isSelected()) {
				dto.setShape(Figure.LINE);
				dto.setX1(Integer.parseInt(x1T.getText().trim()));
				dto.setY1(Integer.parseInt(y1T.getText().trim()));
				dto.setX2(Integer.parseInt(x2T.getText().trim()));
				dto.setY2(Integer.parseInt(y2T.getText().trim()));
				dto.setZ1(Integer.parseInt(z1T.getText().trim()));
				dto.setZ2(Integer.parseInt(z2T.getText().trim()));
				
				dto.setColor(combo.getSelectedIndex());
				dto.setFill(fill.isSelected());
				
				list.add(dto);
				
				x1T.setText(x2T.getText());
				y1T.setText(y2T.getText());
				}
			}
		});
		
		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				x2T.setText(e.getX()+"");
				y2T.setText(e.getY()+"");
				if(x1T.getText().equals(x2T.getText())&&y1T.getText().equals(y2T.getText()))
						return;
				// TODO Auto-generated method stub
				ShapeDTO dto = new ShapeDTO();
				dto.setX1(Integer.parseInt(x1T.getText().trim()));
				dto.setY1(Integer.parseInt(y1T.getText().trim()));
				dto.setX2(Integer.parseInt(x2T.getText().trim()));
				dto.setY2(Integer.parseInt(y2T.getText().trim()));
				dto.setZ1(Integer.parseInt(z1T.getText().trim()));
				dto.setZ2(Integer.parseInt(z2T.getText().trim()));
				
				if(line.isSelected()) dto.setShape(Figure.LINE);
				else if(circle.isSelected())dto.setShape(Figure.CIRCLE);
				else if(rect.isSelected())dto.setShape(Figure.RECT);
				else if(roundRect.isSelected())dto.setShape(Figure.ROUNDRECT);
				
				dto.setColor(combo.getSelectedIndex());
				dto.setFill(fill.isSelected());
				
				list.add(dto);
			}
		});
	}
	
	public JTextField getX1T(){
		return x1T;
	}

	public JTextField getY1T() {
		return y1T;
	}

	public JTextField getX2T() {
		return x2T;
	}

	public JTextField getY2T() {
		return y2T;
	}

	public JTextField getZ1T() {
		return z1T;
	}

	public JTextField getZ2T() {
		return z2T;
	}
	
	public JComboBox<String> getCombo(){
		return combo;
	}
	
	public JCheckBox getFill(){
		return fill;
	}
	
	public JRadioButton getLine(){
		return line;
	}
	
	public JRadioButton getCircle(){
		return circle;
	}
	
	public JRadioButton getRect(){
		return rect;
	}
	
	public JRadioButton getRoundRect(){
		return roundRect;
	}

	public ArrayList<ShapeDTO> getList(){
		return list;
	}
	
	public static void main(String[] args) {
		new MsPaint("���� �׸���");
	}
	
}












