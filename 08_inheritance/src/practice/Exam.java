package practice;
import java.util.Scanner;

public class Exam {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String dap;
	private char[] ox;
	private int score;
	private final String JUNG="11111";
	
	public Exam(){
		ox = new char[5]; //�ʱ�ȭ�� �̷���.
		
		System.out.print("�̸� �Է� : ");
		this.name = sc.next();
		System.out.print("�� �Է� : ");
		this.dap = sc.next();
		
	}
	
	public String getName(){
		return name;
	}
	
	public char[] getOx(){
		for(int i=0; i<5; i++) {
			if(JUNG.charAt(i) == dap.charAt(i))
			 ox[i] = 'O';
			else ox[i] = 'X';
		}//for		
		return ox;
	}
	
	public int getScore(){
		for(int i=0; i<5; i++) {
			if(JUNG.charAt(i) == dap.charAt(i))
			score += 20;
		}//for
		return score;
	}
}
