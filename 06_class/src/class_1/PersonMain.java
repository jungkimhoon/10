package class_1;

class Person{
	private String name;
	private int age;            //private => Ŭ���� �ȿ����� ���� ����
	
	public void setName(String n) { //������
		name = n;
	}
	
	public void setAge(int n) {
		age = n;
	}
	
	public void setData(String n, int a) { //argument �μ�, �Ű����� parameter
		name = n;
		age = a;
	}
	
	public void setData() {
		
	}
		
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
		
}
//-----------------
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person aa = new Person();
		System.out.println("��ü aa = "+aa);
		aa.setName("ȫ�浿");
		aa.setAge(25);
		System.out.println("�̸� = "+ aa.getName()+", ���� = "+aa.getAge());
		System.out.println();

		Person bb = new Person();
		System.out.println("��ü bb = "+bb);
		bb.setName("�ڳ�");
		bb.setAge(16);
		System.out.println("�̸� = "+ bb.getName()+", ���� = "+bb.getAge());
		System.out.println();
		
		Person cc = new Person();
		cc.setData("��ġ", 30);
		System.out.println("��ü cc = "+cc);
		System.out.println("�̸� = "+ cc.getName()+", ���� = "+cc.getAge());
		System.out.println();
		
		Person dd = new Person();
		dd.setData();
		System.out.println("��ü dd = "+dd);
		System.out.println("�̸� = "+ dd.getName()+", ���� = "+dd.getAge());
	}
	
}

//int aa;     	������ ����
//double aa;	�Ǽ��� ����
//char aa;      ������ ����

//Person aa;	��ü
