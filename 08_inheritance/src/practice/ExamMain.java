package practice;
import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� �Է� : ");
		int n = sc.nextInt();
		Exam[] a = new Exam[n];
		
		for(int i=0; i<n; i++) {
			a[i] = new Exam();
		}
		System.out.println("�̸�\t12345\t����");
		for(int i=0; i<n; i++) {
			System.out.print(a[i].getName()+"\t");
			
			for(int j=0; j<a[i].getOx().length;j++) {
			System.out.print(a[i].getOx()[j]);
			}
			System.out.print("\t"+a[i].getScore());
			System.out.println();
		}

	}

}
