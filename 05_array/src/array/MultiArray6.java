package array;

//[문제]
//인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
//평균은 소수이하 2째자리까지 출력
//
//[실행결과]
//인원수 : 2 (cnt)
//
//이름입력 : 홍길동 (name)
//과목수 입력 : 2   (subjectCnt)
//과목명 입력 : 국어 (subject)
//과목명 입력 : 영어
//국어 점수 입력 : 95 (jumsu)
//영어 점수 입력 : 100
//---------------------
//이름입력 : 이기자
//과목수 입력 : 3
//과목명 입력 : 국어
//과목명 입력 : 영어
//과목명 입력 : 과학
//국어 점수 입력 : 95
//영어 점수 입력 : 100
//과학 점수 입력 : 90
//---------------------
//
//이름     국어	  영어   	총점     평균
//홍길동    95	  100   xxx	xx.xx
//
//이름	국어  	영어   	과학    	총점     	평균
//이기자   	95   	100	   90	 xxx      xx.xx
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiArray6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("인원수 : ");
		int num = Integer.parseInt(br.readLine());
		int[] student = new int[num];
		System.out.println();
		String[] name = new String[student.length];
		int[] subjectCnt = new int[student.length];
		int[] total = new int[student.length];
		int[] avg = new int[student.length];
		String[][] subject = new String[student.length][];
		int[][] jumsu =  new int[subjectCnt.length][];
		
		for(int i=0; i<student.length; i++) {			
			
			System.out.print("이름 입력 : ");
			name[i] = br.readLine();
			
			System.out.print("과목 수 입력 : ");
			subjectCnt[i] = Integer.parseInt(br.readLine());
			subject[i] = new String[subjectCnt[i]];
			jumsu[i] = new int[subjectCnt[i]];
			
			for(int j=0; j<subjectCnt[i]; j++) {
				System.out.print("과목명 입력 : ");
				subject[i][j] = br.readLine();
							
			}
			for(int j=0; j<subjectCnt[i]; j++) {
				System.out.print(subject[i][j]+"점수 입력 : ");
				jumsu[i][j] = Integer.parseInt(br.readLine());
				total[i] += jumsu[i][j];
				avg[i] = total[i] / subjectCnt[i];
				
			}
			System.out.println("---------------------------");
								
		} //for
		System.out.println();
		for(int i=0; i<num; i++){
		
		
		System.out.print("이름");
		
			for(int j=0; j<subject[i].length; j++) {
				
				System.out.print("\t"+subject[i][j]);
						
			}
			System.out.print("\t총점\t평균");
			System.out.println();
			System.out.print(name[i]+"\t");
			for(int j=0; j<subjectCnt[i]; j++) {
				
				System.out.print(jumsu[i][j]+"\t");
						
			}	
			System.out.println(total[i]+"\t"+avg[i]);			
			System.out.println("");
		}
		
				

	}

}