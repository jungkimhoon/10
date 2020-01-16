package method;


public class MethodTest2 {
	

	public static void main(String[] args) {
		
		MethodTest2.disp(); //호출
		disp();
		
		new MethodTest2().output(); //익혀놔라 새캬
		MethodTest2 aa = new MethodTest2(); //익혀놔라.. 제발..
		aa.output();
		System.out.println("aa = "+aa); //aa주소 		method.MethodTest2@15db9742 패키지.클래스@16진수		.toString()생략됨
		System.out.println("aa = "+aa.toString());
		System.out.println("aa = "+aa.hashCode()); //가지고 있던 16진수 주소를 10진수 주소로
		System.out.println();
		
		int sum = aa.plus(25, 36);
		int sub = aa.minus(25, 36);
		int mul = aa.multiply(25, 36);
		double div = aa.divide(25, 36);
		
		System.out.println("25 + 36 : "+sum);
		System.out.println("25 - 36 : "+sub);
		System.out.println("25 * 36 : "+mul);
		System.out.println("25 / 36 : "+String.format("%.2f", div));
		
	}
	
	//메소드 구현
	public static void disp() { 
		System.out.println("static method");
	}
	
	public void output() {
		System.out.println("non-static method");
	}

	public int plus(int a, int b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public double divide(int a, int b) {
		return (double)a/b;
	}

}
