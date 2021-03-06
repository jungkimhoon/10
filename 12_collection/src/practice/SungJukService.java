package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import collection.PersonDTO;


public class SungJukService {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
	
			System.out.println("**************");
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.검색");
			System.out.println("4.삭제");
			System.out.println("5.정렬");
			System.out.println("6.끝");
			System.out.println("**************");
			System.out.print("번호 : ");
			int num = sc.nextInt();
			if(num == 1) insertArticle();
			else if(num == 2) printArticle();
			else if(num == 3) searchArticle();
			else if(num == 4) deleteArticle();
			else if(num == 5) sortArticle();
			else if(num == 6) break;
			else System.out.println("1~6중에 선택해라.");
		}
	}

	private void sortArticle() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.이름으로 오름차순");
			System.out.println("2.총점으로 내림차순");
			System.out.println("3.이전 메뉴");
			int num = sc.nextInt();
			if(num == 1) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						//return dto1.getName().compareTo(dto2.getName()); - 오름차순		
						
						//내림차순
						//return dto2.getName().compareTo(dto1.getName());
						return dto2.getName().compareTo(dto1.getName());
					}
				};
				Collections.sort(list, com);
				break;
			
			}else if(num == 2) {
				Collections.sort(list);
				printArticle();
				break;
			}else if(num == 3) {
				menu();	
				break;
			}else continue;
		}
		
	}

	private void deleteArticle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색 할 이름 입력 : ");
		String name = sc.next();
		int count=0;
		
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO dto = it.next();
		
			if(dto.getName().equals(name)) {
				it.remove(); //it.next()가 반환한 값을 지움.
				count++;
			}
		}		
		if(count==0) System.out.println("찾는 이름 없음");
		else System.out.println(count+"개 삭제 완료");
	}
	
	private void searchArticle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색 할 이름 입력 : ");
		String name = sc.next();
		int count=0;
//		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO dto : list) {
			if(dto.getName().equals(name)) {
				System.out.println(dto.toString());
				count++;
			}
		}		
		if(count==0) System.out.println("찾는 이름 없음");
	}

	private void printArticle() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO dto : list) {
			System.out.println(dto.toString()); 
		}		
	}

	private void insertArticle() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int num = sc.nextInt();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("국어 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 입력 : ");
		int math = sc.nextInt();
		
		SungJukDTO aa = new SungJukDTO(num,name,kor,eng,math);
		aa.calc();
		list.add(aa);
	}	//while	
	
}