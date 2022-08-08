package hw5Q2Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;
	
	//Default constructor
	
	public Computer() {
	System.out.println("This is from default constructor from computer class");
	}
	
	
	//more than one parameterized constructor
	public Computer(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	
	public Computer(String brand,String  model,String operatingSystem,int price,char grade,boolean madeInUSA) {
		this.model=model;
		this.brand=brand;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade=grade;
		this.madeInUSA=madeInUSA;
		
		System.out.println("My Brand: " + brand + ", Model: " + model + ", Operationg System: " + operatingSystem
				+ ", price: $ " + price + ", Grade: " + grade + ", Made in USA? Ans is: " + madeInUSA + ".");
		
	}
	
	

	

	
	
}
