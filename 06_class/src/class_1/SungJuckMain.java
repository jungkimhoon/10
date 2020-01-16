package class_1;

public class SungJuckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SungJuck aa = new SungJuck();
		
		aa.setName("È«±æµ¿");
		aa.setKor(90);
		aa.setEng(91);
		aa.setMath(100);
		aa.setCalc();
		
		System.out.println("aa.getName = "+aa.getName()+"\naa.kor = "+aa.getKor()+"\naa.eng = "+aa.getEng()+"\naa.Math = "+aa.getMath());
		System.out.println("aa.tot = "+aa.getTot()+"\naa.avg = "+String.format("%.2f", aa.getAvg())+"\naa.getGrade = "+aa.getGrade());	
		System.out.println();
		
		SungJuck bb = new SungJuck();
		
		bb.setName("±èÁ¤ÈÆ");
		bb.setKor(80);
		bb.setEng(81);
		bb.setMath(90);
		bb.setCalc();
		
		System.out.println("bb.getName = "+bb.getName()+"\nbb.kor = "+bb.getKor()+"\nbb.eng = "+bb.getEng()+"\nbb.Math = "+bb.getMath());
		System.out.println("bb.tot = "+bb.getTot()+"\nbb.avg = "+String.format("%.2f", bb.getAvg())+"\nbb.getGrade = "+bb.getGrade());	
		System.out.println();
	
		
		SungJuck cc = new SungJuck();
		
		cc.setName("È«±æµ¿");
		cc.setKor(90);
		cc.setEng(91);
		cc.setMath(100);
		cc.setCalc();
		
		System.out.println("cc.getName = "+cc.getName()+"\ncc.kor = "+cc.getKor()+"\ncc.eng = "+cc.getEng()+"\ncc.Math = "+cc.getMath());
		System.out.println("cc.tot = "+cc.getTot()+"\ncc.avg = "+String.format("%.2f", cc.getAvg())+"\ncc.getGrade = "+cc.getGrade());	
	}

}
