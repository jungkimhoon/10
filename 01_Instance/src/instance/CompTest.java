package instance;	

public class CompTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 60;
		String result = score>=80 && score<=100 ? "�հ�" : "���հ�" ;
		System.out.println("��� = "+result);
		
		result = score%2 == 0 ? "¦��" : "Ȧ��";
		System.out.println("��� = "+result);
		
		int b = 50;
		result = score > b ? score+"" : b+""; //int�� score, b�� ""�� ���ؼ� string ó����.
		System.out.println("ū �� = "+result);
		
		int power = score < b ? score : b;
		System.out.println("���� �� = "+power);
	}

}
