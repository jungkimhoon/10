package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest3 {
	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	private int input(int[] ar) throws IOException {
		int sum = 0;
		for(int i=0 ; i<ar.length; i++) {
			System.out.print("ar["+i+"] = ");
			ar[i] = Integer.parseInt(br.readLine());
			sum += ar[i];
			}
		return sum;
		}
	
	private int max(int[] ar) throws IOException {
		int max = ar[0];
		for(int i=0 ; i<ar.length; i++) {
			if(ar[i] > max) max = ar[i];
		}
		return max;
		
	}
	
	private int min(int[] ar) throws IOException {
		int min = ar[0];
		for(int i=0 ; i<ar.length; i++) {
			if(ar[i] < min) min = ar[i];
		}
		return min;
		
	}
	
	private void output(int[] ar, int sum ,int max, int min ) throws IOException {
		System.out.println();
		for(int i=0 ; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("합 : " +sum);
		System.out.println("최대값 :  " +max);
		System.out.println("최소값  : " +min);
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		ArrayTest3 at = new ArrayTest3();
		// TODO Auto-generated method stub
		
		System.out.print("배열 크기 : ");
		int num = Integer.parseInt(at.br.readLine());
		int[] ar = new int[num];
		
		
		int sum = at.input(ar); // 호출
		int max = at.max(ar);
		int min = at.min(ar);
		at.output(ar,sum,max,min);
				
	
	}

}
