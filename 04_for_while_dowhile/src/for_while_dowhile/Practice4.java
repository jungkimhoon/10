package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//
//[����4] ���� ����
//10~99 ������ ������ 2��(a,b) �߻��Ͽ� ���� ���ߴ� ����
//�������� �� 5������ �����Ѵ�
//1������ ���� 20���� ���
//���� Ʋ���� ��ȸ�� 1�� �� �����Ѵ�
//
//[������]
//[1] 25 + 36 = 45
//Ʋ�ȴ�
//[1] 25 + 36 = 61
//������
//
//[2] 78 + 10 = 100
//Ʋ�ȴ�
//[2] 78 + 10 = 95
//Ʋ�ȴ�...���� :
//...
//
//����� �� x������ ���߾ xx�� �Դϴ�
//
//continue(y/n) : w
//continue(y/n) : n
//���α׷��� �����մϴ�
public class Practice4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		while(true) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int point = 0;
		int correct = 0;
		
		for(int i=1; i<=5; i++) {
			int a = (int)(Math.random()*90) + 10;
			int b = (int)(Math.random()*90) + 10;
			int randSum = a + b;
			System.out.println(randSum);
			
			
			for(int j=1; j<=2; j++) {
				System.out.print("["+i+"] "+a+" + "+b+" = ");
				int num = Integer.parseInt(br.readLine());
				
				if(randSum == num) {
					System.out.println("������"); 
					point += 20;
					correct++;
					break;
					}					
				else {
					if(j==2) System.out.println("Ʋ�ȴ�.. ������"+(a+b));
					else System.out.println("Ʋ�ȴ�");
					}//if else
			}
				
			}//for end
		 System.out.println("����� �� "+correct+"������ ���缭 "+point+"���̴�.");
			
			while(true) {
				System.out.print("���ҷ�?  Y/N : ");
				String ctn = br.readLine();
				
				if(ctn.equals("n") || ctn.equals("N")) {
					System.exit(0);
				}
				else if(ctn.equals("y") || ctn.equals("Y")) break;
				}//continue while
		}//main
	}
				

	}


