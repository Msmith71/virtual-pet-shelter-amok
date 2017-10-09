package petsamok;

public class Dog extends Organic implements OrganicPet, DogPet{

	int cageMess;
	public Dog(String petName, String petDescription, int petHealth, int petMood, int petHunger, int petThirst,
			int petAge) {
		super(petName, petDescription, petHealth, petMood, petHunger, petThirst, petAge);
		age = 0;
		hunger = 120;
		thirst = 110;
		health = 140;
		mood = 100;
	}
	
	public int getCageMess() {
		return cageMess;
	}
	
	public void cleanCage() {
		cageMess = 0;
		mood += 5;
	}
	
	@Override
	public void walk() {
		mood += 30;
		health += 5;
		hunger -= 5;
		thirst -= 5;
	}

	@Override
	public void feed() {
		hunger += 20;
		thirst -= 5;
	}

	@Override
	public void feedGood() {
		hunger +=  35;
		thirst -= 2;
	}

	@Override
	public void water() {
		thirst += 20;
		hunger -= 5;
	}

	@Override
	public void waterGood() {
		thirst += 40;
		hunger -= 3;
	}

	@Override
	public int getHunger() {
		return hunger;
	}

	@Override
	public int getThirst() {
		return thirst;
	}
	
	@Override
	public int getAge() {
		return age;
	}
	
	@Override
	public void heal() {
		health +=100;
	}

	@Override
	public void tick() {
		hunger -= 5;
		thirst -= 6;
		age += 1;
		mood -= 5;
	}





	
}
