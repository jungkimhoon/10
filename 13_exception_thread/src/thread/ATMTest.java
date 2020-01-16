package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTest implements Runnable{
	private long depositMoney = 100000;
	private long balance;

	@Override
	//public synchronized void run() {//- ����ȭ 0
	public void run() {
		synchronized(this) {//- ����ȭ 0 ATMTest Ŭ���� �������� ����ȭ��
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(Thread.currentThread().getName()+"�� �ȳ��ϼ���");
			
			try {
				System.out.print("ã���� �ϴ� �ݾ� �Է� : ");
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
		if(depositMoney < balance) System.out.println("�ܾ��ʰ�");
		else if(balance%10000 != 0) System.out.println("���� ���� �Է��϶�.");
		else {
			depositMoney = depositMoney - balance;
			System.out.println("�ܾ��� "+depositMoney+"���Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		ATMTest atm = new ATMTest();	//���� �ڿ��� ���� �������� ���� Ŭ����
		Thread mom = new Thread(atm,"����");
		Thread son = new Thread(atm,"�Ƶ�");
		
//		mom.setName("����"); //thread �̸� ����
//		son.setName("�Ƶ�");
		mom.start();
		son.start();
	}

}
