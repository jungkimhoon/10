package for_while_dowhile;
// A~Z �������� 100�� ���; A�� �� ���� ���
public class ForTest_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int count = 0;
		System.out.println("[������]");
		
		for(int i=1; i<=100; i++) {
			num = (int)(Math.random()*26 + 65);
			System.out.print((char)num+ " ");
			if(i%10 == 0) System.out.println();
			if(num == 'A') count++;
		}
		
		System.out.println("\nA�� ���� : "+count);
		
	}

}
