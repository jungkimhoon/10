package class_1;

class ShapeTest {
	
	public static final double PI = 3.141592; //상수화, 전부 대문자로 쓴다 (final) public static으로 국룰처리
	
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
		//ShapeTest.PI = 100; static final 주작 불가
		
		System.out.println("PI = "+ShapeTest.PI); //static 사용은 객체 생성 불필요함.
		
		ShapeTest st = new ShapeTest();
		System.out.println("원의 넓이 : " +st.area(3));
		System.out.println("삼각형의 넓이 : " +st.area(5,7));
		System.out.println("사다리꼴의 넓이 : " +st.area(2, 3, 5));
		
	}

}
