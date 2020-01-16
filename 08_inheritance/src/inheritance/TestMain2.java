package inheritance;

class AA{
	public int a = 3;
	public void disp() {
		a += 5;
		System.out.print("AA : "+ a + " ");
	}
}
//===========================================
class BB extends AA{
	public int a = 8;
	public void disp() {
		this.a += 5;
		System.out.print("BB : "+ a + " ");
	}
}

public class TestMain2 {
	public static void main(String[] args) {
		BB bb = new BB();
		bb.disp();
		System.out.println(bb.a + " ");
		
		AA aa = new BB(); //부모는 자식 참조 가능
		aa.disp(); //자식이 우선
		System.out.println(aa.a+" "); // 필드는 자신 참조
		
		BB bb2 = (BB)aa;
		System.out.println(bb2.a+" "); // 자식으로 캐스팅 자식 값 출력
		
	}
}
