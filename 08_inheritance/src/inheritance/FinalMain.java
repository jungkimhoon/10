package inheritance;


class Final {
	public final String FRUIT = "���";
	public final String FRUIT2;
	
	public static final String ANIMAL = "����";
	public static final String ANIMAL2;
	
	static {
		ANIMAL2 = "�⸰";
	}
	
	Final(){
		FRUIT2 = "����";
	}
}


//===========================
public class FinalMain {
	
	public static void main(String[] args) {
		final int AGE = 25;
		//AGE++; error (final��)
		
		final int AGE2;
		AGE2 = 30;
		//AGE2 = 40; error
		
		Final f = new Final();
		
		System.out.println("FRUIT = " + new Final().FRUIT);
		System.out.println("FRUIT2 = " + f.FRUIT2);
		
		System.out.println("ANIMAL = " + Final.ANIMAL);
		System.out.println("ANIMAL2 = " + Final.ANIMAL2);
		
	}
}
