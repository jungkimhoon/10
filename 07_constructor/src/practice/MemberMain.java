package practice;
import java.util.Scanner;

public class MemberMain {
	//총 5명의 배열을 여기서 잡아라
	Scanner sc = new Scanner(System.in);
	MemberDTO[] mem = new MemberDTO[5];
	int count;
	boolean flag[] = new boolean[5];

	public void main() {
	while(true) {
		System.out.println("**************");
		System.out.println("1. 가입");
		System.out.println("2. 출력");
		System.out.println("3. 수정");
		System.out.println("4. 탈퇴");
		System.out.println("5. 끝내기");		
		System.out.println("**************");
		System.out.print("번호 : ");
		int num = sc.nextInt();		
		if(num == 5) break;
		switch(num) {
		case 1: insert(); break;
		case 2:	list(); break;
		case 3: update(); break;
		case 4: delete(); break;
		}
		
	}

	}
	
	private void insert() {
	
		// TODO Auto-generated method stub
		for(int i=0; i<mem.length; i++) {
			if(count == 5) {
				System.out.println("5명 꽉차");
				break;
			}
			if(flag[i] == false) {
			mem[i] = new MemberDTO();				
				
			System.out.print("이름 입력 : ");
			String name = sc.next();
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			System.out.print("핸드폰 입력 : ");
			String phoneNum = sc.next();
			System.out.print("주소 입력 : ");
			String addr = sc.next();
			
			mem[i].setName(name);
			mem[i].setage(age);
			mem[i].setphoneNum(phoneNum);
			mem[i].setaddr(addr);
			System.out.println("1 row created");
			
			flag[i] = true;
			count++;
			System.out.println(5-count+"자리 남음");
			break;
			}
		}
	}
			
		
	
	private void list() {
		// TODO Auto-generated method stub
		System.out.println("이름\t나이\t핸드폰\t주소");
		for(int i=0; i<mem.length; i++) {
			if(mem[i].getName() != null) {
			System.out.println(mem[i].getName()+"\t"+mem[i].getage()+"\t"+
							   mem[i].getphoneNum()+"\t"+mem[i].getaddr());
			}
		}
		
	}
	private void update() {
		int t=0;
		// TODO Auto-generated method stub
		System.out.print("핸드폰 번호 입력 : ");
		String num = sc.next();
		for(int i=0; i<mem.length; i++) {
			if(mem[i] != null && num.equals(mem[i].getphoneNum())) {
				System.out.println(mem[i].getName()+"\t"+mem[i].getage()+"\t"+
								   mem[i].getphoneNum()+"\t"+mem[i].getaddr());
							
				System.out.print("수정할 이름 입력 : ");
				String name = sc.next();
				System.out.print("수정할 나이 입력 : ");
				int age = sc.nextInt();
				System.out.print("수정할 핸드폰 입력 : ");
				String phoneNum = sc.next();
				System.out.print("수정할 주소 입력 : ");
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
		if(t<1) System.out.println("찾는 회원이 없습니다.");
		
	}
	
	private void delete() {
		int t = 0;
		// TODO Auto-generated method stub
		System.out.print("핸드폰 번호 입력 : ");
		String num = sc.next();
		for(int i=0; i<mem.length; i++) {
			if(mem[i] != null && num.equals(mem[i].getphoneNum())) {
				System.out.println("1 row deleted");
				count--;
				flag[i] = false;
				mem[i] = new MemberDTO();	
				t++;
				break;

			} 
		}
		
		if(t<1) System.out.println("찾는 회원이 없습니다.");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberMain aa = new MemberMain();		
		aa.main();
		

	}

}

