package inheritance;


public class SuperTest {
	protected double height, weight; //protected ����ؾ� �ڽĿ��� ��� ����
	
	public SuperTest() {
		System.out.println("SuperTest �⺻ ������");
	}
	
	public SuperTest(double weight, double height) { //�μ�, �Ű�����
		this.height = height;
		this.weight = weight;
	}

	public void disp() {
		System.out.println("������ = "+weight);
		System.out.println("Ű = "+height);
	}
}
