package for_while_dowhile;
//
//���ڸ� �Է��Ͽ� ����� 7���� ���Ͻÿ�
//�� �����̸� �ٽ� �Է��ϰ� 0 �̸� ����
//
//������
//���� �Է� : -7
//���� �Է� : 8
//8 16 24 32 40 48 56
//
//�����Է� : 0
//���α׷� ����

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("[���� ���]");
		
		while(true) {
			System.out.print("���� �Է� : ");
			int num = Integer.parseInt(br.readLine());
			if(num < 0) continue;
			if(num == 0) {
				System.out.println("���α׷� ����");
				break;
				}
			for(int i=1;i<=7;i++) System.out.print(num*i+"  ");
	
			System.out.println();
			
		}//while

	}

}
