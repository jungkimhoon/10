package instance;

public class Variable2 {
	
	int a; // field (��������), �����ϸ� �ʱ�ȭ �ڵ�, �ν��Ͻ� ����
	static int b; //static �����ؼ� new Variable �Ƚᵵ �ȴ�. Ŭ���� ����
	String str;

	public static void main(String[] args) {
		int a; // local variable (��������), �����Ⱚ => �ݵ�� �ʱ�ȭ 
		a = 10;
		System.out.println("���� a = "+a);
		System.out.println("�ʵ� a = "+new Variable2().a); //new Variable2().a �������� �θ���!!!!
		
		System.out.println("�ʵ� b = "+Variable2.b);
		System.out.println("�ʵ� b = "+b); //field�� static �پ������Ƿ� variable2.b �Ƚᵵ ��� ���� 
		
		System.out.println("�ʵ� str = "+new Variable2().str);
		
	}
		
	
}
