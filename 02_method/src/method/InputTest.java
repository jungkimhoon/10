package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		//1. System.in   2.InputStreamReader  3.BufferedReader
		
		System.out.print("���ڿ��� �Է��϶� : ");
		String str = br.readLine();		//readLine => ���ڿ��� �Է� �޴´�.
		
		System.out.print("���� �Է��϶� : ");
		int iNum = Integer.parseInt(br.readLine());
				
		System.out.print("�Ǽ� �Է��϶� : ");
		double dNum = Double.parseDouble(br.readLine());
		
		System.out.println(str+"\t"+iNum+"\t"+dNum);
		System.out.println(iNum+dNum);
	}

}
