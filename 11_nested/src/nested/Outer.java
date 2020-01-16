package nested;

public class Outer {
	public String name; //inner ���ٺҰ�		// ��ü �����ϸ� ���ٰ���
	
	public void disp() {
		System.out.println("�̸� = "+this.name+"\t ���� = "+new Inner().age);
	}
	
	class Inner {
		private int age; //outer ���ٰ���
		
		public void disp() {
			System.out.println("�̸� = "+Outer.this.name+"\t ���� = "+this.age);
		}
	}
	
	
	public static void main(String[] args) {
		Outer outer = new Outer(); //�ȿ� �ִ� inner class ���� �ȸ����.
		outer.name = "ȫ�浿";
		System.out.println("�̸� : "+outer.name);
		System.out.println();
		
		Outer.Inner inner = outer.new Inner(); //outer ���� inner�� ������ �� �� �ֵ�.
		inner.age = 25;
		inner.disp();
		
		Outer.Inner inner2 = outer.new Inner(); //outer ���� inner�� ������ �� �� �ֵ�.
		inner2.age = 27;
		inner2.disp();
	
		Outer.Inner inner3 = new Outer().new Inner();
		inner3.age = 35;
		inner3.disp();
	}
}
