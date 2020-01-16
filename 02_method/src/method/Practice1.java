package method;
	/*  정수(dec)를 입력받아서 2진수(binary), 8진수(octor), 16진수(hexa) 변환하시오
		 Integer클래스 메소드를 이용하시오
		
		[실행결과]
		10진수를 입력하세요 : 250
		
		2진수 = 11111010
		8진수 = 372
		16진수 = fa */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("10진수를 입력하세요 : ");
		int dec = Integer.parseInt(br.readLine());
		
		String binary = Integer.toBinaryString(dec);
		String octa = Integer.toOctalString(dec);
		String hexa = Integer.toHexString(dec);
		
		System.out.println("2진수 = "+ binary);
		System.out.println("8진수 = "+ octa);
		System.out.println("16진수 = "+ hexa);

	}

}
