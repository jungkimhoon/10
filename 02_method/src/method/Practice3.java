package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*�ʸ� �Է¹޾Ƽ� time()���� ��,��,�ʸ� ���Ͽ� ����Ѵ�

[������]
�ʸ� �Է��Ͻÿ� : 3850
1�ð� 4�� 10�� �Դϴ�*/

public class Practice3 {
	
	public void time(int a) {
		int hour = a / 3600 ;
		int min = (a % 3600) / 60 ;
		int sec = a % 3600 % 60 ;
		System.out.println(hour+"�ð� " +min+ "�� "+sec+"�� �Դϴ�.");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�ʸ� �Է��Ͻÿ� : " );
		int sec = Integer.parseInt(br.readLine());
		
		Practice3 aa = new Practice3();
		aa.time(sec);
		System.out.println("���α׷� ����");

	}

}
