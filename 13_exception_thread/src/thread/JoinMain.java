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
		System.out.println("스레드 시작");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n스레드 종료");
		//메인이 끝나도 쓰레드는 종료되지 않는다. 메인이 종료되어도 백그라운드에서 스레드는 돌아감.
	}
}

//0.5초씩 마다 1 2 3 4 5 출력