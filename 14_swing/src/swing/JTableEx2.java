package swing;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx2 extends JFrame implements ActionListener{
	private ArrayList<PersonDTO> list;
	private Vector<String> vector;
	private DefaultTableModel model;
	private JTable table;
	private JButton addB,delB;
	
	public JTableEx2() {
		list = new ArrayList<PersonDTO>();
		list.add(new PersonDTO("hong","ȫ�浿","1111","010-228-1072"));
		list.add(new PersonDTO("conan","�ڳ�","3333","010-777-7777"));
			
		vector = new Vector<String>();
		vector.addElement("���̵�");
		vector.addElement("�̸�");
		vector.addElement("��й�ȣ");
		vector.addElement("�ڵ���");
		
		model = new DefaultTableModel(vector,0) { //vector,���Ǽ�
			@Override
			public boolean isCellEditable(int r, int c) {
				// TODO Auto-generated method stub
				return (c!=0) ? true : false;
			}
		}; //�� ���� ���� �����.
		
		addB = new JButton("�߰�");
		delB = new JButton("����");
		JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		p.add(addB);
		p.add(delB);
		
		
		//������
		for(PersonDTO dto : list) {
			Vector<String> v = new Vector<String>();
			v.add(dto.getId());
			v.add(dto.getName());
			v.add(dto.getPwd());
			v.add(dto.getTel());
			
			model.addRow(v);
		}
		
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table); //��ũ��Ʈ+scroll�� add�ҋ� scroll��
		
		Container con = this.getContentPane();
		con.add("Center",scroll);
		con.add("South",p);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,500,500); 
		setVisible(true);
		
		addB.addActionListener(this);
		delB.addActionListener(this);
	}
	
	public void insert() {
		
		
		String id = JOptionPane.showInputDialog(this,"���̵� �Է��ض�");
		if(id==null) return;
		for(int i=0; i<model.getRowCount(); i++) {
			if(id.equals(model.getValueAt(i, 0))) {
				JOptionPane.showMessageDialog(this, "������� ���̵�.");
				return;
			}
		}
		
		String name = JOptionPane.showInputDialog(this,"�̸� �Է��ض�");
		String pwd = JOptionPane.showInputDialog(this,"�н����� �Է��ض�");
		String tel = JOptionPane.showInputDialog(this,"���� �Է��ض�");
		
		Vector<String> v = new Vector<String>();
		v.add(id);
		v.add(name);
		v.add(pwd);
		v.add(tel);
		
		model.addRow(v);
		JOptionPane.showMessageDialog(this, "��ϿϷ�");
		
		//�Ȱ��� ���̵� ������ "�ߺ��� ���̵��"
	}
	
	public void delete() {
		String name = JOptionPane.showInputDialog(this, "�̸��� �Է��ض�");
		int sw = 0;
		
			for(int i=0; i<model.getRowCount(); i++) {
				if(name.equals(model.getValueAt(i, 1))) {
					model.removeRow(i);
					i--;
					sw = 1;
				}
			}//for
			
			if(sw==0)
				JOptionPane.showMessageDialog(this, "���� �̸��̴�.");
		
		
		//�̸��� �Է¹޾Ƽ� ����
		//�Ȱ��� �̸� ��� ����
		
		//�̸� ������ �޼��� ���̾�α� "�̸� ����"
		//remove row
	}
	
	public static void main(String[] args) {
		new JTableEx2();		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == addB) insert();
		else if(e.getSource() == delB) delete();
	}
	
}