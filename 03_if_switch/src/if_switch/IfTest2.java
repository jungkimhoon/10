package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 3���� ����(a,b,c)�� �Է� �޾Ƽ� ������� ���
 * 
 * [������]
 * a�� �Է� : 
 * b
 * c
 * 25 36 78
 */

public class IfTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a�� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.print("b�� �Է� : ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.print("c�� �Է� : ");
		int c = Integer.parseInt(br.readLine());

		
	if(b >= a && b >= c){
		if(a >= c) System.out.println(c+"\t"+a+"\t"+b);
		else System.out.println(a+"\t"+c+"\t"+b);
		}
	else if(a >= c) {
		if(b >= c) System.out.println(c+"\t"+b+"\t"+a);
		else System.out.println(b+"\t"+c+"\t"+a);
		}
	else{
		if(a >= b) System.out.println(b+"\t"+a+"\t"+c);
		else System.out.println(a+"\t"+b+"\t"+c);
	}
	
	System.out.println("\nŷ���� ����");
		
		

	}

}
