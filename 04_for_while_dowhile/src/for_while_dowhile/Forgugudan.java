package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Forgugudan {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan, i;
		System.out.print("���� �Է� : ");
		dan = Integer.parseInt(br.readLine());
		
		for(i=1;i<=9;i++) {
			System.out.println(dan+" * "+i+ " = " +(dan*i));
		}

	}

}