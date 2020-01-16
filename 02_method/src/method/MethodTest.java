package method;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int big = Math.max(25, 36); //자바가 만든 math클래스 함수 max
		System.out.println("큰 값 : "+big);
		
		
		int small = Math.min(25, 36);
		System.out.println("작은 값 : "+small);
		
		double power = Math.pow(2,8);
		System.out.println("2의 8승은 "+(int)power);
		System.out.println();
	
		//rand 함수
		int a = (int)(Math.random()*100); // 0.0 < Math.random() < 1.0 더블형임 		// Math.random()*100 => 0 ~ 99
		int b = (int)(Math.random()*100) + 1; // 1 ~ 100
		int c = (int)(Math.random()*26) + 65; // 65 ~ 90  	//Math.random()*26 => 0 ~ 25
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println((char)c);
		System.out.println();
		
		//ASCII 이용
		System.out.println('2' + '5'); //103
		System.out.println('2'-48 + '5'-48); //char 숫자로 변환
		System.out.println();
		
		//문자열에서 숫자로 바꾸기다
		System.out.println("2"+"5");
		System.out.println(Integer.parseInt("2") + Double.parseDouble("5.7")); 
		
	}
	

}

