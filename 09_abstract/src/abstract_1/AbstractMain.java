package abstract_1;

public  class AbstractMain extends AbstractTest { //추상 메소드는 메소드 오버라이드 필수


	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractTest at = new AbstractMain(); //error 추상 클래스는 객체 생성 직접 못함. //상속받아서 사용
		at.setName("홍길동"); //호출
		System.out.println("이름 = "+at.getName());
	}
		
}
