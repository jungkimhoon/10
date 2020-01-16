package instance;

public class Operator2 {
	
	public static void main(String[] args) {
		boolean a = 25>36;
		System.out.println("a = "+a);	//true
		System.out.println("!a = "+!a);	//false
		System.out.println();
		
		//클래스 메모리 생성 - new
		String b = "apple"; // => 스트링은 문자열 literal 사용가능
		String c = new String("apple"); // => 스트링은 클래스, new 사용가능
		String f = "apple";
		System.out.println("b==c : "+ (b==c ?"주소 같다" : "주소 다르다")); //b와 c의 주소가 각각 달라 다르다
		System.out.println("b!=c : "+ (b!=c ?"주소 같다" : "주소 다르다")); 
		System.out.println("b.equals(c) : " + (b.equals(c) ? "같다" : "다르다"));
		System.out.println("!b.equals(c) : " + (!b.equals(c) ? "참" : "거짓"));
		
		
		System.out.println("\nb==f : "+ (b==f ?"같다" : "다르다"));
	}

}
