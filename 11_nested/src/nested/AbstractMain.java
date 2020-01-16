package nested;

public class AbstractMain{
	
	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() {
			@Override
			public void setName(String name) {
				this.name = name;
			}
			
		};
		
		InterA aa = new InterA(){ //인터페이스 뉴 생성 안됨 {}(익명)를 뉴해서 생성
			public void aa() {}
			public void bb() {}
		};
		
		AbstractExam ae = new AbstractExam() {};
		
	}
	
	
	
}
