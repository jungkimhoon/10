package class_2;

import java.util.Scanner;

public class Practice1_correction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		int count = 0;
		// TODO Auto-generated method stub
		System.out.print("���ڿ� �Է� : ");
		String input = sc.next();
	
		input = input.toLowerCase();
		
		System.out.print("���� ���ڿ� �Է� : ");
		String pre = sc.next();
		pre = pre.toLowerCase();
			
		System.out.print("�ٲ� ���ڿ� �Է� : ");
		String change = sc.next();
		String replace = input.replace(pre, change);
		

		if(input.length() < pre.length()) {
			System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�.");
			return;
		}
		
		while((index = input.indexOf(pre, index)) != -1) {
			index += pre.length();
			count++;
		}
		System.out.println(replace);
		System.out.println(count+"�� ġȯ");
		
		

	}

}
