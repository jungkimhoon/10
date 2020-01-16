package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*초를 입력받아서 time()에서 시,분,초를 구하여 출력한다

[실행결과]
초를 입력하시오 : 3850
1시간 4분 10초 입니다*/

public class Practice3 {
	
	public void time(int a) {
		int hour = a / 3600 ;
		int min = (a % 3600) / 60 ;
		int sec = a % 3600 % 60 ;
		System.out.println(hour+"시간 " +min+ "분 "+sec+"초 입니다.");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("초를 입력하시오 : " );
		int sec = Integer.parseInt(br.readLine());
		
		Practice3 aa = new Practice3();
		aa.time(sec);
		System.out.println("프로그램 종료");

	}

}
