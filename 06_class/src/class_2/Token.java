package class_2;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "�п�,��,,���ӹ�";
		
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println("��ū ���� = "+ st.countTokens()); // 3
		
		while(st.hasMoreTokens()) { // ��ū �ְų� ���ų�
			System.out.println(st.nextToken()); // ��ū ������ �������� �̵�
		}
		System.out.println("------------------------");
		
		String[] ar = str.split(","); //split�ϸ� �迭�� ��������.
		for(String data : ar) {
			System.out.println(data);
		}
		System.out.println(ar.length);
		
		
		
	}

}
