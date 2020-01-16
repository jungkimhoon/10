package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 이름name, 주민번호id를 입력하여 성별을 출력하시오.
 * 성별gender을 구별하는 comp(), 나이age를 계산하는 calcAge 메소드를 작성하라.
 * 
 * 이름 입력 : 홍길동
 * 주민번호 입력 : 001023-1234567
 * 
 * 2019 - 2000 + 1 
 * 001023-1234567
 * 941112-1234567
 * 2019-1994
 * 홍길동님은 남자이고 20살 입니다.
 * 
 */
public class MethodTest4 {
	
	public String comp(String id) {
		String gender = (id.charAt(7) == '1'||id.charAt(7) == '3' ? "남자": "여자");
		return gender;
	}
	
	public int calcAge(String id) {
		String a = id.charAt(0) + "" + id.charAt(1);
		int real_age = Integer.parseInt(a);
		real_age += id.charAt(7) == '1'||id.charAt(7) == '2' ? 1900 : 2000; 
		int age = 2019 - real_age + 1;
	    return age;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력 : ");
		String name = br.readLine();
		
		System.out.print("주민번호 입력 : ");
		String id = br.readLine();
		
		MethodTest4 T = new MethodTest4();
		String gender = T.comp(id);
		int age = T.calcAge(id);
		System.out.println(name+"은 "+gender+ "이고 "+age+"이다.");
		
		
	}
	
}
