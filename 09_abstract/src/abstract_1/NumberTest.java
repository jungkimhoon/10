package abstract_1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberTest {
	
	public static void main(String[] args) {
		NumberFormat nf = new DecimalFormat();
		//default 3자리마다 .
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println(	);
		
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		//유효 숫자만 표시
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println(	);
		
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		//0 강제 표시
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println(	);
		
		
		//NumberFormat nf4 = NumberFormat.getInstance(); //메소드를 이용한 생성
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();
		nf4.setMaximumFractionDigits(2);
		nf4.setMinimumFractionDigits(2);
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println(	);
		
		
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);
		nf5.setMaximumFractionDigits(2);
		//nf5.setMinimumFractionDigits(2);
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println(	);
		
		NumberFormat nf6 = NumberFormat.getCurrencyInstance(Locale.US);
		nf6.setMaximumFractionDigits(2);
		nf6.setMinimumFractionDigits(2);
		System.out.println(nf6.format(12345678.456789));
		System.out.println(nf6.format(12345678));
		System.out.println(	);
	}

}
