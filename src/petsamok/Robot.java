package petsamok;

public class Robot extends VirtualPet {
	
	int oil;
	int maint;
	int power;

	public Robot(String petName, String petDescription, int petHealth, int petMood, int petPower, int petOil, int petMaint) {
		super(petName, petDescription, petHealth, petMood);
		power = petPower;
		oil = petOil;
		maint = petMaint;
	}

}
