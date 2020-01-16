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
			System.out.println("1.�Է�");
			System.out.println("2.���");
			System.out.println("3.�˻�");
			System.out.println("4.����");
			System.out.println("5.����");
			System.out.println("6.��");
			System.out.println("**************");
			System.out.print("��ȣ : ");
			int num = sc.nextInt();
			if(num == 1) insertArticle();
			else if(num == 2) printArticle();
			else if(num == 3) searchArticle();
			else if(num == 4) deleteArticle();
			else if(num == 5) sortArticle();
			else if(num == 6) break;
			else System.out.println("1~6�߿� �����ض�.");
		}
	}

	private void sortArticle() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.�̸����� ��������");
			System.out.println("2.�������� ��������");
			System.out.println("3.���� �޴�");
			int num = sc.nextInt();
			if(num == 1) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						//return dto1.getName().compareTo(dto2.getName()); - ��������		
						
						//��������
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
		System.out.print("�˻� �� �̸� �Է� : ");
		String name = sc.next();
		int count=0;
		
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO dto = it.next();
		
			if(dto.getName().equals(name)) {
				it.remove(); //it.next()�� ��ȯ�� ���� ����.
				count++;
			}
		}		
		if(count==0) System.out.println("ã�� �̸� ����");
		else System.out.println(count+"�� ���� �Ϸ�");
	}
	
	private void searchArticle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻� �� �̸� �Է� : ");
		String name = sc.next();
		int count=0;
//		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		for(SungJukDTO dto : list) {
			if(dto.getName().equals(name)) {
				System.out.println(dto.toString());
				count++;
			}
		}		
		if(count==0) System.out.println("ã�� �̸� ����");
	}

	private void printArticle() {
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		for(SungJukDTO dto : list) {
			System.out.println(dto.toString()); 
		}		
	}

	private void insertArticle() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȣ �Է� : ");
		int num = sc.nextInt();
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("���� �Է� : ");
		int eng = sc.nextInt();
		System.out.print("���� �Է� : ");
		int math = sc.nextInt();
		
		SungJukDTO aa = new SungJukDTO(num,name,kor,eng,math);
		aa.calc();
		list.add(aa);
	}	//while	
	
}