package method;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalculatorMain2 extends JFrame implements ActionListener{
	private JLabel dispL, inputL;   
	private JButton[] button;
	private StringBuffer inputBuf, dispBuf; 
	private double result;
	private int op;
	private boolean opCheck;
	private DecimalFormat df = new DecimalFormat("#.#######");
	
	
	public CalculatorMain2() {
      setLayout(null);
      dispL = new JLabel("", JLabel.RIGHT);
      dispL.setBackground(Color.WHITE);
      dispL.setOpaque(true);
      dispL.setBounds(9,10,375,50);
      dispL.setFont(new Font("Arial",Font.BOLD,15));
      
      inputL = new JLabel("0", JLabel.RIGHT);
      inputL.setBackground(Color.WHITE);
      inputL.setOpaque(true);
      inputL.setBounds(9,70,375,50);
      inputL.setFont(new Font("Arial",Font.BOLD,15));
      
      String[] title = {"←","C",
    		            "7","8","9","/",
    		            "4","5","6","x",
    		            "1","2","3","-",
    		            ".","0","=","+"};
      button = new JButton[18];
      for(int i=0; i<button.length; i++) {
    	  button[i] = new JButton(title[i]);
      }
      
      button[0].setBounds(9,130,185,50);// ←
      button[1].setBounds(199,130,185,50);// C
      
      button[2].setBounds(9,190,90,50);//7
      button[3].setBounds(104,190,90,50);//8
      button[4].setBounds(199,190,90,50);//9
      button[5].setBounds(294,190,90,50);// 나누기
      
      button[6].setBounds(9,250,90,50);//4
      button[7].setBounds(104,250,90,50);//5
      button[8].setBounds(199,250,90,50);//6
      button[9].setBounds(294,250,90,50);//*
      
      button[10].setBounds(9,310,90,50);//1
      button[11].setBounds(104,310,90,50);//2
      button[12].setBounds(199,310,90,50);//3
      button[13].setBounds(294,310,90,50);//-
      
      button[14].setBounds(9,370,90,50);//.
      button[15].setBounds(104,370,90,50);//0
      button[16].setBounds(199,370,90,50);//=
      button[17].setBounds(294,370,90,50);//+
      

      Container c = this.getContentPane(); // 컴포넌트가 들어갈 구역을 따로 만든다. ( getContentpane(); ) //안정적인 동작 도와줌
      c.add(dispL);
      c.add(inputL);
      for(int i=0; i<button.length; i++) {
    	  c.add(button[i]);
    	  //이벤트
    	  button[i].addActionListener(this);  
      }
      inputBuf = new StringBuffer("0");
	  dispBuf = new StringBuffer("");
      
      setTitle("계산기");
      setBounds(800,300,400,460);
      setResizable(false);
      setVisible(true);
      
      addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});	
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		DecimalFormat df = new DecimalFormat("##.##########");
		//숫자
		String pushB = e.getActionCommand();
		if(pushB=="1" || 
		   pushB=="2" || 
		   pushB=="3" || 
		   pushB=="4" ||
		   pushB=="5" ||
		   pushB=="6" ||
		   pushB=="7" ||
		   pushB=="8" ||
		   pushB=="9" ||
		   pushB=="0") {
			if(inputBuf.toString().equals("0")) {
				inputBuf.delete(0,1);
			}
			inputBuf.append(pushB);
			inputL.setText(inputBuf+"");
			
			opCheck = false;
			
		}else if(pushB=="←") {
			inputBuf.delete(inputBuf.length()-1, inputBuf.length());
			if(inputBuf.length()==0) {
				inputBuf.append("0");
			}
			inputL.setText(inputBuf+"");
		}else if(pushB=="C") {
			dispBuf.delete(0, dispBuf.length());
			inputBuf.delete(0, inputBuf.length());
			inputBuf.append("0");
	
			dispL.setText("");
			inputL.setText("0");
			
			result = 0;
			op = 0;
			opCheck = false;
			
		}else if(pushB==".") {
			if(inputBuf.indexOf(".")==-1) inputBuf.append(".");
			inputL.setText(inputBuf+"");
			
		}else if(pushB=="+") {
			if(!opCheck) {				
				calc();
				dispBuf.append(inputBuf+" + ");
				op = '+';
				
				dispL.setText(dispBuf+"");
				inputL.setText(df.format(result));
				inputBuf.delete(0,  inputBuf.length());
				
				opCheck = true;
			}
		}else if(pushB=="-") {
			if(!opCheck) {				
				calc();
				dispBuf.append(inputBuf+" - ");
				op = '-';
				
				dispL.setText(dispBuf+"");
				inputL.setText(df.format(result));
				inputBuf.delete(0,  inputBuf.length());
				
				opCheck = true;
			}
			
		}else if(pushB=="x") {
			if(!opCheck) {				
				calc();
				dispBuf.append(inputBuf+" x ");
				op = 'x';
				
				dispL.setText(dispBuf+"");
				inputL.setText(df.format(result));
				inputBuf.delete(0,  inputBuf.length());
				
				opCheck = true;
			}
			
		}else if(pushB=="/") {
			if(!opCheck) {				
				calc();
				dispBuf.append(inputBuf+" / ");
				op = '/';
				
				dispL.setText(dispBuf+"");
				inputL.setText(df.format(result));
				inputBuf.delete(0,  inputBuf.length());
				
				opCheck = true;
			}
			
		}else if(pushB =="=") {
			if(!opCheck) {
				calc();
				dispBuf.append(inputBuf+" = ");
				
				dispL.setText(dispBuf+"");
				inputL.setText(df.format(result));
				inputBuf.delete(0,  inputBuf.length());
				dispBuf.delete(0, dispBuf.length());
				result = 0;
				op=0;
				opCheck = false;
			}
		}
	}
	
	public void calc() {
		if(op==0) result = Double.parseDouble(inputBuf+"");
		else if(op =='+') result += Double.parseDouble(inputBuf+"");
		else if(op =='-') result -= Double.parseDouble(inputBuf+"");
		else if(op =='x') result *= Double.parseDouble(inputBuf+"");
		else if(op =='/') result /= Double.parseDouble(inputBuf+"");
		
	}
	
	public static void main(String[] args) {
	      new CalculatorMain2();
	   }
}











