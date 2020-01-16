package practice;

public class SalaryManager extends EmployeeDTO{
	private double taxRate, tax, salary;
	
	public SalaryManager(String name, String position, int basePay, int benefit ) {
		super(name,position,basePay,benefit);
				
	}
	

	public void calc(){
		if(super.basePay <= 2000000) taxRate = 0.01;
		else if (super.basePay <= 4000000) taxRate = 0.02;
		else taxRate = 0.03;
		tax = (super.basePay + super.benefit) * taxRate;
		salary = super.basePay + super.benefit - tax;
	}
	
	public double getTax() {
		return tax;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double getTaxRate() {
		return taxRate;
	}
}
