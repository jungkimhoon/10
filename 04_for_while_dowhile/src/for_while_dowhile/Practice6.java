package for_while_dowhile;
//
//[����5] ���� ���� ���α׷�
//�߰����, �⸻���, ����Ʈ, �⼮������ �Է¹޾Ƽ� ����Ͻÿ�
//
//����1) (�߰�+�⸻)/2    ---> 60%
//          ����   	     ---> 20%
//          �⼮                ---> 20%     
//����2)  90�̻� 'A'����     		
//          80�̻� 'B'����        		  	 
//          70�̻� 'C'����        		  	 
//          60�̻� 'D'����        		  	 
//          ������ 'F'����
//����3)
//         A, B����  ---->"excellent"     
//         C, D����  ---->"good"
//         F����    ---->"poor"
//
//[������]
//�߰���縦 �Է��Ͻÿ� : 90
//�⸻��縦 �Է��Ͻÿ� : 89
//���������� �Է��Ͻÿ� : 99
//�⼮������ �Է��Ͻÿ� : 100
//
//����=93.20         <---�Ҽ����� 2°�ڸ�����
//����=A              
//��=excellent
//
//[����6]
//����5������ ����2, ����3�� if������ ó���� ���� switch�� �ٲٽÿ�

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice6 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("�߰���縦 �Է��ض� : ");
		int me = Integer.parseInt(br.readLine());
		
		System.out.print("�⸻��縦 �Է��ض� : ");
		int fe = Integer.parseInt(br.readLine());
		
		System.out.print("���������� �Է��ض� : ");
		int hw = Integer.parseInt(br.readLine());
		
		System.out.print("�⼮������ �Է��ض� : ");
		int atd = Integer.parseInt(br.readLine());
		
		int examScore = 0;
		examScore = (me + fe) / 2;
		
		double total = 0;
		total = (double)(examScore*0.6 + hw*0.2+ atd*0.2);
		
		char grade;
		String cmt;
		
		switch((int)(total / 10)) {
		case 9 : grade = 'A'; cmt = "excellent"; break;
		case 8 : grade = 'B'; cmt = "excellent"; break;
		case 7 : grade = 'C'; cmt = "good"; break;
		case 6 : grade = 'D'; cmt = "good"; break;
		default : grade = 'F'; cmt = "poor"; break;
		
			
		}
//		if(total >= 90)	{
//			grade = 'A';
//			cmt = "excellent";
//		}
//		else if (total >= 80) {
//			grade = 'B';
//			cmt = "excellent";
//		}
//		else if (total >= 70) {
//			grade = 'C';
//			cmt = "excellent";
//		}
//		else if (total >= 60) {
//			grade = 'D';
//			cmt = "excellent";
//		}
//		else {
//			grade = 'F';
//			cmt = "suck";
//		}
		System.out.println("���� : " +String.format("%.2f", total));
		System.out.println("���� : " +grade);
		System.out.println("�� : " +cmt);

	}

}
