package abstract_1;

import java.util.Scanner;

public class Assert {
	
	private int x, y;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("x값 입력 : ");
		this.x = sc.nextInt();
	
		System.out.print("y값 입력 : ");
		this.y = sc.nextInt();
	}
	
	public void output() {
		assert y >= 0 : "y는 0보다 크거나 같아야 한다.";
		
		System.out.print(x+"의 "+y+"승은 ");
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
