package method;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		System.out.print("car1.company : "+car1.company);
		System.out.print("  car1.model : "+car1.model);
		System.out.print("  car1.color : "+car1.color);
		System.out.print("  car1.maxSpeed : "+car1.maxSpeed);
		System.out.println();
		
			
		Car car2 = new Car("자가용");
		System.out.print("car2.company : "+car2.company);
		System.out.print("  car2.model : "+car2.model);
		System.out.print("  car2.color : "+car2.color);
		System.out.print("  car2.maxSpeed : "+car2.maxSpeed);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.print("car3.company : "+car3.company);
		System.out.print("  car3.model : "+car3.model);
		System.out.print("  car3.color : "+car3.color);
		System.out.print("  car3.maxSpeed : "+car3.maxSpeed);
		System.out.println();
		
		Car car4 = new Car("고돌", "노랭", 300);
		System.out.print("car4.company : "+car4.company);
		System.out.print("  car4.model : "+car4.model);
		System.out.print("  car4.color : "+car4.color);
		System.out.print("  car4.maxSpeed : "+car4.maxSpeed);
		
		
	}

}
