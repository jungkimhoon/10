package chapter6;

class car{
	String color;
	String gearType;
	int door;
	
	car(){}
	
	car(String c, String g, int d){ 
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1 = new car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		car c2 = new car("white", "auto", 4);
		
		System.out.println("c1 = "+c1.color+" "+c1.gearType+" "+c1.door);
		System.out.println("c2 = "+c2.color+" "+c2.gearType+" "+c2.door);
		

	}

}
