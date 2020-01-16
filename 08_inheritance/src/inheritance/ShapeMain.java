package inheritance;
import java.util.Scanner;

class ShapeTest {
	protected Scanner sc = new Scanner(System.in);
	protected double area;
	
	public ShapeTest() {
		System.out.println("ShapeTest 기본생성자");
	}

	public void calcArea() {
		System.out.println("도형을 계산합니다.");
	}
	public void dispArea() {
		System.out.println("도형을 출력합니다.");
	}

}
//====================================================
class SamTest extends ShapeTest{
	private int base, height;
	
	public SamTest() {
		System.out.println("SamTest 기본생성자");
		System.out.print("밑변 : ");
		base = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();
	}
	
	@Override
	public void calcArea() { //override
		area = base*height/2.;
	}
	
	@Override
	public void dispArea() {
		System.out.println("삼각형 넓이 = "+area);
	}
	
}
//=================================================
class SaTest extends ShapeTest{
	private int width, height;
	
	public SaTest() {
		System.out.println("SaTest 기본생성자");
		System.out.print("가로 : ");
		width = sc.nextInt();
		System.out.print("세로 : ");
		height = sc.nextInt();
	}
	
	@Override
	public void calcArea() { //override
		area = width*height;
	}
	
	@Override
	public void dispArea() {
		System.out.println("사각형 넓이 = "+area);
	}
	
}
//=====================================================
class SadariTest extends ShapeTest{
	private int top, bottom, height;
	
	public SadariTest() {
		System.out.println("SadariTest 기본생성자");
		System.out.print("윗변 : ");
		top = sc.nextInt();
		System.out.print("밑변 : ");
		bottom = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();
	}
	
	@Override
	public void calcArea() { //override
		area = (top+bottom)*height/2.;
	}
	
	@Override
	public void dispArea() {
		System.out.println("사다리꼴 넓이 = "+area);
	}
	
	
}
//===================================================

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		SamTest sam = new SamTest();
		sam.calcArea();
		sam.dispArea();
		System.out.println();
		
		SaTest sa = new SaTest();
		sa.calcArea();
		sa.dispArea();
		System.out.println();
		
		SadariTest sada = new SadariTest();
		sada.calcArea();
		sada.dispArea();
		System.out.println();
		*/
		
		ShapeTest shape;
		shape = new SamTest(); // 부모는 자식 클래스를 참조 가능
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SaTest(); // 부모는 자식 클래스를 참조 가능
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SadariTest(); // 부모는 자식 클래스를 참조 가능
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		
		
	}

}
