package instance;

public class Operator2 {
	
	public static void main(String[] args) {
		boolean a = 25>36;
		System.out.println("a = "+a);	//true
		System.out.println("!a = "+!a);	//false
		System.out.println();
		
		//Ŭ���� �޸� ���� - new
		String b = "apple"; // => ��Ʈ���� ���ڿ� literal ��밡��
		String c = new String("apple"); // => ��Ʈ���� Ŭ����, new ��밡��
		String f = "apple";
		System.out.println("b==c : "+ (b==c ?"�ּ� ����" : "�ּ� �ٸ���")); //b�� c�� �ּҰ� ���� �޶� �ٸ���
		System.out.println("b!=c : "+ (b!=c ?"�ּ� ����" : "�ּ� �ٸ���")); 
		System.out.println("b.equals(c) : " + (b.equals(c) ? "����" : "�ٸ���"));
		System.out.println("!b.equals(c) : " + (!b.equals(c) ? "��" : "����"));
		
		
		System.out.println("\nb==f : "+ (b==f ?"����" : "�ٸ���"));
	}

}
