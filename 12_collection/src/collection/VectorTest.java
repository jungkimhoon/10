package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = " + v.size()); //0
		System.out.println("벡터 용량 = " + v.capacity()); //기본용량 10개, 10개씩 증가함
		System.out.println();
		
		System.out.println("항목 추가");
		for(int i=1; i<=10; i++) {
			v.add(i+"");
		}
		System.out.println("벡터 크기 = " + v.size()); //10
		System.out.println("벡터 용량 = " + v.capacity()); //10
		System.out.println();
		
		v.addElement(5+"");
		System.out.println("벡터 크기 = " + v.size()); //11
		System.out.println("벡터 용량 = " + v.capacity()); //20
		System.out.println();
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+ " ");
		}
		System.out.println();
		
		//v.remove("5"); // 중복 5중 앞에 5삭제
		v.remove(10); // 원하는 위치 삭제
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		System.out.println();
		
		Vector<String> v2 = new Vector<String>(5,2); //기본용량 5개, 2개씩 증가
	
	}

}
