package class_1;

class ShapeTest {
	
	public static final double PI = 3.141592; //���ȭ, ���� �빮�ڷ� ���� (final) public static���� ����ó��
	
	public double area(int a) {
		return a*a*PI; 
	}
	
	public double area(int a, int b) {
		return a*b/2.; 
	}
	
	public double area(int a, int b, int c) {
		return (a+b)*c/2.; 
	}

}

public class Practice2 {

	public static void main(String[] args) {
		//ShapeTest.PI = 100; static final ���� �Ұ�
		
		System.out.println("PI = "+ShapeTest.PI); //static ����� ��ü ���� ���ʿ���.
		
		ShapeTest st = new ShapeTest();
		System.out.println("���� ���� : " +st.area(3));
		System.out.println("�ﰢ���� ���� : " +st.area(5,7));
		System.out.println("��ٸ����� ���� : " +st.area(2, 3, 5));
		
	}

}
