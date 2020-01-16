package inheritance;

class AAA{}
class BBB extends AAA{}


public class InstanceOf {
	
	public static void main(String[] args) {
		AAA aa = new AAA(); //�θ�
		BBB bb = new BBB(); //�ڽ�
		AAA aa2 = new BBB(); //�θ� = �ڽ�
		
		AAA aa3 = aa;
		if(aa instanceof AAA) System.out.println("1. True");
		else System.out.println("1. False");
		
		AAA aa4 = bb; //�θ� = �ڽ�
		if(bb instanceof AAA) System.out.println("2. True");
		else System.out.println("2. False");
		
		//BBB bb2 = (BBB)aa; //�ڽ� = (�ڽ�)�θ�; ==> ĳ���� �ȵ�   ===> aa�� �θ� �ּҸ� ������ (�ڽ� �ּ� �ƿ� ����) error;
		if(aa instanceof BBB) System.out.println("3. True");
		else System.out.println("3. False");
		
		BBB bb3 = (BBB)aa2;//�ڽ� = (�ڽ�)�θ�; ==> ĳ���� �� ===> aa2�� �ڽ� �ּ� ����
		if(aa2 instanceof BBB) System.out.println("4. True");
		else System.out.println("4. False");
		
		
	}

}
