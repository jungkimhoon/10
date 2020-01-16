package for_while_dowhile;

public class ForTest_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1; i<=10; i++) {
			int j = i;
			if(i%2 == 1) {j = -i; System.out.print(j+"");}
			else {j = i; System.out.print("+" +j+"");}
			sum += j;
		}
		System.out.println(" = "+sum);
		

	}

}

// [실행결과]
// -1+2-3+4 ... +10 = 5