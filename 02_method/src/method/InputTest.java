package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		//1. System.in   2.InputStreamReader  3.BufferedReader
		
		System.out.print("문자열을 입력하라 : ");
		String str = br.readLine();		//readLine => 문자열로 입력 받는다.
		
		System.out.print("정수 입력하라 : ");
		int iNum = Integer.parseInt(br.readLine());
				
		System.out.print("실수 입력하라 : ");
		double dNum = Double.parseDouble(br.readLine());
		
		System.out.println(str+"\t"+iNum+"\t"+dNum);
		System.out.println(iNum+dNum);
	}

}
