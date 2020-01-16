package for_while_dowhile;
/*
 * [문제1] 가위바위보 게임 - if문

[실행결과]
가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 바위	나 : 보자기
You Win!!
또 할래(Y/N) : y

가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 가위	나 : 보자기
You Lose!!
또 할래(Y/N) : y

가위(1),바위(2),보(3) 중 번호 입력 : 2 (user)
컴퓨터 : 가위	나 : 가위
You Draw!!
또 할래(Y/N) : n
프로그램을 종료합니다
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(;;) {
		int com = (int)(Math.random()*3)+1;
		System.out.print("가위(1) 바위(2) 보(3) 중 번호 입력 : ");
		int user = Integer.parseInt(br.readLine());
		
		if(user == 1) {//가위
			if(com==1){//가위
				System.out.println("컴퓨터 : 가위\t 나 : 가위");
				System.out.println("You Draw!!");
			}else if (com == 2) { //바위
				System.out.println("컴퓨터 : 바위\t 나 : 가위");
				System.out.println("You Lose!!");
			} else if (com == 3) {//보
				System.out.println("컴퓨터 : 보자기\t 나 : 가위");
				System.out.println("You Win!!");
			}
			
		} else if(user == 2) {//바위
			if (com == 1) {
				System.out.println("컴퓨터 : 가위\t 나 : 바위");
				System.out.println("You Win!!");
			} else if (com == 2) {
				System.out.println("컴퓨터 : 바위\t 나 : 바위");
				System.out.println("You Draw!!");
			} else {
				System.out.println("컴퓨터 : 보자기\t 나 : 바위");
				System.out.println("You Lose!!");
			}
			
		}else if(user == 3) {//보
			if (com == 1) {
				System.out.println("컴퓨터 : 가위\t 나 : 보자기");
				System.out.println("You Lose!!");
			} else if (com == 2) {
				System.out.println("컴퓨터 : 바위\t 나 : 보자기");
				System.out.println("You Win!!");
			} else {
				System.out.println("컴퓨터 : 보자기\t 나 : 보자기");
				System.out.println("You Draw!!");
			}
		} else {
			System.out.println("잘못된 값입니다.");
		}
		
		
		while(true) {
			System.out.print("또할래?  Y/N : ");
			String ctn = br.readLine();
			
			if(ctn.equals("n") || ctn.equals("N")) {
				System.exit(0);
			}
			else if(ctn.equals("y") || ctn.equals("Y")) break;
			}//continue while
		
						
		
		}
	}
}


