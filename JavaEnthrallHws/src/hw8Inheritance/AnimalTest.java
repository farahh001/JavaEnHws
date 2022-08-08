package hw8Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		// Animal->Mammal->Dog->BullDog (Multilevel Inheritence)
		//we can notice hierarchical within Mammal, Reptile and Birds 
				BullDog bullDog = new BullDog();
				bullDog.bullDogInfo();
				bullDog.dogInfo();
				bullDog.mammalInfo();
				bullDog.animalInfo();
				Dog dog = new Dog();
				dog.dogInfo();
				dog.mammalInfo();
				dog.animalInfo();
				
		//Animal->Reptile->Snake->Cobra	(Multilevel Inheritence)
				Cobra cobra = new Cobra();
				cobra.cobraInfo();
				cobra.reptileInfo();
				cobra.animalInfo();
				Snake snake = new Snake();
				snake.snakeInfo();
				snake.reptileInfo(); //Reptile is the parent of Snake class
				snake.animalInfo(); //Animal is the parent of Reptile class
				Robin robin= new Robin();
				robin.robinInfo();
				robin.birdsInfo();
				robin.animalInfo();
				
		//Single Inheritence 
				Animal animal = new Animal();//Parent class
				animal.animalInfo();
			
				Mammal mammal = new Mammal();//child class inherited Animal properties
				mammal.mammalInfo();
				mammal.animalInfo();
				
				Reptile reptile = new Reptile();
				reptile.reptileInfo();
				reptile.animalInfo();
				Birds birds = new Birds();
				birds.birdsInfo();
				birds.animalInfo();
				
	}
}
