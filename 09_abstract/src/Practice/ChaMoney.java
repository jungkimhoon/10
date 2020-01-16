package Practice;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ChaMoney extends Money{
	public ChaMoney(double money) {
		this.money = money;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void calcMoney() {
		exchange = 0.0060 * money;
	}

	@Override
	public void dispMoney() {
	
		NumberFormat korM = NumberFormat.getCurrencyInstance(Locale.KOREA);
		NumberFormat chaM = NumberFormat.getCurrencyInstance(Locale.CHINA);
		chaM.setMaximumFractionDigits(2);
		chaM.setMinimumFractionDigits(0);
		System.out.println(korM.format(money)+"\t¡æ\t"+chaM.format(exchange));
		
	}

}
