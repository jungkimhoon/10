package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		if(args.length!=0) System.out.println("args[0] = "+args[0]);
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		try {
		int num2 = sc.nextInt();
		
		int num = Integer.parseInt(args[0]);
		
			System.out.println(num + " / " + num2 + " = " +num/num2);
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ �ȵ�");
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��ض�");
		}finally {
			System.out.println("error�� �ֳ� ���� ������");
		}
	}
}
		
