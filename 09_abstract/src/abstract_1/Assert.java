package abstract_1;

import java.util.Scanner;

public class Assert {
	
	private int x, y;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("x�� �Է� : ");
		this.x = sc.nextInt();
	
		System.out.print("y�� �Է� : ");
		this.y = sc.nextInt();
	}
	
	public void output() {
		assert y >= 0 : "y�� 0���� ũ�ų� ���ƾ� �Ѵ�.";
		
		System.out.print(x+"�� "+y+"���� ");
		int pow = 1;
		for(int i=1;i<=y;i++) {
			pow *= x;
		}
		System.out.println(pow);
	}
	
	
	public static void main(String[] args) {
		Assert aa = new Assert();
		aa.input();
		aa.output();
	}
}
