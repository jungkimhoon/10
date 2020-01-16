package inheritance;

public class SubTest extends SuperTest{
	private String name;
	private int age;
	
	public SubTest() {
		System.out.println("SubTest 기본 생성자");
	}
	
	public SubTest(String name, int age, double weight, double height) {
		System.out.println("SubTest 생성자");
		this.name = name;
		this.age = age;
		super.weight = weight;
		super.height = height;
	}
	
	public void output() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}
	
	public static void main(String[] args) {
		SubTest aa = new SubTest("홍길동",25,79,185.3); //부모 생성자 까지 2번 호출
		aa.output();
		System.out.println("-----------------------------------");
		aa.disp(); //본인 먼저 찾고 부모 메소드 찾는다.
		
		
		System.out.println("-----------------------------------");
		SuperTest bb = new SubTest("또치",16,52.3,162.3); //주소의 참조값이 SuperTest를 참조하라.
		bb.disp();
		//bb.output(); 자식 클래스 메소드 불가 에러
	
		
		
	}
	
}
