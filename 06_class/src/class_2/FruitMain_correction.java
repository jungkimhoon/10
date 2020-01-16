package class_2;

public class FruitMain_correction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit_correction[] ar = { new Fruit_correction("사과",100,80,75), 
								  new Fruit_correction("포도",30,25,10), 
								  new Fruit_correction("사과",25,30,90)};
		

		System.out.println("-------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("-------------------------------------");
		
		for(Fruit_correction f : ar) {
			f.calc();
			f.display();
		}
		
		System.out.println("-------------------------------------");
		Fruit_correction.output();
	}

}
