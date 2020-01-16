package constructor;

class ConstructorTest{
	private String name;
	private int age;
	
	public ConstructorTest() {
		System.out.println("기본 생성자");
	}
	
	public ConstructorTest(String name) {
		this(); // Overload된 다른 생성자를 호출
		this.name = name;
	}
	
	public ConstructorTest(int age) {
		this("코난");
		this.age = age;
	}

		
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}

//---------------------------------------------
public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorTest aa = new ConstructorTest();
		System.out.println("aa이름 = "+aa.getName() +"\taa나이 = "+aa.getAge());
		System.out.println();

		ConstructorTest bb = new ConstructorTest("김정훈");
		System.out.println("bb이름 = "+bb.getName() +"\tbb나이 = "+bb.getAge());
		System.out.println();
		
		ConstructorTest cc = new ConstructorTest(25);
		System.out.println("cc이름 = "+cc.getName() +"\tcc나이 = "+cc.getAge());
		System.out.println();
		

	}

}
