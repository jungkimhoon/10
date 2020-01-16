package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Collection coll = new ArrayList(); //coll은 Collection을 참조하지만 ArrayList의 add가 오버라이드 되어있어서 그것을 사용한다.
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이");
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		
		Iterator it = coll.iterator(); // iterator 생성
		while(it.hasNext()) {
			System.out.println(it.next()); //순서대로 출력, 중복허용
		}
		
		
	}

}
