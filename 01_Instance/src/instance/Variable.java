package instance;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a;
		a = true;
		System.out.println("a = " + a);
		
		char b;
		b = 'A';
		System.out.println("b = " + b);
		
		char c;
		c = 65;
		//char => 65535���� ��� / ������ �ʰ��� error
		System.out.println("c = " + c);
		
		int d = 65;
		System.out.println("d = " + d);
		
		int e = 'A'; //�ƽ�Ű ��ȣ�� ǥ�õ�; int e = A; �� �Ұ�
		System.out.println("e = " + e);
		
		int f = (int)25L; //25L => Long��
		System.out.println("f = " + f);
		
		float g = 43.8F; //�Ǽ����� default�� double
		System.out.println("g = " + g);
		
		
	}

}
