package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class SwitchTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("a�� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b�� �Է� : ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�(+,-,*,/) : ");
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
			default : System.out.println("������ error");
		}
	}
}

/*a�� �Է� : 25
b�� �Է� : 36
������ �Է�
25 + 36 = 
$ = error*/