package method;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 25;
		double b = (double)a/3; //cast���� (����ȯ)
		
		/*
		 * String a = "25";
		 * int b = (int)a; ==== ��Ʈ�� Ÿ�� => Ŭ���� ; ����ȯ �ȵȴ�.; parseInt ���
		 */
		
		int c = 5;		//�⺻�� int
		Integer d = c;	//AutoBoxing �⺻�� => ��ü�� �ڵ����� ��ȯ
		// Integer d = new Integer(c);	//Ŭ������  Integer JDK 1.5 ���� ���� ���

		Integer e = 5;
		int f = e; 		//UnAutoBoxing ��ü�� => �⺻�� �ڵ����� ��ȯ
		//int f = e.intValue(); // JDK 1.5 ���� ���
	}

}
