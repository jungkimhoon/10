package thread;

public class Synchronized extends Thread{
	private int count;

	public static void main(String[] args) {
		Synchronized aa = new Synchronized(); //쓰레드 생성
		Synchronized bb = new Synchronized();
		Synchronized cc = new Synchronized();
		
		aa.setName("aa");//쓰레드 이름 설정
		bb.setName("bb");
		cc.setName("cc");
		
		aa.start();//쓰레드 시작
		bb.start();
		cc.start();
	}
	
//	public synchronized void run() {//동기화 안됨
	public void run() {
		//synchronized(this) { //동기화 x
		synchronized(Synchronized.class) {//동기화 됨!
			for(int i=1; i<=5; i++) {
				count++;
				System.out.println(Thread.currentThread().getName()+" : "+count);
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}//for
		}
	}
}
