package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");//Value 중복허용
		map.put("book102", "백설공주");
		map.put("book301", "피오나");
		map.put("book101", "엄지공주"); //key 중복허용
		
//		System.out.println(map.get("book101"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("코드 입력 : ");
		String key = sc.next();
//		if(map.get(key)!=null) System.out.println(map.get(key));
//		else System.out.println("없는 코드다");
		
		if(map.containsKey(key)) System.out.println(map.get(key));
		else System.out.println("없는 코드다");
		
	}
}
