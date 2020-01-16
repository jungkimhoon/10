package class_1;

class This {
	private String name;
	private int age;            //private => 클래스 안에서만 접근 가능
	
	public void setName(String name) { //구현부
		this.name = name; //this ==> 클래스 꺼
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
		
		aa.setName("김정훈"); //같은 클래스 안에서는 setter getter 필요 //
		aa.setAge(26);
		
		System.out.println("이름="+aa.getName()+"\t 나이="+ aa.getAge());
				
	}
	}


