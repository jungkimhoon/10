package instance;

/* 문제
 * 320, 258을 변수에 저장하여 합을 구하라 
 * 
 * [실행결과]
 * 320 + 258 = result (sum)
 * 320 - 258 = result (sub)
 * 320 * 258 = result (mul)
 * 320 / 258 = result (div)
 */

public class NumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short A = 320;
		short B = 258;
		
	    // +처럼 어떤 형이든 계산하면 int형으로 형변환, 형변환은 무조건 오른쪽에서 시킨다.
		int sum, sub, mul;
		double div;
		
		sum = A + B;
		sub = A - B;
		mul = A * B;
		div = (double)A/B;
		
		System.out.println(A+" + "+B+" = "+sum);
		System.out.println(A+" - "+B+" = "+sub);
		System.out.println(A+" * "+B+" = "+mul);
		System.out.println(A+" / "+B+" = "+String.format("%.2f", div));	
		
	}

}
