package Practice;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class EngMoney extends Money{
	
	public EngMoney(double money) {
		this.money = money;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void calcMoney() {
		exchange = 0.00086*money;
	}

	@Override
	public void dispMoney() {
		System.out.println(exchange);
		NumberFormat korM = NumberFormat.getCurrencyInstance(Locale.KOREA);
		NumberFormat engM = NumberFormat.getCurrencyInstance(Locale.US);
		engM.setMaximumFractionDigits(2);
		engM.setMinimumFractionDigits(0);
		System.out.println(korM.format(money)+" ¡æ "+engM.format(exchange));		
	}

}
