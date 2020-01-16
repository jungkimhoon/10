package class_2;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println("토큰 개수 = "+ st.countTokens()); // 3
		
		while(st.hasMoreTokens()) { // 토큰 있거나 없거나
			System.out.println(st.nextToken()); // 토큰 꺼내고 다음으로 이동
		}
		System.out.println("------------------------");
		
		String[] ar = str.split(","); //split하면 배열로 나뉘어짐.
		for(String data : ar) {
			System.out.println(data);
		}
		System.out.println(ar.length);
		
		
		
	}

}
