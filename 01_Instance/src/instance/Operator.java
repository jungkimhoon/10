package instance;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		a+=2; //a = a+2 => 7
		a*=3; //a = a*3 => 21
		
		a++;
		System.out.println("a = "+a);
		
		int b = a++;
		System.out.println("a = "+a+"\t b = "+b);
		
		int c = ++a - b--;
		System.out.println("a = "+a+"\t b = "+b+"\t  c = "+c);
		
		System.out.println("a++ = "+ a++);
		System.out.println("a = " +a);
		
	}

}

