package instance;

public class CompTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 0;
		boolean result;
		
		result = ( (num1+=10) < 0 && (num2+=10) > 0 ); //ù�� false�̹Ƿ� �ڿ� �� skip
		System.out.println("result : "+result);
		System.out.println("num1 : "+num1+ "\t num2 : " + num2);
		System.out.println();
		
		result = ( (num1+=10) > 0 || (num2+=10) > 0 ); //ù�� true�̹Ƿ� �ڿ� �� skip
		System.out.println("result : "+result);
		System.out.println("num1 : "+num1+ "\t num2 : " + num2);
		System.out.println();

	}

}
