package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aa {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private void menu(boolean[] ar) throws IOException {		
		int num;
		while(true) {
		System.out.println("***************");
		System.out.println("1. 입차"); //input()
		System.out.println("2. 출차"); //output()
		System.out.println("3. 리스트");//list()
		System.out.println("4. 종료");
		System.out.println("***************");		
		System.out.print("\n메뉴 : ");
		num = Integer.parseInt(br.readLine());
		if(num>4 || num<1) continue;
		if(num == 1) input(ar);
		if(num == 2) output(ar);
		if(num == 3) list(ar);
		if(num == 4) {
			System.out.println("시스템 종료");
			break;
			}
		}
	}
	
	private boolean input(boolean[] ar) throws IOException {
		System.out.print("1. 입차\t위치 입력 : ");
		int rocation = Integer.parseInt(br.readLine());
		
		if(ar[rocation-1] == false) {
			System.out.println("\n"+rocation+"위치에 입차됨\n"); 
			ar[rocation-1] = !ar[rocation-1];
		}
		else System.out.println("\n"+rocation+"위치에 이미 주차됨\n"); 
		return ar[rocation];
	}
	
	private boolean output(boolean[] ar) throws IOException{
		
		System.out.print("2. 출차\t 위치 입력 : ");
		int rocation = Integer.parseInt(br.readLine());
		
		if(ar[rocation-1]) {
			System.out.println("\n"+rocation+"위치 출차\n"); 
			ar[rocation-1] = !ar[rocation-1];
		}
		else System.out.println("\n"+rocation+"위치 주차 없음\n"); 
		
		return ar[rocation];
	}
	
	private void list(boolean[] ar) throws IOException {
		System.out.println("\n3. 리스트\n");
		for(int i=0;i<ar.length;i++) {
			System.out.println((i+1)+"위치 : " +ar[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException {
		aa arr = new aa();
		boolean[] ar = new boolean[5];
		System.out.println("주차장 관리 프로그램");
			
		arr.menu(ar);
		}
	}


