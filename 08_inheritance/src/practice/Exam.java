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
		ox = new char[5]; //초기화가 미래다.
		
		System.out.print("이름 입력 : ");
		this.name = sc.next();
		System.out.print("답 입력 : ");
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
