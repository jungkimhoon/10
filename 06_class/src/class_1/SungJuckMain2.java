package class_1;

public class SungJuckMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SungJuck[] ar = new SungJuck[3];
		ar[0] = new SungJuck();
		
		for(int i=0; i<3; i++) {
			ar[i] = new SungJuck();
			System.out.println("ar["+i+"] = "+ar[i]);
			
		}
		System.out.println();
			ar[0].setName("È«±æµ¿");
			ar[0].setKor(90);
			ar[0].setEng(91);
			ar[0].setMath(100);
						
			ar[1].setName("±èÁ¤Àº");
			ar[1].setKor(90);
			ar[1].setEng(70);
			ar[1].setMath(60);
						
			ar[2].setName("±èÀÏ¼º");
			ar[2].setKor(100);
			ar[2].setEng(100);
			ar[2].setMath(100);
		
			
		for(int i=0; i<3; i++) {
			ar[i].setCalc();
			System.out.println("ar["+i+"].getName = "+ar[i].getName()+"\nar["+i+"].kor = "+ar[i].getKor()+"\nar["+i+"].eng = "+ar[i].getEng()+"\nar["+i+"].Math = "+ar[i].getMath());
			System.out.println("ar["+i+"].tot = "+ar[i].getTot()+"\nar["+i+"].avg = "+String.format("%.2f", ar[i].getAvg())+"\nar["+i+"].getGrade = "+ar[i].getGrade());	
			System.out.println();
		}
	}
		

	}


