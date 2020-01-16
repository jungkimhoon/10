package swing;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;

class JTableModel extends AbstractTableModel{
	Object[][] data = {{"Nari","����ġ",new Integer(1234),"����ģ��"},
			{"One","������",new Integer(1111),"������"},
			{"two","������",new Integer(2222),"�Ϳ�����"},
			{"three","�ƶ�ġ",new Integer(3333), "���Ƹ�ģ��"}};
	String[] name = {"���̵�","�̸�","��й�ȣ","����"};
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return name.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public Object getValueAt(int r, int c) {
		// TODO Auto-generated method stub
		return data[r][c];
	}
	@Override
	public boolean isCellEditable(int r, int c) {
		// TODO Auto-generated method stub
		return (c!=0) ? true : false;
	}
	
	@Override
	public String getColumnName(int c) {
		// TODO Auto-generated method stub
		return name[c];
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		data[rowIndex][columnIndex] = aValue;
	}
}

public class JTableEx extends JFrame{
	JTable table;
	JTableModel model;
	
	public JTableEx() {
		model = new JTableModel(); 
		table = new JTable(model);
		add(new JScrollPane(table));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,300,300); 
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new JTableEx();
	}
}


