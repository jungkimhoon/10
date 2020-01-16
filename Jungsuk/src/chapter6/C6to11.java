package chapter6;

public class C6to11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {10};
		System.out.println("main() : x = " + x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]);

	}
	
	static void change(int[] x) {
		x[0] = 100;
		System.out.println("chang() : x = " +x[0]);
	}

}
