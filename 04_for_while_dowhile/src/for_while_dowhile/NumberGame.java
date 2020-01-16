package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGame {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		do {
		System.out.println("[게임 시작]");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com = (int)(Math.random()*100)+1; //1~100
		System.out.println(com);
		int count = 0;
		
		
		while(true) {
			count++;
			System.out.print("숫자 입력 : ");
			int user = Integer.parseInt(br.readLine());
			if(com > user) System.out.println(user+"보다 크다.\n");
			else if(user > com) System.out.println(user+"보다 작다.\n");
			else {System.out.print("딩동뎅 "+count+"번 만에 맞췄다.\t"); break;}
		}//game while
		
		
		while(true) {
		System.out.print("또할래?  Y/N : ");
		String ctn = br.readLine();
		
		if(ctn.equals("n") || ctn.equals("N")) {
			System.exit(0);
		}
		else if(ctn.equals("y") || ctn.equals("Y")) break;
		}//continue while
		
		}while(true);//do while
								
	}
}