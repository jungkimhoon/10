package Doit2;

public class PRAC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int basePay = 2730500;
		int tax = (int)(basePay * 0.033); 
		int salary = basePay - tax;
		
		System.out.println("**** L의 월급 ****");
		System.out.println("기본급 : "+basePay+"원");
		System.out.println("세금 : "+tax+"원");
		System.out.println("월급 : "+salary+"원");
	}

}
