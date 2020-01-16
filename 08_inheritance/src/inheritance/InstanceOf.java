package inheritance;

class AAA{}
class BBB extends AAA{}


public class InstanceOf {
	
	public static void main(String[] args) {
		AAA aa = new AAA(); //부모
		BBB bb = new BBB(); //자식
		AAA aa2 = new BBB(); //부모 = 자식
		
		AAA aa3 = aa;
		if(aa instanceof AAA) System.out.println("1. True");
		else System.out.println("1. False");
		
		AAA aa4 = bb; //부모 = 자식
		if(bb instanceof AAA) System.out.println("2. True");
		else System.out.println("2. False");
		
		//BBB bb2 = (BBB)aa; //자식 = (자식)부모; ==> 캐스팅 안됨   ===> aa는 부모 주소만 참조함 (자식 주소 아예 없음) error;
		if(aa instanceof BBB) System.out.println("3. True");
		else System.out.println("3. False");
		
		BBB bb3 = (BBB)aa2;//자식 = (자식)부모; ==> 캐스팅 됨 ===> aa2는 자식 주소 참조
		if(aa2 instanceof BBB) System.out.println("4. True");
		else System.out.println("4. False");
		
		
	}

}
