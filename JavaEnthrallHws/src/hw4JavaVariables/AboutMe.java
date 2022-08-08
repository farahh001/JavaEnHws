package hw4JavaVariables;

public class AboutMe {

		// Variable declaration
	    public String myName = "Farah Sultana";
	    public char myGender = 'F';
	    
	    public byte myLuckyNumber;
	    public float myWeight ;
	    public float  myHeight ;
	    public int myZipcode;
	    public String major;
	    public double myGpa;
	    public short myTution;
	    public boolean myGraduationStatus;
	    public long mySalary;
	
	public AboutMe() {
		System.out.println("This is all about me: ");
	}

	public void aboutMe(String myName, byte myLuckyNumber, float myWeight,
			float  myHeight,long mySalary) {
		
		this.myName = myName;
		this.myGender = myGender;
		this.myLuckyNumber = myLuckyNumber;
		this.myWeight = myWeight;
		this.myHeight = myHeight;
		this.mySalary = mySalary;
		this.myZipcode = myZipcode;
		this.major=major;
		this.myGpa= myGpa;
		this.myTution=myTution;
		this.myGraduationStatus=myGraduationStatus;
		
		
		
		
		System.out.println("My name is " + myName +". I am  a " + myGender + " ." +
		"\nMy lucky number is  " + myLuckyNumber+ ". I hope to earn  $" + mySalary + " /per year." +
				"\n I weigh  " + myWeight + ". and My height is " + myHeight + " \nMy Zipcode is  " +
		myZipcode + " I went to CCNY and My major is " + major +"." + "My cumulative GPA is "+myGpa +" . and My graduation status is  " + myGraduationStatus);
	}
}
