package Doit2;

public class PRAC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int basePay = 2730500;
		int tax = (int)(basePay * 0.033); 
		int salary = basePay - tax;
		
		System.out.println("**** L�� ���� ****");
		System.out.println("�⺻�� : "+basePay+"��");
		System.out.println("���� : "+tax+"��");
		System.out.println("���� : "+salary+"��");
	}

}
