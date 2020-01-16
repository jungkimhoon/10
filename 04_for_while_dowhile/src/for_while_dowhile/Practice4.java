package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//
//[문제4] 덧셈 공부
//10~99 사이의 난수를 2개(a,b) 발생하여 합을 맞추는 게임
//문제수는 총 5문제를 제공한다
//1문제당 점수 20점씩 계산
//만약 틀리면 기회를 1번 더 제공한다
//
//[실행결과]
//[1] 25 + 36 = 45
//틀렸다
//[1] 25 + 36 = 61
//딩동뎅
//
//[2] 78 + 10 = 100
//틀렸다
//[2] 78 + 10 = 95
//틀렸다...정답 :
//...
//
//당신의 총 x문제를 맞추어서 xx점 입니다
//
//continue(y/n) : w
//continue(y/n) : n
//프로그램을 종료합니다
public class Practice4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		while(true) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int point = 0;
		int correct = 0;
		
		for(int i=1; i<=5; i++) {
			int a = (int)(Math.random()*90) + 10;
			int b = (int)(Math.random()*90) + 10;
			int randSum = a + b;
			System.out.println(randSum);
			
			
			for(int j=1; j<=2; j++) {
				System.out.print("["+i+"] "+a+" + "+b+" = ");
				int num = Integer.parseInt(br.readLine());
				
				if(randSum == num) {
					System.out.println("딩동뎅"); 
					point += 20;
					correct++;
					break;
					}					
				else {
					if(j==2) System.out.println("틀렸다.. 정답은"+(a+b));
					else System.out.println("틀렸다");
					}//if else
			}
				
			}//for end
		 System.out.println("당신은 총 "+correct+"문제를 맞춰서 "+point+"점이다.");
			
			while(true) {
				System.out.print("또할래?  Y/N : ");
				String ctn = br.readLine();
				
				if(ctn.equals("n") || ctn.equals("N")) {
					System.exit(0);
				}
				else if(ctn.equals("y") || ctn.equals("Y")) break;
				}//continue while
		}//main
	}
				

	}


