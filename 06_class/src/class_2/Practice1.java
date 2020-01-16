package class_2;

//치환하는 프로그램을 작성하시오
//String 클래스의 메소드(indexOf(), replace())를 이용하시오
//대소문자 상관없이 개수를 계산하시오

//문자열 입력 : aabba
//현재 문자열 입력 : aa
//바꿀 문자열 입력 : dd
//ddbba
//1번 치환
//
//문자열 입력 : aAbbA
//현재 문자열 입력 : aa
//바꿀 문자열 입력 : dd
//ddbba
//1번 치환
//
//문자열 입력 : aabbaa
//현재 문자열 입력 : aa
//바꿀 문자열 입력 : dd
//ddbbdd
//2번 치환
//
//문자열 입력 : AAccaabbaaaaatt
//현재 문자열 입력 : aa
//바꿀 문자열 입력 : dd
//ddccddbbddddatt
//4개 치환
//
//문자열 입력 : aabb
//현재 문자열 입력 : aaaaa
//바꿀 문자열 입력 : ddddd
//입력한 문자열의 크기가 작습니다


import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice1 {

	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			int sum = 0;
			
			// TODO Auto-generated method stub
			System.out.print("문자열 입력 : ");
			String input = sc.next();
			if(input.equals("-1")) {
				System.out.println("종료");
				break;
			}
			input = input.toLowerCase();
			
			System.out.print("현재 문자열 입력 : ");
			String pre = sc.next();
			pre = pre.toLowerCase();
				
			System.out.print("바꿀 문자열 입력 : ");
			String change = sc.next();
			String replace = input.replace(pre, change);
			
	
			if(input.length() < pre.length()) {
				System.out.println("입력한 문자열의 크기가 작습니다.");
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
			System.out.println(sum+"개 치환");
		}// while
	}
}


