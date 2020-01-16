package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest4 {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private void menu() throws IOException {		
		
		while(true) {
		System.out.println("***************");
		System.out.println("1. ����"); //input()
		System.out.println("2. ����"); //output()
		System.out.println("3. ����Ʈ");//list()
		System.out.println("4. ����");
		System.out.println("***************");		
		System.out.print("\n�޴� : ");
		return Integer.parseInt(br.readLine());
		}
	}
	
	private boolean input(boolean[] ar) throws IOException {
		System.out.print("1. ����\t��ġ �Է� : ");
		int rocation = Integer.parseInt(br.readLine());
		
		if(ar[rocation-1] == false) {
			System.out.println("\n"+rocation+"��ġ�� ������\n"); 
			ar[rocation-1] = !ar[rocation-1];
		}
		else System.out.println("\n"+rocation+"��ġ�� �̹� ������\n"); 
		return ar[rocation];
	}
	
	private boolean output(boolean[] ar) throws IOException{
		
		System.out.print("2. ����\t ��ġ �Է� : ");
		int rocation = Integer.parseInt(br.readLine());
		
		if(ar[rocation-1]) {
			System.out.println("\n"+rocation+"��ġ ����\n"); 
			ar[rocation-1] = !ar[rocation-1];
		}
		else System.out.println("\n"+rocation+"��ġ ���� ����\n"); 
		
		return ar[rocation];
	}
	
	private void list(boolean[] ar) throws IOException {
		System.out.println("\n3. ����Ʈ\n");
		for(int i=0;i<ar.length;i++) {
			System.out.println((i+1)+"��ġ : " +ar[i]);
		}
		System.out.println();
	}
	

	public static void main(String[] args) throws IOException {
		ArrayTest4 arr = new ArrayTest4();
		boolean[] ar = new boolean[5];
		System.out.println("������ ���� ���α׷�");
		
		boolean tst = false;
		
		while(true) {
		switch(arr.menu()) {
			case 1: arr.input(ar); break;
			case 2: arr.output(ar); break;
			case 3: arr.list(ar); break;
			case 4: tst = true; System.out.println("�ý��� ����"); break;	
			}
		if(tst == true) break;
		}
	
		
	}

}
