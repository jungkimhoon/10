package for_while_dowhile;
//
//숫자를 입력하여 배수를 7개만 구하시오
//단 음수이면 다시 입력하고 0 이면 종료
//
//실행결과
//숫자 입력 : -7
//숫자 입력 : 8
//8 16 24 32 40 48 56
//
//숫자입력 : 0
//프로그램 종료

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("[실행 결과]");
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = Integer.parseInt(br.readLine());
			if(num < 0) continue;
			if(num == 0) {
				System.out.println("프로그램 종료");
				break;
				}
			for(int i=1;i<=7;i++) System.out.print(num*i+"  ");
	
			System.out.println();
			
		}//while

	}

}
