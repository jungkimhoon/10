package class_1;

class This {
	private String name;
	private int age;            //private => Ŭ���� �ȿ����� ���� ����
	
	public void setName(String name) { //������
		this.name = name; //this ==> Ŭ���� ��
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
		
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

//------------------
public class ThisTest {
	private String name;
	private int age;
	
	public static void main(String[] args) {
	
		This aa = new This();
		
		aa.setName("������"); //���� Ŭ���� �ȿ����� setter getter �ʿ� //
		aa.setAge(26);
		
		System.out.println("�̸�="+aa.getName()+"\t ����="+ aa.getAge());
				
	}
	}


