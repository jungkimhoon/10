package inheritance;

class Test{
	int a,b; //접근제어자 : default ==> 해당 파일에서 사용가능
	
}

//============================================
public class TestMain {
	
	public static void main(String[] args) {
		Test aa = new Test();
		Test bb = aa;
		
		System.out.println(aa);
		System.out.println(bb);
		
		aa.a = 2;
		aa.b = 5;
		System.out.println(aa.a+"\t"+aa.b);
		System.out.println(bb.a+"\t"+bb.b);
		System.out.println();
				
		bb.a = 7;
		bb.b = 9;
		System.out.println(aa.a+"\t"+aa.b);
		System.out.println(bb.a+"\t"+bb.b);
		System.out.println();
		
		bb = new Test();
		bb.a = 10;
		bb.b = 11;
		System.out.println(aa.a+"\t"+aa.b);
		System.out.println(bb.a+"\t"+bb.b);
		System.out.println();
	
	}	
}
