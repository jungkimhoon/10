package practice;

import java.text.DecimalFormat;

public class SungJukDTO implements Comparable<SungJukDTO>{
	private int num, kor, eng, math, tot;
	private String name;
	private double avg;
	
	SungJukDTO(int num, String name, int kor, int eng, int math){
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}

	public void calc() {
		tot = kor + eng + math;
		avg = tot/3.;
	}
	
	public int compareTo(SungJukDTO dto) {
//		if(tot < dto.tot) return 1;
//		else if(tot == dto.tot) return 0;
//		else return -1;
		return tot < dto.tot ? 1 : -1;
		
	}
	
	public String toString() {
		return num+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+new DecimalFormat("#.##").format(avg);
	}
	
	
}
