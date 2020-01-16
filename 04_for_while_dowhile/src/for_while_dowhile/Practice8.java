package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice8 {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public int input(int balance) throws IOException
	{
	
		System.out.print("예금액 : ");
		int money = Integer.parseInt(br.readLine());
			if(money % 10000 == 0)	{
				balance += money;
				}
			
			else System.out.println("만원 단위로 입력하세요.\n");
				
		System.out.println("당신의 잔액은 "+balance+"원 입니다.");
		return balance;
	}
	
	public int output(int balance) throws IOException
	{
		System.out.print("출금액 : ");
		int money = Integer.parseInt(br.readLine());
		if(money > balance) System.out.println("잔액이 부족합니다.");
		else balance -= money;
		System.out.println("당신의 잔액은 "+balance+"원 입니다.");
		return balance;
	}
	

	public static void main(String[] args) throws IOException {
		
		int balance = 0; 
		Practice8 pr = new Practice8(); 
		// TODO Auto-generated method stub
		while(true) {
			
			System.out.println();
			System.out.println("******************");
			System.out.println("    1. 예금");
			System.out.println("    2. 출금");
			System.out.println("    3. 잔고");
			System.out.println("    4. 종료");
			System.out.println("******************");
			System.out.print("번호 선택 : ");
			int opt = Integer.parseInt(pr.br.readLine());
			
			if(opt == 1) {
				balance = pr.input(balance);
			}
			else if(opt == 2) {
				balance = pr.output(balance);
				
			}
			else if(opt == 3) System.out.println("당신의 잔액은 "+balance+"원 입니다.");
			else if(opt == 4){
				System.out.println("프로그램을 종료합니다."); 
				break;
				}
			else continue;
			}			
		}
	}



//
//예금, 출금, 잔고, 종료 기능을 제공하는 간단 계좌관리 프로그램을 작성하시오.
//조건) 예금은 input(), 출금은 output()에서 처리하세요
//
//[실행결과]
//****************
//   1. 예금
//   2. 출금
//   3. 잔고
//   4. 종료
//****************
//번호 선택 : 1
//예금액 : 10000
//당신의 잔액은 10000원 입니다
//또는
//예금액 : 12000
//만원 단위로 입력하세요
//
//****************
//   1. 예금
//   2. 출금
//   3. 잔고
//   4. 종료
//****************
//번호 선택 : 2
//출금액 : 8000
//당신의 잔액은 2000원 입니다
//또는 
//출금액 : 18000
//잔액이 부족합니다
//
//****************
//   1. 예금
//   2. 출금
//   3. 잔고
//   4. 종료
//****************
//번호 선택 : 3
//당신의 잔액은 2000원 입니다
//
//****************
//   1. 예금
//   2. 출금
//   3. 잔고
//   4. 종료
//****************
//번호 선택 : 4
//프로그램을 종료합니다.

