package prac;

import java.io.Serializable;
import java.util.ArrayList;


public class ScoreDTO implements Serializable, Comparable<ScoreDTO>{
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;

	
	public ScoreDTO() {

	}
	public void calc() {
		tot = kor + eng + math;
		avg = tot/3.;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}


	public int compareTo(ScoreDTO dto) {
		if(tot < dto.tot) return 1;
		else if(tot == dto.tot) return 0;
		else return -1;
	}
}
