package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest_PrimeNum {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("���� �Է� : ");
		
			int num = Integer.parseInt(br.readLine());
			if(num == 0) break;
			
			int count = 0;
			
			for(int i=1; i<=num; i++) {
				if(num % i == 0)  count++;
				}
			if(count <= 2) System.out.println(num+"�� �Ҽ���.\n");
			else System.out.println(num+"�� �Ҽ� �ƴϴ�.\n");			
	
		}
		System.out.println("���α׷� ����");
	}

}
