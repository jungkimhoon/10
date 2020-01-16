class Car {
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white", "auto", 4);
	}
	
	Car(String color){
		this("white", color, 4);
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
}


public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Car c2 = new Car(c1);
		Car c3 = new Car("stick");
		
		System.out.println("c1狼 可记"+c1.color+c1.gearType+c1.door);
		System.out.println("c2狼 可记"+c2.color+c2.gearType+c2.door);
		System.out.println("c3狼 可记"+c3.color+c3.gearType+c3.door);
		
		c1.door = 100;
		c3.door = 200;
		System.out.println("c1狼 可记"+c1.color+c1.gearType+c1.door);
		System.out.println("c2狼 可记"+c2.color+c2.gearType+c2.door);
		System.out.println("c3狼 可记"+c3.color+c3.gearType+c3.door);
		
		c3.door = c1.door;
		System.out.println("c3狼 可记"+c3.color+c3.gearType+c3.door);
	}

}
