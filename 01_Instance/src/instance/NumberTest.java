package instance;

/* ����
 * 320, 258�� ������ �����Ͽ� ���� ���϶� 
 * 
 * [������]
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
		
	    // +ó�� � ���̵� ����ϸ� int������ ����ȯ, ����ȯ�� ������ �����ʿ��� ��Ų��.
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
