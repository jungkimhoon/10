package abstract_1;

public abstract class AbstractTest { //POJO (plain old java object) //아무에게도 상속을 안받은 클래스 상태
	String name;
	
	
	public abstract void setName(String name);
	
	public String getName() { //구현 
		return name;
	}
	
}
