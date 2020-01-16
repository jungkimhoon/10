package practice;
import java.util.Scanner;

public class Practice11 {
	//�� 5���� �迭�� ���⼭ ��ƶ�
	Scanner sc = new Scanner(System.in);
	MemberDTO[] mem = new MemberDTO[5];
	int count;
	boolean flag[] = new boolean[5];

	public void main() {
	while(true) {
		System.out.println("**************");
		System.out.println("1. ����");
		System.out.println("2. ���");
		System.out.println("3. ����");
		System.out.println("4. Ż��");
		System.out.println("5. ������");		
		System.out.println("**************");
		System.out.print("��ȣ : ");
		int num = sc.nextInt();		
		if(num == 5) break;
		switch(num) {
		case 1: this.insert(); break;
		case 2:	list(); break;
		case 3: update(); break;
		case 4: delete(); break;
		}
		
	}

	}
	
	private void insert() {
		int i;
		
		for(i=0; i<mem.length; i++) {
			if(mem[i] == null) break;
		}
		
		if(i==mem.length) {
			System.out.println("5�� ����"); 
			return; //�޼ҵ� �����
		}
		
		mem[i] = new MemberDTO();
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("�ڵ��� �Է� : ");
		String phoneNum = sc.next();
		System.out.print("�ּ� �Է� : ");
		String addr = sc.next();
		
		mem[i].setName(name);
		mem[i].setage(age);
		mem[i].setphoneNum(phoneNum);
		mem[i].setaddr(addr);
		System.out.println(count+" row created");
		
		
	}
			
		
	
	private void list() {
		// TODO Auto-generated method stub
		System.out.println("�̸�\t����\t�ڵ���\t�ּ�");
		for(int i=0; i<mem.length; i++) {
			if(mem[i]!=null) {
			System.out.println(mem[i].getName()+"\t"+mem[i].getage()+"\t"+
							   mem[i].getphoneNum()+"\t"+mem[i].getaddr());
			}
		}
		
	}
	private void update() {
		int t=0;
		// TODO Auto-generated method stub
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		String num = sc.next();
		for(int i=0; i<mem.length; i++) {
			if(mem[i] != null && num.equals(mem[i].getphoneNum())) {
				System.out.println(mem[i].getName()+"\t"+mem[i].getage()+"\t"+
						   mem[i].getphoneNum()+"\t"+mem[i].getaddr());
				
				System.out.print("������ �̸� �Է� : ");
				String name = sc.next();
				System.out.print("������ ���� �Է� : ");
				int age = sc.nextInt();
				System.out.print("������ �ڵ��� �Է� : ");
				String phoneNum = sc.next();
				System.out.print("������ �ּ� �Է� : ");
				String addr = sc.next();
				
				mem[i].setName(name);
				mem[i].setage(age);
				mem[i].setphoneNum(phoneNum);
				mem[i].setaddr(addr);
				
				System.out.println("1 row updated");
				t++;
				break;
			}
			
		}
		if(t<1) System.out.println("ã�� ȸ���� �����ϴ�.");
		
	}
	private void delete() {

		// TODO Auto-generated method stub
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		String num = sc.next();
		for(int i=0; i<mem.length; i++) {
			if(mem[i] != null && num.equals(mem[i].getphoneNum())) {
				mem[i] = null;
				System.out.println("1 row deleted");
				break;

			} 
				
		}		
		if(i==5)
			System.out.println("ȸ�� ����");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberMain aa = new MemberMain();		
		aa.main();
		System.out.println("����");
		

	}

}

