package for_while_dowhile;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		do {
			i++;
			System.out.print(i+ " ");
		}while(i<10);
		System.out.println("\n");
		// A~Z ���� ����ϵ� �� �ٿ� 7���� ���
		
		char ch = 'A';
		int count = 0;
		
		 do{
			System.out.print(ch+" ");
			ch++;
			count++;
			if(count % 7 == 0) System.out.println();
			if(ch > 'Z') break;
		 }while(true);
		
	
	}

}
