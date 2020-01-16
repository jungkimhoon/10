package abstract_1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class WindowTest extends Frame {
	
	public WindowTest() {
		
		setForeground(Color.white);
		setBackground(new Color(78,69,243));
		setBounds(800,400,300,400);
		setVisible(true);
		
	}
	
	@Override
	public void paint(Graphics g) { //Graphics 에서 도구 제공 //Call Back Method //JVM이 Frame창이 만들어졌을때 해당 메소드 호출 (setVisible(true)일 때) // repaint()
		g.drawString("이미지", 50, 80);
		
		Toolkit t = Toolkit.getDefaultToolkit(); //생성 (new한 것과 동일)
		Image img = t.getImage("D:/java_se/WORK1/10_interface/godol.jpg"); //이미지 불러오기
		g.drawImage(img, 20, 100, this);
		
		
	}
		
	
	
	
	public static void main(String[] args) {
		
		new WindowTest();
		
	}

}
