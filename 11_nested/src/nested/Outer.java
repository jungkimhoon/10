package nested;

public class Outer {
	public String name; //inner 접근불가		// 객체 생성하면 접근가능
	
	public void disp() {
		System.out.println("이름 = "+this.name+"\t 나이 = "+new Inner().age);
	}
	
	class Inner {
		private int age; //outer 접근가능
		
		public void disp() {
			System.out.println("이름 = "+Outer.this.name+"\t 나이 = "+this.age);
		}
	}
	
	
	public static void main(String[] args) {
		Outer outer = new Outer(); //안에 있는 inner class 같이 안만든다.
		outer.name = "홍길동";
		System.out.println("이름 : "+outer.name);
		System.out.println();
		
		Outer.Inner inner = outer.new Inner(); //outer 안의 inner는 여러개 올 수 있따.
		inner.age = 25;
		inner.disp();
		
		Outer.Inner inner2 = outer.new Inner(); //outer 안의 inner는 여러개 올 수 있따.
		inner2.age = 27;
		inner2.disp();
	
		Outer.Inner inner3 = new Outer().new Inner();
		inner3.age = 35;
		inner3.disp();
	}
}
