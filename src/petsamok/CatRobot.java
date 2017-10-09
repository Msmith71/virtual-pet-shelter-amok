package petsamok;

public class CatRobot extends Robot implements RobotPet{



	public CatRobot(String petName, String petDescription, int petHealth, int petMood, int petPower, int petOil, int petMaint) {
		super(petName, petDescription, petHealth, petMood, petPower, petOil, petMaint);
		power = 100;
		oil = 100;
		maint = 100;
		health = 100;
		mood = 100;
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
		health += 50;
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
