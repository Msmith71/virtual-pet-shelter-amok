package petsamok;

public class Cat extends Organic implements OrganicPet{

	public Cat(String petName, String petDescription, int petHealth, int petMood, int petHunger, int petThirst,
			int petAge) {
		super(petName, petDescription, petHealth, petMood, petHunger, petThirst, petAge);
		age = 0;
		hunger = 100;
		thirst = 100;
		health = 100;
		mood = 100;
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
