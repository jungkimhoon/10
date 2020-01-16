package array;

public class MultiArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar = {{1,2,3,0},{4,5,6,0},{7,8,9,0},{0,0,0,0}};
		
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				System.out.print(String.format("%4d", ar[i][j]));
//			}
//			System.out.println();
//		}
//		
//		for(int i=0; i<ar.length; i++) {
//			int sum = 0;
//			for(int j=0; j<ar[i].length; j++) {
//				sum += ar[i][j] ;
//				if(j == 3) ar[i][j] = sum;
//			}
//		}
//				
//		
//		System.out.println();		
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				System.out.print(String.format("%4d", ar[i][j]));
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		for(int i=0; i<ar.length-1; i++) {
//			int sum = 0;
//			for(int j=0; j<ar[i].length; j++) {
//				sum += ar[j][i] ;
//				if(j == 3) ar[j][i] = sum;
//			
//			}		
//		}
		
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar[i].length-1; j++) {
				ar[i][3] += ar[i][j];
				ar[3][j] += ar[i][j];
				ar[3][3] += ar[i][j];
			}
			System.out.println();
		}
		
		
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(String.format("%4d", ar[i][j]));
			}
			System.out.println();
		}
		
		
		
		

	}

}
