package class_2;
import java.util.Scanner;

public class StringBufferTest {
	private int dan;
	
	public StringBufferTest(){
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력 : ");
		this.dan = sc.nextInt();
	}
	
	public void output() {
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<=9; i++) {
			//System.out.println(dan + " x " + i +" = "+dan*i);
			
			sb.append(dan);
			sb.append("x");
			sb.append(i);
			sb.append("=");
			sb.append(dan*i);
		
			
			System.out.println(sb.toString());
			
			//sb.delete(0, sb.length()); //start ~ end - 1
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StringBufferTest().output();
	}	
}
