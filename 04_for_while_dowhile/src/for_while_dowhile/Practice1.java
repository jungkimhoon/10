package for_while_dowhile;
/*
 * [����1] ���������� ���� - if��

[������]
����(1),����(2),��(3) �� ��ȣ �Է� : 3 (user)
��ǻ�� : ����	�� : ���ڱ�
You Win!!
�� �ҷ�(Y/N) : y

����(1),����(2),��(3) �� ��ȣ �Է� : 3 (user)
��ǻ�� : ����	�� : ���ڱ�
You Lose!!
�� �ҷ�(Y/N) : y

����(1),����(2),��(3) �� ��ȣ �Է� : 2 (user)
��ǻ�� : ����	�� : ����
You Draw!!
�� �ҷ�(Y/N) : n
���α׷��� �����մϴ�
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(;;) {
		int com = (int)(Math.random()*3)+1;
		System.out.print("����(1) ����(2) ��(3) �� ��ȣ �Է� : ");
		int user = Integer.parseInt(br.readLine());
		
		if(user == 1) {//����
			if(com==1){//����
				System.out.println("��ǻ�� : ����\t �� : ����");
				System.out.println("You Draw!!");
			}else if (com == 2) { //����
				System.out.println("��ǻ�� : ����\t �� : ����");
				System.out.println("You Lose!!");
			} else if (com == 3) {//��
				System.out.println("��ǻ�� : ���ڱ�\t �� : ����");
				System.out.println("You Win!!");
			}
			
		} else if(user == 2) {//����
			if (com == 1) {
				System.out.println("��ǻ�� : ����\t �� : ����");
				System.out.println("You Win!!");
			} else if (com == 2) {
				System.out.println("��ǻ�� : ����\t �� : ����");
				System.out.println("You Draw!!");
			} else {
				System.out.println("��ǻ�� : ���ڱ�\t �� : ����");
				System.out.println("You Lose!!");
			}
			
		}else if(user == 3) {//��
			if (com == 1) {
				System.out.println("��ǻ�� : ����\t �� : ���ڱ�");
				System.out.println("You Lose!!");
			} else if (com == 2) {
				System.out.println("��ǻ�� : ����\t �� : ���ڱ�");
				System.out.println("You Win!!");
			} else {
				System.out.println("��ǻ�� : ���ڱ�\t �� : ���ڱ�");
				System.out.println("You Draw!!");
			}
		} else {
			System.out.println("�߸��� ���Դϴ�.");
		}
		
		
		while(true) {
			System.out.print("���ҷ�?  Y/N : ");
			String ctn = br.readLine();
			
			if(ctn.equals("n") || ctn.equals("N")) {
				System.exit(0);
			}
			else if(ctn.equals("y") || ctn.equals("Y")) break;
			}//continue while
		
						
		
		}
	}
}


