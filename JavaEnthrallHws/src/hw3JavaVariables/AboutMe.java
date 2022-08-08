package hw3JavaVariables;

public class AboutMe {
	
	    // Variable Declaration
	    public String major = "Computer Science.";
	    // Variable Initialization
	    public String myName = "Farah Sultana";
	    public char myGender = 'F';
	    public byte myLuckyNumber = 21;
	    public float myWeight = 125.25f;
	    public float  myHeight = 168.34f;
	    public short myTution = 4289;
	    public int myZipcode = 11421;
	    public long mySalary= 123456;
	    public double myGpa= 4.73;
	    public boolean myGraduationStatus = false;

	    public static void main(String[] args) {
	        //Object  instantiation
	        AboutMe myInfos = new AboutMe();
	        System.out.println("This is " + myInfos.myName + ". My Major is " + myInfos.major);
	        System.out.println("\"EnthrallIT\"");
	        System.out.println("\'EnthrallIT\'");
	    }

}
