package Doit2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice8 {
	
	public int input(int money, int balance)
	{
		balance += money;
		System.out.println("����� �ܾ��� "+balance+"�� �Դϴ�.");
		return balance;
	}
	
	public int output(int money, int balance)
	{
		balance -= money;
		System.out.println("����� �ܾ��� "+balance+"�� �Դϴ�.");
		return balance;
	}
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int balance = 0; 
		Practice8 pr = new Practice8(); 
		// TODO Auto-generated method stub
		while(true) {
					
			int money;
			
			System.out.println("******************");
			System.out.println("    1. ����");
			System.out.println("    2. ���");
			System.out.println("    3. �ܰ�");
			System.out.println("    4. ����");
			System.out.println("******************");
			System.out.print("��ȣ ���� : ");
			int opt = Integer.parseInt(br.readLine());
			if(opt == 1) {
				System.out.print("���ݾ� : ");
				money = Integer.parseInt(br.readLine());
					if(money % 10000 == 0)	{
						balance = pr.input(money, balance);
						}
					
					else System.out.println("���� ������ �Է��ϼ���.\n");
			}
			
			else if(opt == 2) {
				System.out.print("��ݾ� : ");
				money = Integer.parseInt(br.readLine());
				if(money > balance) System.out.println("�ܾ��� �����մϴ�.");
				else balance = pr.output(money, balance);
			}
			
			else if(opt == 3) System.out.println("����� �ܾ��� "+balance+"�� �Դϴ�.");
			else {
				System.out.println("���α׷��� �����մϴ�."); 
				break;
				}
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
