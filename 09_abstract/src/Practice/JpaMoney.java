package Practice;

import java.text.NumberFormat;
import java.util.Locale;

public class JpaMoney extends Money{
	
	public JpaMoney(double money) {
		this.money = money;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void calcMoney() {
		exchange = 0.094 * money;
	}

	@Override
	public void dispMoney() {
	
		NumberFormat korM = NumberFormat.getCurrencyInstance(Locale.KOREA);
		NumberFormat jpaM = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		jpaM.setMaximumFractionDigits(2);
		jpaM.setMinimumFractionDigits(0);
		System.out.println(korM.format(money)+" ¡æ "+jpaM.format(exchange));
		
	}

}
