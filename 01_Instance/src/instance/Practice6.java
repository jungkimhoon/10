package instance;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'U';
		int result;
		result = (ch>='A' && ch<='Z') ? ch+32 : ch-32; //��� ����� int������ ���� 'A'= 65 'Z'= 90		
		
		System.out.println(ch + " -> "+(char)result);
	}

}
