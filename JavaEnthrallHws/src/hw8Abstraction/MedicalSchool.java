package hw8Abstraction;

public abstract class MedicalSchool {
	
	public abstract void anatomyLab();
	
	public void biochemistryLab() {
		
		System.out.println("This is a non-abstract method inside a abstract class MedicalSchool");
	}
	
	MedicalSchool(){
		
	}
	
	
	//Can you create a Constructor inside MedicalSchool Abstract Class? If yes, 
	//create default Constructor on one of the Abstract Class. If no, 
	//comment out the created constructor and answer why not?
	
	//ANS***********************************
	
	//Abstract Class Can Have a constructor. but we can not create objects from abstract class
	//To avoid having repetative codes, abstract class allows having constructor
	

}
