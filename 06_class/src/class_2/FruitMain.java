package class_2;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit[] ar = new Fruit[3];
		ar[0] = new Fruit("사과",100,80,75);
		ar[1] = new Fruit("포도",30,25,10);
		ar[2] = new Fruit("사과",25,30,90);
		
		System.out.println("-------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("-------------------------------------");
		
		for(int i=0; i<ar.length; i++) {
			ar[i].calcTot();
			ar[i].display();
		}
		
		System.out.println("-------------------------------------");
		Fruit.output();
		
	}

}



