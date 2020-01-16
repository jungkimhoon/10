package practice;
import java.util.Scanner;

public class Practice2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SalaryManager[] ar = new SalaryManager[5];
		
		while(true) {
			System.out.println("1.등록");
			System.out.println("2.출력");
			System.out.println("3.수정");
			System.out.println("4.검색");
			System.out.println("5.종료");
			
			int num = sc.nextInt();
			
			if(num == 1) {
				int i;
				for(i=0; i<ar.length; i++) {
					if(ar[i] == null) {
						System.out.print("이름 : ");
						String name = sc.next();
						System.out.print("직급 : ");
						String position = sc.next();
						System.out.print("기본급 : ");
						int basePay = sc.nextInt();
						System.out.print("수당 : ");
						int benefit = sc.nextInt();
						ar[i] = new SalaryManager(name,position,basePay,benefit);
						ar[i].calc();			
						if(i<ar.length) System.out.println(4-i+"자리 남음");
				
						break;
					}
				}
				if(i==5) System.out.println("꽉참");
			}else if(num == 2) {
				System.out.println("이름\t직급\t기본급\t수당\t세율\t월급");
				for(int i=0; i<ar.length; i++) {
					if(ar[i] != null) {
						System.out.println(ar[i].getName()+"\t"+ar[i].getPosition()+"\t"+ar[i].getBasePay()+"\t"+ar[i].getBenefit()+"\t"+ar[i].getTaxRate()+"\t"+(int)ar[i].getSalary());
					}
				}
			}else if(num == 3) {
				System.out.print("이름 입력 : ");
				String name = sc.next();
				
				for(int i=0; i<ar.length; i++) {
					if(ar[i] != null && name.equals(ar[i].getName())) {
						System.out.print("이름 : ");
						String rename = sc.next();
						ar[i].setName(rename);
						
						System.out.print("직급 : ");
						String position = sc.next();
						ar[i].setPosition(position);
						System.out.print("기본급 : ");
						int basePay = sc.nextInt();
						ar[i].setbasePay(basePay);
						System.out.print("수당 : ");
						int benefit = sc.nextInt();
						ar[i].setBenefit(benefit);
						ar[i].calc();
						break;
					}
				}
			}else if(num == 4) {
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.println("이름\t직급\t기본급\t수당\t세율\t월급");
				for(int i=0; i<ar.length; i++) {
					if(ar[i] != null && name.equals(ar[i].getName())) {
						System.out.println(ar[i].getName()+"\t"+ar[i].getPosition()+"\t"+ar[i].getBasePay()+"\t"+ar[i].getBenefit()+"\t"+ar[i].getTaxRate()+"\t"+(int)ar[i].getSalary());
						break;
					}else if(i==ar.length) System.out.println("이름 없음");
				}
			
			}else break;
		}//while
	}
}
