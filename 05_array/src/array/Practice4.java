package array;

//야구게임
//크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
//발생한 수를 맞추는 게임
//중복은 제거한다
//
//[실행결과]
//게임을 실행하시겠습니까(Y/N) : w
//게임을 실행하시겠습니까(Y/N) : u
//게임을 실행하시겠습니까(Y/N) : y
//
//게임을 시작합니다
//
//숫자입력 : 123
//0스트라이크 0볼
//
//숫자입력 : 567
//0스트라이크 2볼
//
//숫자입력 : 758
//1스트라이크 2볼
//...
//
//숫자입력 : 785
//3스트라이크 0볼


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("게임을 실행하시겠습니까?(Y/N) : ");
			String YN = br.readLine();			
			boolean flag = false;
			if(YN.charAt(0) == 'N' || YN.charAt(0) == 'n') {
				System.out.println("종료");
				break;
			}			
			else if(YN.charAt(0) == 'Y' || YN.charAt(0) == 'y') 
			{	
				int[] num = new int[3];
				int[] com = new int[3];
			
				
				for(int i=0; i<com.length; i++) {
					com[i] = (int)(Math.random()*9)+1;					
					
					for(int j=0; j<i; j++) {
						if(com[i] == com[j]) {
							i--;
							
						}
					}
					System.out.print(com[i]);
					
				}
				
				System.out.println("게임을 시작합니다.");	
				
				while(true) {
					int strike = 0;
					int ball = 0;
					System.out.println("숫자입력");
					System.out.print(">>");
					String comnum = br.readLine();
					
					
					for(int i=0; i<com.length; i++) {
						num[i] = comnum.charAt(i) - 48;
						System.out.println(num[i]);
					}
					
					for(int i=0; i<com.length; i++) {
						if(com[i] == num[i]) strike++;
					}
					for(int i=0; i<com.length; i++) {
						for(int j=0; j<com.length; j++ ) {
							if(i==j) continue;
							if(com[i] == num[j]) ball++;
						}
					}
					
					System.out.println(strike+"스트라이크"+ball+ "볼");
					
					if(strike == 3) {
						flag = !flag;
						break;	
					}
				}//game while
				if(flag == true) break;
			
			}
			else continue;
		
									
		}
		
		
		
	}

}
