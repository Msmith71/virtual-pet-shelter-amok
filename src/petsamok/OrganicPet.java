package petsamok;

public interface OrganicPet {

	String getName();
	void feed();
	void feedGood();
	void water();
	void waterGood();
	int getHunger();
	int getThirst();
	int getAge();
	void heal();
	void tick();
}
