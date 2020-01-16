package array;

public class Practice5 {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("----------------------------------------------------");
		String[] name = {"홍길동","코난","또치"};
		int[][] jumsu = {{90,95,100,0},{100,89,75,0},{75,80,48,0}};
		double[] avg = new double[3];
		char[] grade = new char[3];
		
		for(int i=0; i<jumsu.length; i++) {
			for(int j=0; j<jumsu[i].length-1; j++) {
				jumsu[i][3] += jumsu[i][j];				
			}
		}
				
		for(int i=0; i<3; i++) {
			avg[i] = jumsu[i][3]/3.;		
			if(avg[i] >= 90) grade[i] = 'A';
			else if(avg[i] >= 80) grade[i] = 'B';
			else if(avg[i] >= 70) grade[i] = 'C';
			else if(avg[i] >= 60) grade[i] = 'D';
			else grade[i] = 'F';
		}
		
		for(int i=0; i<3; i++) {	
			System.out.print(name[i]+"\t");
			for(int j=0; j<4; j++) {
				System.out.print(jumsu[i][j]+"\t");
				}
			System.out.print(String.format("%.2f", avg[i])+"\t"+grade[i]);
			System.out.println();
		}
		System.out.print("----------------------------------------------------");
	}
}
