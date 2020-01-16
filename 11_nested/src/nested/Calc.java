package nested;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc extends JFrame implements ActionListener{
	StringBuffer sb = new StringBuffer();
	StringBuffer sb2 = new StringBuffer();
	double num1, num2;
	private JButton[] b = new JButton[18];
	private JLabel lb1, lb2;
	
	public Calc() {
		this.setLayout(null);
		
		String[] title = {".","0","=","+",
				"1","2","3","-",
				"4","5","6","X",
				"7","8","9","/",
				"¡ç","C"};
		
		for(int i=0; i<title.length; i++) {
			b[i] = new JButton(title[i]);
		}
	
		int k=0;
		for(int i=330; i>=180; i-=50) {
			for(int j=5; j<=300; j+=95) {
				b[k].setBounds(j,i,87,40);
				k++;
			}
		}
		
		b[16].setBounds(5, 130, 182, 40);
		b[17].setBounds(195, 130, 182, 40);
		
		lb2 = new JLabel("0",JLabel.RIGHT);
		lb1 = new JLabel("",JLabel.RIGHT);
		lb2.setBackground(Color.WHITE);
		lb2.setOpaque(true);
		lb1.setBackground(Color.WHITE);
		lb1.setOpaque(true);
		lb2.setBounds(5, 70, 374, 50);
		lb1.setBounds(5, 10, 374, 50);
		
		Container c = this.getContentPane();
		for(int i=0; i<16; i++) {
			c.add(b[i]);
		}
		c.add(b[16]);
		c.add(b[17]);
		c.add(lb1);
		c.add(lb2);
		
		setTitle("°è»ê±â");
		setBackground(new Color(200,255,200));
		setBounds(800,3,390,410);
		setResizable(false);
		setVisible(true);
		
		for(int i=0; i<b.length;i++) {
			b[i].addActionListener(this);
		}
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calc();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getActionCommand()=="=") {
			String num = lb1.getText();
			sb.append(sb2.toString());
			sb.append("=");

			lb1.setText(sb.toString());			
			lb2.setText(sb2.toString());
			
		}
		
		if(e.getActionCommand()=="0") {
			if(sb2.toString().equals("0")) {
				lb1.setText(sb.toString());
			}
			else{
				sb2.append(0);
				lb2.setText(sb2.toString());			
			}
		}
		
		if(e.getActionCommand()=="1") {
			if(sb.length()==1 && sb.toString().equals("0")) {
				sb.delete(0, 1);
				lb1.setText(sb.toString());				
			}
			if(sb2.length()==1 && sb2.toString().equals("0")) {
				sb2.delete(0, 1);
				sb2.append(1);
				lb2.setText(sb.toString());				
			}
			else{
				sb2.append(1);
				lb2.setText(sb2.toString());
			}
		}
		
		if(e.getActionCommand()=="2") {
			if(sb.length()==1 && sb.toString().equals("0")) {
				sb.delete(0, 1);
				lb1.setText(sb.toString());				
			}
			if(sb2.length()==1 && sb2.toString().equals("0")) {
				sb2.delete(0, 1);
				sb2.append(2);
				lb1.setText(sb.toString());
			}
			else{
				sb2.append(2);
				lb2.setText(sb2.toString());
			}
		}
		
		if(e.getActionCommand()=="3") {
			if(sb.length()==1 && sb.toString().equals("0")) {
				sb.delete(0, 1);
				lb1.setText(sb.toString());				
			}
			if(sb2.length()==1 && sb2.toString().equals("0")) {
				sb2.delete(0, 1);
				sb2.append(3);
				lb1.setText(sb.toString());
			}
			else{
				sb2.append(3);			
				lb2.setText(sb2.toString());
			}
		}
		
		if(e.getActionCommand()=="4") {
			if(sb.length()==1 && sb.toString().equals("0")) {
				sb.delete(0, 1);
				lb1.setText(sb.toString());				
			}
			if(sb2.length()==1 && sb2.toString().equals("0")) {
				sb2.delete(0, 1);
				sb2.append(4);
				lb1.setText(sb.toString());
			}
			else{
				sb2.append(4);			
				lb2.setText(sb2.toString());
			}
		}
		
		if(e.getActionCommand()=="5") {
			if(sb.length()==1 && sb.toString().equals("0")) {
				sb.delete(0, 1);
				lb1.setText(sb.toString());				
			}
			if(sb2.length()==1 && sb2.toString().equals("0")) {
				sb2.delete(0, 1);
				sb2.append(5);
				lb1.setText(sb.toString());
			}
			else{
				sb2.append(5);				
				lb2.setText(sb2.toString());
			}
		}
		
		if(e.getActionCommand()=="6") {
			if(sb.length()==1 && sb.toString().equals("0")) {
				sb.delete(0, 1);
				lb1.setText(sb.toString());				
			}
			if(sb2.length()==1 && sb2.toString().equals("0")) {
				sb2.delete(0, 1);
				sb2.append(6);
				lb1.setText(sb.toString());
			}
			else{
				sb2.append(6);			
				lb2.setText(sb2.toString());
			}
		}
		
		if(e.getActionCommand()=="7") {
			if(sb.length()==1 && sb.toString().equals("0")) {
				sb.delete(0, 1);
				lb1.setText(sb.toString());				
			}
			if(sb2.length()==1 && sb2.toString().equals("0")) {
				sb2.delete(0, 1);
				sb2.append(7);
				lb1.setText(sb.toString());
			}
			else{
				sb2.append(7);				
				lb2.setText(sb2.toString());
			}
		}
		
		if(e.getActionCommand()=="8") {
			if(sb.length()==1 && sb.toString().equals("0")) {
				sb.delete(0, 1);
				lb1.setText(sb.toString());				
			}
			if(sb2.length()==1 && sb2.toString().equals("0")) {
				sb2.delete(0, 1);
				sb2.append(8);
				lb1.setText(sb.toString());
			}
			else{
				sb2.append(8);
				lb2.setText(sb2.toString());
				}
		}
		
		if(e.getActionCommand()=="9") {
			if(sb.length()==1 && sb.toString().equals("0")) {
				sb.delete(0, 1);
				lb1.setText(sb.toString());				
			}
			if(sb2.length()==1 && sb2.toString().equals("0")) {
				sb2.delete(0, 1);
				sb2.append(9);
				lb1.setText(sb.toString());
			}
			else{
				sb2.append(9);
				lb2.setText(sb2.toString());
			}
		}
		
		if(e.getActionCommand()==".") {
			if(sb2.toString().indexOf(".")==-1) {	
				sb2.append(".");
				lb2.setText(sb2.toString());
			}
			else{
				lb2.setText(sb2.toString());
			}
		}
		
		if(e.getActionCommand()=="+") {
			if(sb.toString() != null && sb.toString().charAt(sb.length()) == '+') { 
				num1 += Double.parseDouble(sb2.toString());
				sb2.append(num1);
				
				}
			else if(sb.toString().substring(sb.length()-1, sb.length()) == "-") {}
			else if(sb.toString().substring(sb.length()-1, sb.length()) == "/") {}
			else if(sb.toString().substring(sb.length()-1, sb.length()) == "X") {}
			else {
				num1 = Double.parseDouble(sb2.toString());
				sb2.append("+");
				sb.append(sb2);
				lb1.setText(sb.toString());
				sb2.delete(0, sb2.length());
			}
		
		
//						
//						num1 = Double.parseDouble(lb2.getText()) + Double.parseDouble(lb1.getText().substring(0,lb1.getText().length()-1));
//						sb2.delete(0, sb2.length());
//						sb2.append(num1);
//						lb1.setText(sb.toString());
//						lb2.setText(sb2.toString().substring(0,sb.toString().length()-1));
//						
//					}	
//			
//			else{
		//				sb.append(sb2.toString());
		//				sb.append("+");
		//							
		//				lb1.setText(sb.toString());			
		//				lb2.setText(sb2.toString());
		//			
		//				sb2.delete(0, sb2.length());
//			}
						
		}
			
		
		if(e.getActionCommand()=="-") {
			
			sb.append(sb2.toString());
			sb.append("-");
			if(sb.toString().charAt(sb.length()-1)=='-'){
				lb1.setText(sb.toString());
			}
			else {
				
				lb1.setText(sb.toString());			
				lb2.setText(sb2.toString());
				sb2.delete(0, sb2.length());
			}
		}
		
		if(e.getActionCommand()=="X") {
			
			sb.append(sb2.toString());
			sb.append("X");
			if(sb.toString().charAt(sb.length()-1)=='X'){
				lb1.setText(sb.toString());
			}
			else {
				
				lb1.setText(sb.toString());			
				lb2.setText(sb2.toString());
				sb2.delete(0, sb2.length());
			}
		}
		if(e.getActionCommand()=="/") {

			sb.append(sb2.toString());
			sb.append("/");
			if(sb.toString().charAt(sb.length()-1)=='/'){	
				lb1.setText(sb.toString());
			}
			else {
				lb1.setText(sb.toString());			
				lb2.setText(sb2.toString());
				sb2.delete(0, sb2.length());
			}
		}
		if(e.getActionCommand()=="¡ç") {
			if(sb2.length()==1) {
				sb2.delete(0, 1);
				sb2.append(0); 
				lb2.setText(sb2.toString()); 
			}
			else { 
			sb2.delete(sb2.length()-1, sb2.length());
			lb2.setText(sb2.toString());
			}
		}
		if(e.getActionCommand()=="C") {
			sb.delete(0, sb.length());
			sb2.delete(0, sb2.length());
			sb.append(0);
			sb2.append(0);
			lb1.setText(sb.toString());
			lb2.setText(sb2.toString());
		}
		
		
	}	
}
