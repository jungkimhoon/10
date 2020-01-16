package class_2;

public class StaticTest {
	private int a;	//�ʵ�, �ν��Ͻ� ����
	private static int b; //�ʵ�, Ŭ���� ����
	
	static {
		System.out.println("static �ʱ�ȭ ����");
		b = 3;
	}
	
	public StaticTest() {
		System.out.println("�⺻������");
		a = 3 ;
	}
	
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a = "+a+"\t b = "+b);
	}
	
	public static void output() {
		System.out.println("static method..");
		//System.out.println("a = "+a+"\t b = "+b); //error : static method������ �Ϲ� field ��� �Ұ�!
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest();
		st3.calc();
		st3.disp();
		System.out.println();
		
		StaticTest.output();
		output();
		st.output();

	}

}
