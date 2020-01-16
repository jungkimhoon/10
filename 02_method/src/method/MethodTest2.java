package method;


public class MethodTest2 {
	

	public static void main(String[] args) {
		
		MethodTest2.disp(); //ȣ��
		disp();
		
		new MethodTest2().output(); //�������� ��ļ
		MethodTest2 aa = new MethodTest2(); //��������.. ����..
		aa.output();
		System.out.println("aa = "+aa); //aa�ּ� 		method.MethodTest2@15db9742 ��Ű��.Ŭ����@16����		.toString()������
		System.out.println("aa = "+aa.toString());
		System.out.println("aa = "+aa.hashCode()); //������ �ִ� 16���� �ּҸ� 10���� �ּҷ�
		System.out.println();
		
		int sum = aa.plus(25, 36);
		int sub = aa.minus(25, 36);
		int mul = aa.multiply(25, 36);
		double div = aa.divide(25, 36);
		
		System.out.println("25 + 36 : "+sum);
		System.out.println("25 - 36 : "+sub);
		System.out.println("25 * 36 : "+mul);
		System.out.println("25 / 36 : "+String.format("%.2f", div));
		
	}
	
	//�޼ҵ� ����
	public static void disp() { 
		System.out.println("static method");
	}
	
	public void output() {
		System.out.println("non-static method");
	}

	public int plus(int a, int b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public double divide(int a, int b) {
		return (double)a/b;
	}

}
