package class_2;

//ġȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�
//String Ŭ������ �޼ҵ�(indexOf(), replace())�� �̿��Ͻÿ�
//��ҹ��� ������� ������ ����Ͻÿ�

//���ڿ� �Է� : aabba
//���� ���ڿ� �Է� : aa
//�ٲ� ���ڿ� �Է� : dd
//ddbba
//1�� ġȯ
//
//���ڿ� �Է� : aAbbA
//���� ���ڿ� �Է� : aa
//�ٲ� ���ڿ� �Է� : dd
//ddbba
//1�� ġȯ
//
//���ڿ� �Է� : aabbaa
//���� ���ڿ� �Է� : aa
//�ٲ� ���ڿ� �Է� : dd
//ddbbdd
//2�� ġȯ
//
//���ڿ� �Է� : AAccaabbaaaaatt
//���� ���ڿ� �Է� : aa
//�ٲ� ���ڿ� �Է� : dd
//ddccddbbddddatt
//4�� ġȯ
//
//���ڿ� �Է� : aabb
//���� ���ڿ� �Է� : aaaaa
//�ٲ� ���ڿ� �Է� : ddddd
//�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�


import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice1 {

	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			int sum = 0;
			
			// TODO Auto-generated method stub
			System.out.print("���ڿ� �Է� : ");
			String input = sc.next();
			if(input.equals("-1")) {
				System.out.println("����");
				break;
			}
			input = input.toLowerCase();
			
			System.out.print("���� ���ڿ� �Է� : ");
			String pre = sc.next();
			pre = pre.toLowerCase();
				
			System.out.print("�ٲ� ���ڿ� �Է� : ");
			String change = sc.next();
			String replace = input.replace(pre, change);
			
	
			if(input.length() < pre.length()) {
				System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�.");
				break;
			}
		
			else {
				while(true) {
					System.out.println(replace);
					if(input.indexOf(pre) == -1) break;
					input = input.substring(input.indexOf(pre)+pre.length());
					sum++;
				}
			
			}
			System.out.println(sum+"�� ġȯ");
		}// while
	}
}


