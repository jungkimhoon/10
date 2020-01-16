package instance;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a;
		a = true;
		System.out.println("a = " + a);
		
		char b;
		b = 'A';
		System.out.println("b = " + b);
		
		char c;
		c = 65;
		//char => 65535까지 허용 / 허용범위 초과시 error
		System.out.println("c = " + c);
		
		int d = 65;
		System.out.println("d = " + d);
		
		int e = 'A'; //아스키 번호로 표시됨; int e = A; 는 불가
		System.out.println("e = " + e);
		
		int f = (int)25L; //25L => Long형
		System.out.println("f = " + f);
		
		float g = 43.8F; //실수형은 default가 double
		System.out.println("g = " + g);
		
		
	}

}
