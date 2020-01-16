package constructor;

class ConstructorTest{
	private String name;
	private int age;
	
	public ConstructorTest() {
		System.out.println("�⺻ ������");
	}
	
	public ConstructorTest(String name) {
		this(); // Overload�� �ٸ� �����ڸ� ȣ��
		this.name = name;
	}
	
	public ConstructorTest(int age) {
		this("�ڳ�");
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
		System.out.println("aa�̸� = "+aa.getName() +"\taa���� = "+aa.getAge());
		System.out.println();

		ConstructorTest bb = new ConstructorTest("������");
		System.out.println("bb�̸� = "+bb.getName() +"\tbb���� = "+bb.getAge());
		System.out.println();
		
		ConstructorTest cc = new ConstructorTest(25);
		System.out.println("cc�̸� = "+cc.getName() +"\tcc���� = "+cc.getAge());
		System.out.println();
		

	}

}
