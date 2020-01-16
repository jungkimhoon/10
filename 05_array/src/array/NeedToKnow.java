package array;

public class NeedToKnow {
	//필드
	int a = 3;
	int b;
	//b = 3; 
	
	//필드에는 선언문만 올 수 있다. 저건 초기값 설정 아님.. just 대입문 배 
	
	
	public static void main(String[] args) {
		int[] ar = {10, 20, 30};
		int[] br;
		br = new int[3];
		br[0] = 10;
		br[1] = 20;
		br[2] = 30
		int[] cr = new int[] {10, 20, 30};
		int[] dr = new int[3];
		
		//int[] ar = new int[3] {10, 20, 30}; ==== XXX
		
		/*XXXXXXXXXXXXXXX
		int[] ar;
		ar = {10, 20, 30};
		
		ar 배열의 개수를 모른다.
		XXXXXXXXXXXXXXX*/
		
	}

}
