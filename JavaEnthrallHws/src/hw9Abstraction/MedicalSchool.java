package hw9Abstraction; 

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
	
	
	
	//Q:::::::::::how many keywords are used for the inheritance in Java for Abstract Class?  
	//by using implements keyword
//  --is used to inherit INTERFACE in abstract class
//  -- an abstract class can inherit more than one INTERFACE
//  -- an abstract class can not inherit a regular class or abstract class by 
//implements keyword.
	
	
	/*Q::::::::::::::::::::::::::::::::::::::::::::::::
	 *  how many keywords are used for the inheritance in Java for a regular Class?  
	 *  Can a regular Class inherit other Abstract Class or a regular class or interface by extends key word?
	 */
	
	/*
	 * Extends keyword can be used to extend ONLY ONE class
	//REGULAR class can only inherit one regular class or one abstract class.
	// REGULAR Class can not inherit an Interface by EXTEND keyword.
	 */
	

}
