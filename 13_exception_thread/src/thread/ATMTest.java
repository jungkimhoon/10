package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTest implements Runnable{
	private long depositMoney = 100000;
	private long balance;

	@Override
	//public synchronized void run() {//- 동기화 0
	public void run() {
		synchronized(this) {//- 동기화 0 ATMTest 클래스 갖은놈은 동기화됨
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(Thread.currentThread().getName()+"님 안녕하세요");
			
			try {
				System.out.print("찾고자 하는 금액 입력 : ");
				balance = Long.parseLong(br.readLine());
				
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		withDraw();
		}
	}
	
	public void withDraw() {
		if(depositMoney < balance) System.out.println("잔액초과");
		else if(balance%10000 != 0) System.out.println("만원 단위 입력하라.");
		else {
			depositMoney = depositMoney - balance;
			System.out.println("잔액은 "+depositMoney+"원입니다.");
		}
	}
	
	public static void main(String[] args) {
		ATMTest atm = new ATMTest();	//같은 자원을 같이 쓰기위해 같은 클래스
		Thread mom = new Thread(atm,"엄마");
		Thread son = new Thread(atm,"아들");
		
//		mom.setName("엄마"); //thread 이름 지정
//		son.setName("아들");
		mom.start();
		son.start();
	}

}
