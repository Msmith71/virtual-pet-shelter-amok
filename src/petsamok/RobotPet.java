package petsamok;

public interface RobotPet {
	 void oilPetCrude();
	 void oilPetRefined();
	 void maintPet();
	 void maintPetSuper();
	 int getOilLevel();
	 int getMaintLevel();
	 int getPowerLevel();
	 void repair();
	 void tick();
}
