package thread;

public class RoseTest extends Thread {
	private String name;
	
	public RoseTest(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) { //Thread[�ູ,5,main] [�̸�, �켱����, �޼ҵ�]
			System.out.println(name + "\t" + Thread.currentThread()+"\t i = "+i);
			
		}
		System.out.println(name + "\t���� ");
	}
	
	public static void main(String[] args) {
		RoseTest aa = new RoseTest("�ȶ�"); //������ ����
		RoseTest bb = new RoseTest("�ູ"); //������ ����
		RoseTest cc = new RoseTest("���"); //������ ����
		
		
		aa.start(); //������ ����
		try {
			aa.join(); //�����尡 ���������� ��� //�ֿ켱 ����
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		bb.start(); //������ ����
		cc.start(); //������ ����
		
		//�켱���� 1~10, 10�� ���� ���� ����, default = 5
//		aa.setPriority(MAX_PRIORITY);
//		bb.setPriority(NORM_PRIORITY);
//		cc.setPriority(MIN_PRIORITY);
		
		aa.setName("�ȶ�"); //������ �̸� ����
		bb.setName("�ູ");
		cc.setName("���");
		
	
	
	}
}