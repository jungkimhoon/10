package class_2;

import java.util.Scanner;

public class Practice1_correction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		int count = 0;
		// TODO Auto-generated method stub
		System.out.print("문자열 입력 : ");
		String input = sc.next();
	
		input = input.toLowerCase();
		
		System.out.print("현재 문자열 입력 : ");
		String pre = sc.next();
		pre = pre.toLowerCase();
			
		System.out.print("바꿀 문자열 입력 : ");
		String change = sc.next();
		String replace = input.replace(pre, change);
		

		if(input.length() < pre.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다.");
			return;
		}
		
		while((index = input.indexOf(pre, index)) != -1) {
			index += pre.length();
			count++;
		}
		System.out.println(replace);
		System.out.println(count+"개 치환");
		
		

	}

}
