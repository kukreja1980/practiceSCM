package Basics;

public class carMain {

	public static int addNum = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car honda = new Car(); // Create and initialize the object
		Car toyota = new Car("Toyo"); // Create and initialize the object

		System.out.println("Honda's make is "+honda.getMake());
		System.out.println("Toyota's make is "+toyota.getMake());		
		
		honda.setMake("CRV");
		toyota.setMake("Camry");
		
		System.out.println("Honda's make is "+honda.getMake());
		System.out.println("Toyota's make is "+toyota.getMake());
		System.out.println("this is addNum " + addNum);
		System.out.println("this is honda's speed " + honda.increaseSpeed(20));
		System.out.println("this is honda's get speed before set speed " + honda.getSpeed());
		honda.setoSpeed(30);
		System.out.println("this is honda's get speed " + honda.getSpeed());
		
		int year = 55;
		BMWcar bmw1 = new BMWcar();
		year = bmw1.year;
		System.out.println("BMW1 year is " + year);
		System.out.println(bmw1.getMake());
		System.out.println("this is BMW's speed " + bmw1.increaseSpeed(20));
		System.out.println("this is honda's increase speed " + honda.increaseSpeed(20));
		
		BMWcar bmw2 = new BMWcar();
		year = bmw2.year;
		System.out.println("BMW2 year is " + year);
		System.out.println(bmw1.getMake());
		
	}

}
