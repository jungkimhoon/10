package Doit2;


import java.util.Scanner;

	
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		int tmp = 0;
		
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i=0; i<n-1; i++) {
			 for(int j=1; j<n; j++) {
				 if(num[j] < num[j-1]){ 
					tmp = num[j];
					num[j] = num[j-1];
					num[j-1] = tmp;
				 }
			 }
			System.out.println(num[i]);
		}
	}
}

		
		

   	
    
    	
    	
    