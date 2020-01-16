package inheritance;

public class ChildTest extends SuperTest{
	private String name;
	private int age;
	
	public ChildTest() {
		System.out.println("�⺻ ������");
	}
	
	public ChildTest(String name, int age, double weight, double height) {
		super(weight,height); //�θ��� �⺻ ������ ȣ��, �ݵ�� ù°�ٿ� �ۼ�
		System.out.println("SubTest ������");
		this.name = name;
		this.age = age;
		//super.weight = weight;
		//super.height = height;
	}
	
	public void disp() { //disp() �θ�, �ڽ� �Ѵ� ���� == �������̵�
		System.out.println("�̸� = " + name);
		System.out.println("���� = " + age);
		System.out.println("������ = "+weight);
		System.out.println("Ű = "+height);
	}

	public static void main(String[] args) {
		ChildTest aa = new ChildTest("ȫ�浿",25,79,185.3);
		aa.disp();
		System.out.println("-----------------------------------");
		SuperTest bb = new ChildTest("��ġ",16,52.3,162.3); //SuperTest �ּ� ����
		bb.disp(); //SuperTest�� �ּҸ� ���� ������ �ڽ��� disp�� ȣ���Ѵ�. (�ڽ� �޼ҵ尡 �켱)
	}
}
