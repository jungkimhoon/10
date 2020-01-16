package class_2;

public class StringTest {
	public static void main(String[] args) {
		String a = "apple"; // literal ����			String class�� �ּ� �ȳ����� ���Ƶ�.
		String b = "apple"; // a�� �ּ� �����ؼ� apple ����
		if(a == b) System.out.println("a�� b�� ������ ����."); // O
		else System.out.println("a�� b�� ������ �ٸ���.");
		if(a.equals(b)) System.out.println("a = b (apple = apple)"); // O
		else System.out.println("a != b");
		System.out.println();
		
		String c = new String("apple"); //���ο� ��ü�� ������ ���ο� �ּҷ� apple ����
		String d = new String("apple"); //���ο� ��ü�� ������ ���ο� �ּҷ� apple ����
		if(c == d) System.out.println("c�� d�� ������ ����.");
		else System.out.println("c�� d�� ������ �ٸ���."); // O
		if(c.equals(d)) System.out.println("c = d (apple = apple)"); // O
		else System.out.println("c != d");
		
		// heap ������ �ּҸ� ������ �ִ�. a, b, c, d �� ����.
		// �ּ� a = b  c d �� ���� �ּ� ����.
		
		System.out.println();
		String e = "���� ��¥�� " +2018+6+29;
		System.out.println("e = " + e);
		
		System.out.println("���ڿ� ũ�� = "+e.length());
		
		/*
		 * ���ڿ��� ������ �ȵǹǷ� �޸� 4�� �����ȴ�.
		 * JVM�� ���ؼ� ���� �� Garbage Collector�� ������.
		 * Garbage Collector�� ����Ǹ� ��ǻ�ʹ� �����.
		 * 
		 * "���� ��¥��" 					1
		 * "���� ��¥�� 2018"				2
		 * "���� ��¥�� 20186"				3	
		 * e ----> "���� ��¥�� 2018629"		4
		 */
	
		for(int i=0; i<e.length(); i++) {
			System.out.println(i+" : "+e.charAt(i));
		}
		
		System.out.println("�κ� ���ڿ� ����= "+e.substring(7)); // 7 ~ ������
		System.out.println("�κ� ���ڿ� ����= "+e.substring(7, 11)); // 7 ~ 10, 11�������� ����
		
		System.out.println("�빮�� ���� = "+"HEllo".toUpperCase()); // �빮��
		System.out.println("�ҹ��� ���� = "+"HEllo".toLowerCase()); // �ҹ���
		
		System.out.println("���ڿ� �˻�= "+e.indexOf("¥")); // ������ ��ġ �˻�
		System.out.println("���ڿ� �˻�= "+e.indexOf("��¥")); // �ձ����� ��ġ �˻�
		System.out.println("���ڿ� �˻�= "+e.indexOf("���ٺ�")); // ������ -1 ���
		
	}
}
