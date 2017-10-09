package petsamok;

public class Organic extends VirtualPet {
	
	int hunger;
	int thirst;
	int age;

	public Organic(String petName, String petDescription, int petHealth, int petMood, int petHunger, int petThirst, int petAge) {
		super(petName, petDescription, petHealth, petMood);
		hunger = petHunger;
		thirst = petThirst;
		age = petAge;
	}

}
