package Doit2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class What {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("a값 입력 : ");
			int a = Integer.parseInt(br.readLine());
			System.out.print("b값 입력 : ");
			int b = Integer.parseInt(br.readLine());
			System.out.print("연산자 입력(+,-,*,/) : ");
			String op = br.readLine();
			
			switch(op)
			{
				case "+": System.out.println(a +" "+ op +" "+ b +" = "+(a+b)); break;
				case "-": System.out.println(a +" "+ op +" "+ b +" = "+(a+(-b))); break;
				case "/": System.out.println(a +" "+ op +" "+ b +" = "+((double)a/b)); break;
				case "*": System.out.println(a +" "+ op +" "+ b +" = "+(a*b)); break;	
				default : System.out.println("연산자 error");
			}
		}

	}


