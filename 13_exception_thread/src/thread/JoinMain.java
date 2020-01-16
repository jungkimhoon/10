package thread;

class JoinTest implements Runnable{
	
	public void run() {
		for(int i=1; i<=5; i++) { 
			System.out.print(i+"\t");
			try {
				Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}			
			}
		}
	}
	
//=========================================
public class JoinMain {

	public static void main(String[] args) {
		JoinTest jt = new JoinTest();
		Thread t = new Thread(jt);
		System.out.println("������ ����");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n������ ����");
		//������ ������ ������� ������� �ʴ´�. ������ ����Ǿ ��׶��忡�� ������� ���ư�.
	}
}

//0.5�ʾ� ���� 1 2 3 4 5 ���