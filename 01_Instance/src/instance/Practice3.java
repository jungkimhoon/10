package instance;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "L"; //char name = 'L'; ����
		int basePay = 2500000;
		int tax = (int)(basePay * 0.033); 
		int salary = basePay - tax;
		
		System.out.println("*** "+name+"�� ���� ***");
		System.out.println("�⺻�� : "+basePay+"��");
		System.out.println("���� : "+tax+"��");
		System.out.println("���� : "+salary+"��");
	}

}
