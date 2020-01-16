package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 3개의 숫자(a,b,c)를 입력 받아서 순서대로 출력
 * 
 * [실행결과]
 * a값 입력 : 
 * b
 * c
 * 25 36 78
 */

public class IfTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a값 입력 : ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.print("b값 입력 : ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.print("c값 입력 : ");
		int c = Integer.parseInt(br.readLine());

		
	if(b >= a && b >= c){
		if(a >= c) System.out.println(c+"\t"+a+"\t"+b);
		else System.out.println(a+"\t"+c+"\t"+b);
		}
	else if(a >= c) {
		if(b >= c) System.out.println(c+"\t"+b+"\t"+a);
		else System.out.println(b+"\t"+c+"\t"+a);
		}
	else{
		if(a >= b) System.out.println(b+"\t"+a+"\t"+c);
		else System.out.println(a+"\t"+b+"\t"+c);
	}
	
	System.out.println("\n킹스템 종료");
		
		

	}

}
