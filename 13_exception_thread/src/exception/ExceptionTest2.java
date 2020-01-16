package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest2{	
	private int dan;
	
	public int input() throws IOException { //메소드에 exception 있으면 호출부도 exception처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("원하는 입력 : ");
		dan = Integer.parseInt(br.readLine());
		return dan;
	}
	
	public void output() {
		if(dan >= 2 && dan <= 9) {
			for(int i=1;i<=9;i++) {
				System.out.println(dan + " X " +i+" = "+dan*i);
			}
		}else 
			//System.out.println("범위 초과 2~9까지 가능");
			
			//강제 Exception 발생
			try {
				//throw new Exception("범위 초과 2~9까지 가능");
				throw new MakeException("범위 초과 2~9까지 가능");
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) throws IOException {//메소드에 exception 있으면 호출부도 exception처리
		ExceptionTest2 dan = new ExceptionTest2();
		dan.input();
		dan.output();		
	}
}
	
