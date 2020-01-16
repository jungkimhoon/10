package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 가위 바위 보
 * 
 * 
 * 
 * 
 */

public class Practice1 {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(;;) {
		int com = (int)(Math.random()*3)+1;
		System.out.print("가위(1) 바위(2) 보(3) 중 번호 입력 : ");
		int user = Integer.parseInt(br.readLine());
		
		if(com == 1) System.out.print("com : 가위\t");
		if(com == 2) System.out.print("com : 바위\t");
		if(com == 3) System.out.print("com : 보\t");
		
		if(user == 1) System.out.println("user : 가위");
		if(user == 2) System.out.println("user : 바위");
		if(user == 3) System.out.println("user : 보");
		
		if(user > com) System.out.println("You Win!!");
		else if(user == com) System.out.println("You Draw!!");
		else System.out.println("You Lose!!");
		
		System.out.print("더할래 ? y/n");
		String yesNo = br.readLine();
		if(yesNo == "n") {
			System.out.println("프로그램 종료"); 
			break;
			}
		
		}	
		
	}

}
