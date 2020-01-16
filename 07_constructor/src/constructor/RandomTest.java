package constructor;
import java.util.Random;

public class RandomTest {
	
	
	public RandomTest() {
		
		System.out.println("난수 = "+Math.random());
		System.out.println("난수 = "+new Random().nextDouble());
		System.out.println("난수 = "+new Random().nextInt()); 
		System.out.println("난수 = "+new Random().nextInt(100)); //0 ~ 99 까지
		System.out.println("난수 = "+(new Random().nextInt(100)+1));
		
	}
	
	
	
	
	public static void main(String[] args) {
		new RandomTest();	 //한번 쓰고 버림
				
	}
}
