package chapter6;

public class C6to8 {

	
	public static void main(String[] args) {
		System.out.println("main(String[] args) ����");
		firstMethod();
		System.out.println("main(String[] args) ��");
		
	}
	
	static void firstMethod() {
		System.out.println("firstMethod() ����");
		secondMethod();
		System.out.println("firstMethod() ��");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod() ����");
		System.out.println("secondMethod() ��");
	}
}