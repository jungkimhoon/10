package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest3 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //���� �۾ƶ�.
		System.out.print("�̸� �Է� : ");
		String name = br.readLine(); //readLine()�� ���ڿ��� �Է¹޴´� ������.
		
		System.out.print("���� �Է� : ");
		int kor = Integer.parseInt(br.readLine());

		System.out.print("���� �Է� : ");
		int eng = Integer.parseInt(br.readLine());
		
		System.out.print("���� �Է� : ");
		int math = Integer.parseInt(br.readLine());

		MethodTest3 a = new MethodTest3();
		int AA = a.calcTot(math, kor, eng);
		
		System.out.println("\n\t*** "+name+" ����ǥ ***");
		System.out.println("����\t ����\t ����\t ����\t ���\t");
		System.out.println(kor+"\t "+eng+"\t "+math+"\t "+AA+"\t "+ String.format("%.2f",a.calcAvg(AA)));
		// �̸�, ����, ����, ������ �Է� �޾Ƽ� ����, ����� ���Ͻÿ�.
		// ���� calcTot()
		// ��� calAvg()

	}//main
	
	
	public int calcTot(int a, int b, int c) {
		return a+b+c;
	}//calcTot
	
	public double calcAvg(int a) {
		return a/3.;
	}//calcAvg


}