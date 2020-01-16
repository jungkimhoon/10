package abstract_1;

/*
 * class Object {
 * 		public Boolean equals(Object ob){} //참조 값 비교
 * 		public String toString(){} //클래스@16진수
 * 		public int hashCode(){} //주소값 10진수 표현
 * }
 * 
 * class String extends Object{
 * 		public Boolean equals(Object ob){} //문자열 비교 (String class만 문자열 비교함.)
 * 		public String toString(){} --> String은 toString을 이미 override한 상태  문자열로 나온다.
 * 		public int hashCode(){} //int는 유한개 hashCode로 표현 불가능
 * }
 */



class Test extends Object {
	@Override
	public String toString() {
		return getClass()+"@개바부";
	}
	
}
//====================================
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t ="+t);
		System.out.println("객체 t ="+t.toString());
		System.out.println("객체 t ="+t.hashCode());//주소 값을 10진수로 변환 hashcode
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 str ="+str);
		System.out.println("객체 str ="+str.toString());
		System.out.println("객체 str ="+str.hashCode());//주소 값을 10진수로 변환 hashcode
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa == bb : "+ (aa==bb)); // 참조값 : F
		System.out.println("aa.equals(bb) : "+aa.equals(bb)); // 문자열 : T
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc == dd : "+ (cc==dd)); // 참조값 : F
		System.out.println("cc.equals(dd) : "+cc.equals(dd)); // 참조값 : F
		System.out.println();
		
		Object qq = new String("apple");
		Object ww = new String("apple");
		System.out.println("qq == ww : "+ (qq==ww)); // 참조값 : F
		System.out.println("qq.equals(ww) : "+qq.equals(ww)); // 문자열 : T            == 오버라이딩 돼서  String꺼 가져옴
	}
	
}
