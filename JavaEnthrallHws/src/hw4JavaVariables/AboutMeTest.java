package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		
		//My constructor is initialized
		AboutMe infos = new AboutMe(); 
		
		//variable initialization for me
		String myName = "Farah Sultana";
		byte myLuckyNumber = 21;
	    float myWeight = 125.25f;
	    float  myHeight = 168.34f;
	    int myZipcode =11421;
	    String major = "Computer Science";
	    double myGpa = 4.73;
	    short myTution = 4289;
	    boolean myGraduationStatus = true;
	    long mySalary=5366623;
	    
		//variable initialization for my Friend
		String myFriendsName = "Sadia Supti";
		byte herLuckyNumber = 22;
	    float herWeight = 135.25f;
	    float  herHeight = 158.34f;
	    int herZipcode =11421;
	    String herMajor = "Civil Engineering";
	    double herGpa = 4.0;
	    short herTution = 4222;
	    boolean herGraduationStatus = true;
	    long herSalary=5366623;
	    

	    

		
		infos.aboutMe(myName, myLuckyNumber,  myWeight, myHeight, mySalary);
		System.out.println();
		infos.aboutMe(myFriendsName, herLuckyNumber, herWeight, herZipcode,herSalary);
	}

}
