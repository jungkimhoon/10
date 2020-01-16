package class_1;

class Person{
	private String name;
	private int age;            //private => 클래스 안에서만 접근 가능
	
	public void setName(String n) { //구현부
		name = n;
	}
	
	public void setAge(int n) {
		age = n;
	}
	
	public void setData(String n, int a) { //argument 인수, 매개변수 parameter
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
		System.out.println("객체 aa = "+aa);
		aa.setName("홍길동");
		aa.setAge(25);
		System.out.println("이름 = "+ aa.getName()+", 나이 = "+aa.getAge());
		System.out.println();

		Person bb = new Person();
		System.out.println("객체 bb = "+bb);
		bb.setName("코난");
		bb.setAge(16);
		System.out.println("이름 = "+ bb.getName()+", 나이 = "+bb.getAge());
		System.out.println();
		
		Person cc = new Person();
		cc.setData("또치", 30);
		System.out.println("객체 cc = "+cc);
		System.out.println("이름 = "+ cc.getName()+", 나이 = "+cc.getAge());
		System.out.println();
		
		Person dd = new Person();
		dd.setData();
		System.out.println("객체 dd = "+dd);
		System.out.println("이름 = "+ dd.getName()+", 나이 = "+dd.getAge());
	}
	
}

//int aa;     	정수형 변수
//double aa;	실수형 변수
//char aa;      문자형 변수

//Person aa;	객체
