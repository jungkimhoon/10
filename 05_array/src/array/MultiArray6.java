package array;

//[����]
//�ο����� �Է��Ͽ� �ο�����ŭ �����͸� �Է¹ް� ������ ����� ���Ͻÿ�
//����� �Ҽ����� 2°�ڸ����� ���
//
//[������]
//�ο��� : 2 (cnt)
//
//�̸��Է� : ȫ�浿 (name)
//����� �Է� : 2   (subjectCnt)
//����� �Է� : ���� (subject)
//����� �Է� : ����
//���� ���� �Է� : 95 (jumsu)
//���� ���� �Է� : 100
//---------------------
//�̸��Է� : �̱���
//����� �Է� : 3
//����� �Է� : ����
//����� �Է� : ����
//����� �Է� : ����
//���� ���� �Է� : 95
//���� ���� �Է� : 100
//���� ���� �Է� : 90
//---------------------
//
//�̸�     ����	  ����   	����     ���
//ȫ�浿    95	  100   xxx	xx.xx
//
//�̸�	����  	����   	����    	����     	���
//�̱���   	95   	100	   90	 xxx      xx.xx
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiArray6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("�ο��� : ");
		int num = Integer.parseInt(br.readLine());
		int[] student = new int[num];
		System.out.println();
		String[] name = new String[student.length];
		int[] subjectCnt = new int[student.length];
		int[] total = new int[student.length];
		int[] avg = new int[student.length];
		String[][] subject = new String[student.length][];
		int[][] jumsu =  new int[subjectCnt.length][];
		
		for(int i=0; i<student.length; i++) {			
			
			System.out.print("�̸� �Է� : ");
			name[i] = br.readLine();
			
			System.out.print("���� �� �Է� : ");
			subjectCnt[i] = Integer.parseInt(br.readLine());
			subject[i] = new String[subjectCnt[i]];
			jumsu[i] = new int[subjectCnt[i]];
			
			for(int j=0; j<subjectCnt[i]; j++) {
				System.out.print("����� �Է� : ");
				subject[i][j] = br.readLine();
							
			}
			for(int j=0; j<subjectCnt[i]; j++) {
				System.out.print(subject[i][j]+"���� �Է� : ");
				jumsu[i][j] = Integer.parseInt(br.readLine());
				total[i] += jumsu[i][j];
				avg[i] = total[i] / subjectCnt[i];
				
			}
			System.out.println("---------------------------");
								
		} //for
		System.out.println();
		for(int i=0; i<num; i++){
		
		
		System.out.print("�̸�");
		
			for(int j=0; j<subject[i].length; j++) {
				
				System.out.print("\t"+subject[i][j]);
						
			}
			System.out.print("\t����\t���");
			System.out.println();
			System.out.print(name[i]+"\t");
			for(int j=0; j<subjectCnt[i]; j++) {
				
				System.out.print(jumsu[i][j]+"\t");
						
			}	
			System.out.println(total[i]+"\t"+avg[i]);			
			System.out.println("");
		}
		
				

	}

}