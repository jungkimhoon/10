package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGame {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		do {
		System.out.println("[���� ����]");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com = (int)(Math.random()*100)+1; //1~100
		System.out.println(com);
		int count = 0;
		
		
		while(true) {
			count++;
			System.out.print("���� �Է� : ");
			int user = Integer.parseInt(br.readLine());
			if(com > user) System.out.println(user+"���� ũ��.\n");
			else if(user > com) System.out.println(user+"���� �۴�.\n");
			else {System.out.print("������ "+count+"�� ���� �����.\t"); break;}
		}//game while
		
		
		while(true) {
		System.out.print("���ҷ�?  Y/N : ");
		String ctn = br.readLine();
		
		if(ctn.equals("n") || ctn.equals("N")) {
			System.exit(0);
		}
		else if(ctn.equals("y") || ctn.equals("Y")) break;
		}//continue while
		
		}while(true);//do while
								
	}
}