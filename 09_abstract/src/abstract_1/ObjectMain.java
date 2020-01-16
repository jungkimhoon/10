package abstract_1;

/*
 * class Object {
 * 		public Boolean equals(Object ob){} //���� �� ��
 * 		public String toString(){} //Ŭ����@16����
 * 		public int hashCode(){} //�ּҰ� 10���� ǥ��
 * }
 * 
 * class String extends Object{
 * 		public Boolean equals(Object ob){} //���ڿ� �� (String class�� ���ڿ� ����.)
 * 		public String toString(){} --> String�� toString�� �̹� override�� ����  ���ڿ��� ���´�.
 * 		public int hashCode(){} //int�� ���Ѱ� hashCode�� ǥ�� �Ұ���
 * }
 */



class Test extends Object {
	@Override
	public String toString() {
		return getClass()+"@���ٺ�";
	}
	
}
//====================================
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("��ü t ="+t);
		System.out.println("��ü t ="+t.toString());
		System.out.println("��ü t ="+t.hashCode());//�ּ� ���� 10������ ��ȯ hashcode
		System.out.println();
		
		String str = "apple";
		System.out.println("��ü str ="+str);
		System.out.println("��ü str ="+str.toString());
		System.out.println("��ü str ="+str.hashCode());//�ּ� ���� 10������ ��ȯ hashcode
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa == bb : "+ (aa==bb)); // ������ : F
		System.out.println("aa.equals(bb) : "+aa.equals(bb)); // ���ڿ� : T
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc == dd : "+ (cc==dd)); // ������ : F
		System.out.println("cc.equals(dd) : "+cc.equals(dd)); // ������ : F
		System.out.println();
		
		Object qq = new String("apple");
		Object ww = new String("apple");
		System.out.println("qq == ww : "+ (qq==ww)); // ������ : F
		System.out.println("qq.equals(ww) : "+qq.equals(ww)); // ���ڿ� : T            == �������̵� �ż�  String�� ������
	}
	
}
