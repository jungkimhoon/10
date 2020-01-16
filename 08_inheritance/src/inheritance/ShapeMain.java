package inheritance;
import java.util.Scanner;

class ShapeTest {
	protected Scanner sc = new Scanner(System.in);
	protected double area;
	
	public ShapeTest() {
		System.out.println("ShapeTest �⺻������");
	}

	public void calcArea() {
		System.out.println("������ ����մϴ�.");
	}
	public void dispArea() {
		System.out.println("������ ����մϴ�.");
	}

}
//====================================================
class SamTest extends ShapeTest{
	private int base, height;
	
	public SamTest() {
		System.out.println("SamTest �⺻������");
		System.out.print("�غ� : ");
		base = sc.nextInt();
		System.out.print("���� : ");
		height = sc.nextInt();
	}
	
	@Override
	public void calcArea() { //override
		area = base*height/2.;
	}
	
	@Override
	public void dispArea() {
		System.out.println("�ﰢ�� ���� = "+area);
	}
	
}
//=================================================
class SaTest extends ShapeTest{
	private int width, height;
	
	public SaTest() {
		System.out.println("SaTest �⺻������");
		System.out.print("���� : ");
		width = sc.nextInt();
		System.out.print("���� : ");
		height = sc.nextInt();
	}
	
	@Override
	public void calcArea() { //override
		area = width*height;
	}
	
	@Override
	public void dispArea() {
		System.out.println("�簢�� ���� = "+area);
	}
	
}
//=====================================================
class SadariTest extends ShapeTest{
	private int top, bottom, height;
	
	public SadariTest() {
		System.out.println("SadariTest �⺻������");
		System.out.print("���� : ");
		top = sc.nextInt();
		System.out.print("�غ� : ");
		bottom = sc.nextInt();
		System.out.print("���� : ");
		height = sc.nextInt();
	}
	
	@Override
	public void calcArea() { //override
		area = (top+bottom)*height/2.;
	}
	
	@Override
	public void dispArea() {
		System.out.println("��ٸ��� ���� = "+area);
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
		shape = new SamTest(); // �θ�� �ڽ� Ŭ������ ���� ����
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SaTest(); // �θ�� �ڽ� Ŭ������ ���� ����
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SadariTest(); // �θ�� �ڽ� Ŭ������ ���� ����
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		
		
	}

}
