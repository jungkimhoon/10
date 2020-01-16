package inheritance;


public class SuperTest {
	protected double height, weight; //protected 사용해야 자식에게 허용 가능
	
	public SuperTest() {
		System.out.println("SuperTest 기본 생성자");
	}
	
	public SuperTest(double weight, double height) { //인수, 매개변수
		this.height = height;
		this.weight = weight;
	}

	public void disp() {
		System.out.println("몸무게 = "+weight);
		System.out.println("키 = "+height);
	}
}
