package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
[����2] ������ ���Ͻÿ� (x�� y�� ��)
[������]
x�� �Է�  : 2
y�� �Է�  : 5
2�� 5�� xx (2*2*2*2*2)
�Ǵ� 
x�� �Է�  : 3
y�� �Է�  : 4
3�� 4�� xx (3*3*3*3)
 */
public class Practice2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int power = 1;
		
		System.out.print("x�� �Է� : ");
		int x = Integer.parseInt(br.readLine());
		
		System.out.print("y�� �Է� : ");
		int y = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=y;i++) {
			power = power*x;
		}
		System.out.print(x+"�� "+y+"�� "+power);
		if(y==0) System.out.print("(1");
		else System.out.print("("+x);
		for(int i=1;i<=y-1;i++) {
			System.out.print("*"+x);
		}
		System.out.print(")");
		
		

	}

}
