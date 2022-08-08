package hw9Abstraction;

public interface University extends College, Hospital {
	
/* Q::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
 * how many keywords are used for the inheritance in Interface, answer by Java comments?  
 * Can an interface inherit other Interfaces, or a regular class or abstract class by extends key word? 
 * How many inheritance is possible?
 */

	/*
	 * INTERFACE 
	 *  -->can inherit MORE THAN ONE Interface by extends keyword.
//       --> CAN NOT inherit regular class or an abstract class by extends keyword
 *      --> more than one
	 */
	
	
	
	public int classSize();
	
	public void playGround();

	public int teacher();
	
	/*
	University(){
		
	}
	*/
	
	//We can not create a constructor Inside University Interface.
	//Since we cannot create an object of interface
	
	public default void gymnasium () {
		System.out.println("From default method of the University Interface");
		
	}
	
	public static void library() {
		System.out.println("This is from the static method of the University Interface");
	}
	

}
