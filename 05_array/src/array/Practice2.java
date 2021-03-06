package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practice2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] binary = new int[32];
		int dec;
		
		while(true) {
			System.out.print("10진수 입력 : ");
			dec = Integer.parseInt(br.readLine());
			if(dec==0) break;
			if(dec<0) continue;
			
			int i;
			for(i=0; dec!=0; i++) {
				binary[i] = dec%2;
				dec = dec/2;
			}//for
			
			for(int j=i-1; j>=0; j--) {
				System.out.print(binary[j]);
				if(j%4==0) System.out.print(" ");
			}
			System.out.println();
		}//while
		System.out.println("프로그램을 종료합니다");
	}

}




