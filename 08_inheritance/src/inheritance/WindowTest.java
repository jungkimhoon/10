package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;



public class WindowTest extends Frame {
	public WindowTest() {
		//setTitle("ㅎㅇ"); 타이틀 생성
		super("내가 만든 타이틀"); //부모 호출
		//new Frame("내가 만든 윈도우").setVisible(true); 새로운 창으로 하나 더 띄움
		
		setForeground(Color.white);
		setBackground(new Color(250,69,243));
		//this.setSize(300,400);
		setBounds(800,400,300,400);
		setVisible(true);
	}

	
	@Override
	public void paint(Graphics g) { //Graphics 에서 도구 제공 //Call Back Method //JVM이 Frame창이 만들어졌을때 해당 메소드 호출 (setVisible(true)일 때) // repaint()
		g.drawLine(70, 100, 230, 300);
		g.drawLine(230, 100, 70, 300); //라인
		g.drawRect(70,100,160,200); 	//사각형
		g.drawOval(70, 100, 160, 200);	//원
		g.drawString("여기",200,200);
	}



	public static void main(String[] args) {
		new WindowTest();
		
		
	}

}
