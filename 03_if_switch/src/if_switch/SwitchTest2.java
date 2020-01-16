package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class SwitchTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("a값 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b값 입력 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력(+,-,*,/) : ");
		String op = br.readLine();
		
		switch(op) //op.equals("+");
		{
			case "+": System.out.println(a +" "+ op +" "+ b +" = "+(a+b)); break;
			case "-": System.out.println(a +" "+ op +" "+ b +" = "+(a+(-b))); break;
			case "/": 
				//System.out.println(a +" "+ op +" "+ b +" = "+String.format("%.3f",(double)a/b)); 
				DecimalFormat df = new DecimalFormat("#.###");
				System.out.println(a +" "+ op +" "+ b +" = "+df.format((double)a/b));
				break;
			case "*": System.out.println(a +" "+ op +" "+ b +" = "+(a*b)); break;	
			default : System.out.println("연산자 error");
		}
	}
}

/*a값 입력 : 25
b값 입력 : 36
연산자 입력
25 + 36 = 
$ = error*/