package Practice;

import java.util.Calendar;
import java.util.Scanner;

//[����1]
//Ŭ������ : CalendarTest
//
//�⵵ �Է� : 2002
//�� �Է� : 10	
//
//��	  ��	ȭ	��	��	��	��
//		1	2	3	4	5
//6	 7	8	9	10	11	12
//13 14	15	16	17	18	19
//20 21	22	23	24	25	26
//27 28	29	30	31
//
//�⺻������ - �⵵, �� �Է�
//calculator()
//display()

public class CalendarMain extends CalendarTest {

	private int year, month, week, lastDay;
	
	CalendarMain(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ �Է��ض� : ");
		year = sc.nextInt();
		System.out.print("�� �Է��ض� : ");
		month = sc.nextInt();
	}
	
	@Override
	public void calculator() {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.YEAR, year);
		cal.set(cal.MONTH, month);
		cal.set(year,month-1,1);
		
		week = cal.get(Calendar.DAY_OF_WEEK); 
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); 
	}

	@Override
	public void display() {
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int i=1;i<week;i++) {
			System.out.print("\t");
		}
		for(int i=1; i<=lastDay; i++) {
			System.out.print(i+"\t");
			if(week%7==0) System.out.println();
			week++;
		}
	}
	
	public static void main(String[] args) {
		CalendarMain cm = new CalendarMain();
		cm.calculator();
		cm.display();
	}

}
