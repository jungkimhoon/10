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
		
		AA aa = new BB(); //�θ�� �ڽ� ���� ����
		aa.disp(); //�ڽ��� �켱
		System.out.println(aa.a+" "); // �ʵ�� �ڽ� ����
		
		BB bb2 = (BB)aa;
		System.out.println(bb2.a+" "); // �ڽ����� ĳ���� �ڽ� �� ���
		
	}
}
