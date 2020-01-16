package instance;

public class Variable2 {
	
	int a; // field (전역변수), 선언하면 초기화 자동, 인스턴스 변수
	static int b; //static 설정해서 new Variable 안써도 된다. 클래스 변수
	String str;

	public static void main(String[] args) {
		int a; // local variable (지역변수), 쓰레기값 => 반드시 초기화 
		a = 10;
		System.out.println("지역 a = "+a);
		System.out.println("필드 a = "+new Variable2().a); //new Variable2().a 전역변수 부른다!!!!
		
		System.out.println("필드 b = "+Variable2.b);
		System.out.println("필드 b = "+b); //field에 static 붙어있으므로 variable2.b 안써도 출력 가능 
		
		System.out.println("필드 str = "+new Variable2().str);
		
	}
		
	
}
