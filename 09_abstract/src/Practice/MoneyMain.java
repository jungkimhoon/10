package Practice;

import java.util.Scanner;

public class MoneyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		Money m = null;
		double money = sc.nextDouble();
		
		System.out.print("1. �޷�   2. ��ȭ   3. ���� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: m = new EngMoney(money); break;
		case 2: m = new JpaMoney(money); break;
		case 3: m = new ChaMoney(money); break;
		}
		m.calcMoney();
		m.dispMoney();
	}

}
