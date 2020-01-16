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
		list.add(new PersonDTO("hong","홍길동","1111","010-228-1072"));
		list.add(new PersonDTO("conan","코난","3333","010-777-7777"));
			
		vector = new Vector<String>();
		vector.addElement("아이디");
		vector.addElement("이름");
		vector.addElement("비밀번호");
		vector.addElement("핸드폰");
		
		model = new DefaultTableModel(vector,0) { //vector,행의수
			@Override
			public boolean isCellEditable(int r, int c) {
				// TODO Auto-generated method stub
				return (c!=0) ? true : false;
			}
		}; //빈 행의 수를 만든다.
		
		addB = new JButton("추가");
		delB = new JButton("삭제");
		JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		p.add(addB);
		p.add(delB);
		
		
		//데이터
		for(PersonDTO dto : list) {
			Vector<String> v = new Vector<String>();
			v.add(dto.getId());
			v.add(dto.getName());
			v.add(dto.getPwd());
			v.add(dto.getTel());
			
			model.addRow(v);
		}
		
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table); //스크립트+scroll은 add할떄 scroll로
		
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
		
		
		String id = JOptionPane.showInputDialog(this,"아이디 입력해라");
		if(id==null) return;
		for(int i=0; i<model.getRowCount(); i++) {
			if(id.equals(model.getValueAt(i, 0))) {
				JOptionPane.showMessageDialog(this, "사용중인 아이디.");
				return;
			}
		}
		
		String name = JOptionPane.showInputDialog(this,"이름 입력해라");
		String pwd = JOptionPane.showInputDialog(this,"패스워드 입력해라");
		String tel = JOptionPane.showInputDialog(this,"폰번 입력해라");
		
		Vector<String> v = new Vector<String>();
		v.add(id);
		v.add(name);
		v.add(pwd);
		v.add(tel);
		
		model.addRow(v);
		JOptionPane.showMessageDialog(this, "등록완료");
		
		//똑같은 아이디가 있으면 "중복된 아이디다"
	}
	
	public void delete() {
		String name = JOptionPane.showInputDialog(this, "이름을 입력해라");
		int sw = 0;
		
			for(int i=0; i<model.getRowCount(); i++) {
				if(name.equals(model.getValueAt(i, 1))) {
					model.removeRow(i);
					i--;
					sw = 1;
				}
			}//for
			
			if(sw==0)
				JOptionPane.showMessageDialog(this, "없는 이름이다.");
		
		
		//이름을 입력받아서 삭제
		//똑같은 이름 모두 삭제
		
		//이름 없으면 메세지 다이얼로그 "이름 없다"
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
