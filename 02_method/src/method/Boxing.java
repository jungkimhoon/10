package method;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 25;
		double b = (double)a/3; //cast연산 (형변환)
		
		/*
		 * String a = "25";
		 * int b = (int)a; ==== 스트링 타입 => 클래스 ; 형변환 안된다.; parseInt 사용
		 */
		
		int c = 5;		//기본형 int
		Integer d = c;	//AutoBoxing 기본형 => 객체형 자동으로 변환
		// Integer d = new Integer(c);	//클래스형  Integer JDK 1.5 이전 선언 방식

		Integer e = 5;
		int f = e; 		//UnAutoBoxing 객체형 => 기본형 자동으로 변환
		//int f = e.intValue(); // JDK 1.5 이전 방식
	}

}
