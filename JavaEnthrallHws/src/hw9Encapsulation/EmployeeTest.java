package hw9Encapsulation;

public class EmployeeTest {

public static void main(String[] args) {
	Employee employee1 = new Employee();
	employee1.setName("Farah Sultana");
	employee1.setAge(23);
	employee1.setSex('F');
	employee1.setUsCitizen(false);
	
	System.out.println("The employee information is given below:\nName:" + employee1.getName() + "\nAge: "
			+ employee1.getAge() + "\nSex: " + employee1.getSex() + "\nUS Citizen: " + employee1.isUsCitizen());
}

}
