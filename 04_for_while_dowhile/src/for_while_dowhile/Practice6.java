package for_while_dowhile;
//
//[문제5] 성적 관리 프로그램
//중간고사, 기말고사, 레포트, 출석점수를 입력받아서 계산하시오
//
//조건1) (중간+기말)/2    ---> 60%
//          과제   	     ---> 20%
//          출석                ---> 20%     
//조건2)  90이상 'A'학점     		
//          80이상 'B'학점        		  	 
//          70이상 'C'학점        		  	 
//          60이상 'D'학점        		  	 
//          나머지 'F'학점
//조건3)
//         A, B학점  ---->"excellent"     
//         C, D학점  ---->"good"
//         F학점    ---->"poor"
//
//[실행결과]
//중간고사를 입력하시오 : 90
//기말고사를 입력하시오 : 89
//과제점수를 입력하시오 : 99
//출석점수를 입력하시오 : 100
//
//성적=93.20         <---소수이하 2째자리까지
//학점=A              
//평가=excellent
//
//[문제6]
//문제5번에서 조건2, 조건3의 if문으로 처리한 것을 switch로 바꾸시오

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice6 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("중간고사를 입력해라 : ");
		int me = Integer.parseInt(br.readLine());
		
		System.out.print("기말고사를 입력해라 : ");
		int fe = Integer.parseInt(br.readLine());
		
		System.out.print("과제점수를 입력해라 : ");
		int hw = Integer.parseInt(br.readLine());
		
		System.out.print("출석점수를 입력해라 : ");
		int atd = Integer.parseInt(br.readLine());
		
		int examScore = 0;
		examScore = (me + fe) / 2;
		
		double total = 0;
		total = (double)(examScore*0.6 + hw*0.2+ atd*0.2);
		
		char grade;
		String cmt;
		
		switch((int)(total / 10)) {
		case 9 : grade = 'A'; cmt = "excellent"; break;
		case 8 : grade = 'B'; cmt = "excellent"; break;
		case 7 : grade = 'C'; cmt = "good"; break;
		case 6 : grade = 'D'; cmt = "good"; break;
		default : grade = 'F'; cmt = "poor"; break;
		
			
		}
//		if(total >= 90)	{
//			grade = 'A';
//			cmt = "excellent";
//		}
//		else if (total >= 80) {
//			grade = 'B';
//			cmt = "excellent";
//		}
//		else if (total >= 70) {
//			grade = 'C';
//			cmt = "excellent";
//		}
//		else if (total >= 60) {
//			grade = 'D';
//			cmt = "excellent";
//		}
//		else {
//			grade = 'F';
//			cmt = "suck";
//		}
		System.out.println("성적 : " +String.format("%.2f", total));
		System.out.println("학점 : " +grade);
		System.out.println("평가 : " +cmt);

	}

}
