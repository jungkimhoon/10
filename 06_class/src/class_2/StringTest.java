package class_2;

public class StringTest {
	public static void main(String[] args) {
		String a = "apple"; // literal 생성			String class는 주소 안나오게 막아둠.
		String b = "apple"; // a의 주소 참조해서 apple 생성
		if(a == b) System.out.println("a와 b의 참조값 같다."); // O
		else System.out.println("a와 b의 참조값 다르다.");
		if(a.equals(b)) System.out.println("a = b (apple = apple)"); // O
		else System.out.println("a != b");
		System.out.println();
		
		String c = new String("apple"); //새로운 객체를 생성해 새로운 주소로 apple 생성
		String d = new String("apple"); //새로운 객체를 생성해 새로운 주소로 apple 생성
		if(c == d) System.out.println("c와 d의 참조값 같다.");
		else System.out.println("c와 d의 참조값 다르다."); // O
		if(c.equals(d)) System.out.println("c = d (apple = apple)"); // O
		else System.out.println("c != d");
		
		// heap 영역에 주소를 가지고 있다. a, b, c, d 다 가짐.
		// 주소 a = b  c d 는 각자 주소 가짐.
		
		System.out.println();
		String e = "오늘 날짜는 " +2018+6+29;
		System.out.println("e = " + e);
		
		System.out.println("문자열 크기 = "+e.length());
		
		/*
		 * 문자열은 편집이 안되므로 메모리 4번 생성된다.
		 * JVM에 의해서 삭제 시 Garbage Collector로 보낸다.
		 * Garbage Collector가 실행되면 컴퓨터는 멈춘다.
		 * 
		 * "오늘 날짜는" 					1
		 * "오늘 날짜는 2018"				2
		 * "오늘 날짜는 20186"				3	
		 * e ----> "오늘 날짜는 2018629"		4
		 */
	
		for(int i=0; i<e.length(); i++) {
			System.out.println(i+" : "+e.charAt(i));
		}
		
		System.out.println("부분 문자열 추출= "+e.substring(7)); // 7 ~ 끝까지
		System.out.println("부분 문자열 추출= "+e.substring(7, 11)); // 7 ~ 10, 11이전까지 추출
		
		System.out.println("대문자 변경 = "+"HEllo".toUpperCase()); // 대문자
		System.out.println("소문자 변경 = "+"HEllo".toLowerCase()); // 소문자
		
		System.out.println("문자열 검색= "+e.indexOf("짜")); // 글자의 위치 검색
		System.out.println("문자열 검색= "+e.indexOf("날짜")); // 앞글자의 위치 검색
		System.out.println("문자열 검색= "+e.indexOf("개바부")); // 없으면 -1 출력
		
	}
}
