package inheritance;

public class ChildTest extends SuperTest{
	private String name;
	private int age;
	
	public ChildTest() {
		System.out.println("기본 생성자");
	}
	
	public ChildTest(String name, int age, double weight, double height) {
		super(weight,height); //부모의 기본 생성자 호출, 반드시 첫째줄에 작성
		System.out.println("SubTest 생성자");
		this.name = name;
		this.age = age;
		//super.weight = weight;
		//super.height = height;
	}
	
	public void disp() { //disp() 부모, 자식 둘다 있음 == 오버라이드
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("몸무게 = "+weight);
		System.out.println("키 = "+height);
	}

	public static void main(String[] args) {
		ChildTest aa = new ChildTest("홍길동",25,79,185.3);
		aa.disp();
		System.out.println("-----------------------------------");
		SuperTest bb = new ChildTest("또치",16,52.3,162.3); //SuperTest 주소 참조
		bb.disp(); //SuperTest의 주소를 참조 하지만 자식의 disp를 호출한다. (자식 메소드가 우선)
	}
}
