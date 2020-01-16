package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice8 {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public int input(int balance) throws IOException
	{
	
		System.out.print("���ݾ� : ");
		int money = Integer.parseInt(br.readLine());
			if(money % 10000 == 0)	{
				balance += money;
				}
			
			else System.out.println("���� ������ �Է��ϼ���.\n");
				
		System.out.println("����� �ܾ��� "+balance+"�� �Դϴ�.");
		return balance;
	}
	
	public int output(int balance) throws IOException
	{
		System.out.print("��ݾ� : ");
		int money = Integer.parseInt(br.readLine());
		if(money > balance) System.out.println("�ܾ��� �����մϴ�.");
		else balance -= money;
		System.out.println("����� �ܾ��� "+balance+"�� �Դϴ�.");
		return balance;
	}
	

	public static void main(String[] args) throws IOException {
		
		int balance = 0; 
		Practice8 pr = new Practice8(); 
		// TODO Auto-generated method stub
		while(true) {
			
			System.out.println();
			System.out.println("******************");
			System.out.println("    1. ����");
			System.out.println("    2. ���");
			System.out.println("    3. �ܰ�");
			System.out.println("    4. ����");
			System.out.println("******************");
			System.out.print("��ȣ ���� : ");
			int opt = Integer.parseInt(pr.br.readLine());
			
			if(opt == 1) {
				balance = pr.input(balance);
			}
			else if(opt == 2) {
				balance = pr.output(balance);
				
			}
			else if(opt == 3) System.out.println("����� �ܾ��� "+balance+"�� �Դϴ�.");
			else if(opt == 4){
				System.out.println("���α׷��� �����մϴ�."); 
				break;
				}
			else continue;
			}			
		}
	}



//
//����, ���, �ܰ�, ���� ����� �����ϴ� ���� ���°��� ���α׷��� �ۼ��Ͻÿ�.
//����) ������ input(), ����� output()���� ó���ϼ���
//
//[������]
//****************
//   1. ����
//   2. ���
//   3. �ܰ�
//   4. ����
//****************
//��ȣ ���� : 1
//���ݾ� : 10000
//����� �ܾ��� 10000�� �Դϴ�
//�Ǵ�
//���ݾ� : 12000
//���� ������ �Է��ϼ���
//
//****************
//   1. ����
//   2. ���
//   3. �ܰ�
//   4. ����
//****************
//��ȣ ���� : 2
//��ݾ� : 8000
//����� �ܾ��� 2000�� �Դϴ�
//�Ǵ� 
//��ݾ� : 18000
//�ܾ��� �����մϴ�
//
//****************
//   1. ����
//   2. ���
//   3. �ܰ�
//   4. ����
//****************
//��ȣ ���� : 3
//����� �ܾ��� 2000�� �Դϴ�
//
//****************
//   1. ����
//   2. ���
//   3. �ܰ�
//   4. ����
//****************
//��ȣ ���� : 4
//���α׷��� �����մϴ�.

