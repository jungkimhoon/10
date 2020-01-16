package constructor;
import java.util.Scanner;

public class SalaryDTO {
	
	private String name, position;
	private int basePay, benefit ;
	private double taxRate, tax, salary ;
	
	
	public SalaryDTO(String name, String position, int basePay, int benefit ) {
		this.name = name;
		this.position = position;
		this.basePay = basePay;
		this.benefit = benefit;									
	}
	
	public void calc(){
		if(basePay <= 2000000) taxRate = 0.01;
		else if (basePay <= 4000000) taxRate = 0.02;
		else taxRate = 0.03;
		tax = (basePay + benefit) * taxRate;
		salary = basePay + benefit - tax;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public int getBasePay() {
		return basePay;
	}
	
	public int getBenefit() {
		return benefit;
	}
	
	public double getTaxRate() {
		return taxRate;
	}
	
	public double getTax() {
		return tax;
	}
	
	public double getSalary() {
		return salary;
	}
		
}
