package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest3 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //길을 닦아라.
		System.out.print("이름 입력 : ");
		String name = br.readLine(); //readLine()은 문자열로 입력받는다 새퀴야.
		
		System.out.print("국어 입력 : ");
		int kor = Integer.parseInt(br.readLine());

		System.out.print("영어 입력 : ");
		int eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학 입력 : ");
		int math = Integer.parseInt(br.readLine());

		MethodTest3 a = new MethodTest3();
		int AA = a.calcTot(math, kor, eng);
		
		System.out.println("\n\t*** "+name+" 성적표 ***");
		System.out.println("국어\t 영어\t 수학\t 총점\t 평균\t");
		System.out.println(kor+"\t "+eng+"\t "+math+"\t "+AA+"\t "+ String.format("%.2f",a.calcAvg(AA)));
		// 이름, 국어, 영어, 수학을 입력 받아서 총점, 평균을 구하시오.
		// 총점 calcTot()
		// 평균 calAvg()

	}//main
	
	
	public int calcTot(int a, int b, int c) {
		return a+b+c;
	}//calcTot
	
	public double calcAvg(int a) {
		return a/3.;
	}//calcAvg


}