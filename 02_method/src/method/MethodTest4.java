package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* �̸�name, �ֹι�ȣid�� �Է��Ͽ� ������ ����Ͻÿ�.
 * ����gender�� �����ϴ� comp(), ����age�� ����ϴ� calcAge �޼ҵ带 �ۼ��϶�.
 * 
 * �̸� �Է� : ȫ�浿
 * �ֹι�ȣ �Է� : 001023-1234567
 * 
 * 2019 - 2000 + 1 
 * 001023-1234567
 * 941112-1234567
 * 2019-1994
 * ȫ�浿���� �����̰� 20�� �Դϴ�.
 * 
 */
public class MethodTest4 {
	
	public String comp(String id) {
		String gender = (id.charAt(7) == '1'||id.charAt(7) == '3' ? "����": "����");
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
		
		System.out.print("�̸� �Է� : ");
		String name = br.readLine();
		
		System.out.print("�ֹι�ȣ �Է� : ");
		String id = br.readLine();
		
		MethodTest4 T = new MethodTest4();
		String gender = T.comp(id);
		int age = T.calcAge(id);
		System.out.println(name+"�� "+gender+ "�̰� "+age+"�̴�.");
		
		
	}
	
}
