package method;

/*�ֻ����� 2�� ������ ���� ���� ���� ���Ͻÿ�
�ֻ����� input()���� 1~6������ ������ �߻��Ͽ� �����Ѵ�
���� add()���� ���Ͽ� ���� �޴´�

[������]
ù��° �ֻ��� �� : 3
�ι�° �ֻ��� �� : 6
���� 9 �̴�*/


public class Practice2 {
	
	public int input() {
		int num = (int)(Math.random()*6) + 1;
		return num;
	}
	
    public int add(int a, int b) {
    	return a+b;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice2 aa = new Practice2();
		int num1 = aa.input();
		System.out.println("ù��° �ֻ��� �� : "+num1);
		
		int num2 = aa.input();
		System.out.println("�ι�° �ֻ��� �� : "+num2);
		
		System.out.println("���� "+ aa.add(num1,num2) +" �̴�.");
		
		
	}

}
