package class_2;

public class Fruit_correction {
	private String pum;
	private int jan;
	private int feb;
	private int mar;
	private int tot;
	private static int sumJan;
	private static int sumFeb;
	private static int sumMar;
	
	public Fruit_correction(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;		
	}
	
	public void calc() {
		tot = jan + feb + mar;
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}

	public void display() {
		System.out.println(pum+"\t"+jan+"\t"+feb+"\t"+mar+"\t"+tot);
		
	}
	
	public static void output() {
		System.out.println("\t"+sumJan+"\t"+sumFeb+"\t"+sumMar);
	}
	
	
	

}
