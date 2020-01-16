package practice;

public class MemberDTO {
	private String name, phoneNum, addr;
	private int age;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setage(int age) {
		this.age = age;
	}
	public void setphoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setaddr(String addr) {
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public String getphoneNum() {
		return phoneNum;
	}
	
	public String getaddr() {
		return addr;
	}
	
	

}
