package for_while_dowhile;

public class ForTest_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum = 0;
		for(int i=1; i<=100; i++) {
			int num = (int)(Math.random()*500)+1;
			if(num % 2 == 0 && num % 3 ==0 ) {
				System.out.print(String.format("%4d",num)+ " ");
				count++;
				sum += num;
				if(count % 7 == 0) System.out.println();
			}			
			
		}//for end
		
		System.out.println("\n\n2�� 3�� ����� ���� : "+count);
		System.out.println("2�� 3�� ����� �� : "+sum);

	}

}
//1~500������ ������ 100�� �߻��Ͽ� 2�� 3�� ������� ����ϰ� �հ� ������ ����϶�.
//�� �� �ٿ� 7���� ���
//
//36 12 ...
//
//2�� 3�� ����� ���� = 
//2�� 3�� ����� �� =