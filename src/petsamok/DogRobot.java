package petsamok;

public class DogRobot extends Robot implements RobotPet, DogPet{


	
	public DogRobot(String petName, String petDescription, int petHealth, int petMood, int petPower, int petOil, int petMaint) {
		super(petName, petDescription, petHealth, petMood, petPower, petOil, petMaint);
		power = 100;
		oil = 120;
		maint = 120;
		health = 150;
		mood = 100;
	}

	@Override
	public void walk() {
		mood += 30;
		health += 5;
	}

	@Override
	public void oilPetCrude() {
		oil += 25;
	}

	@Override
	public void oilPetRefined() {
		oil += 50;
	}

	@Override
	public void maintPet() {
		maint += 25;
	}

	@Override
	public void maintPetSuper() {
		maint += 50;
	}

	@Override
	public int getOilLevel() {
		return oil;
	}

	@Override
	public int getMaintLevel() {
		return maint;
	}

	@Override
	public void repair() {
		health += 100;
	}

	@Override
	public void tick() {
		oil -= 5;
		maint -= 5;
		mood -= 5;
		power -= .5;
	}

	@Override
	public int getPowerLevel() {
		return power;
	}



}
