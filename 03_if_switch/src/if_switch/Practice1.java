package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ���� ���� ��
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
		System.out.print("����(1) ����(2) ��(3) �� ��ȣ �Է� : ");
		int user = Integer.parseInt(br.readLine());
		
		if(com == 1) System.out.print("com : ����\t");
		if(com == 2) System.out.print("com : ����\t");
		if(com == 3) System.out.print("com : ��\t");
		
		if(user == 1) System.out.println("user : ����");
		if(user == 2) System.out.println("user : ����");
		if(user == 3) System.out.println("user : ��");
		
		if(user > com) System.out.println("You Win!!");
		else if(user == com) System.out.println("You Draw!!");
		else System.out.println("You Lose!!");
		
		System.out.print("���ҷ� ? y/n");
		String yesNo = br.readLine();
		if(yesNo == "n") {
			System.out.println("���α׷� ����"); 
			break;
			}
		
		}	
		
	}

}
