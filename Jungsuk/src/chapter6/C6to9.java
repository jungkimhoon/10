package chapter6;

class Data {int x;}

public class C6to9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = "+d.x );
		
		change(d.x);
		System.out.println("After change(d)");
		System.out.println("main() : x = "+d.x );
		
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = "+x);
	}

}
