package petsamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;




public class VirtualPetShelter {
	
	int catLitterBox = 0;

	Map<String, VirtualPet> petShelter = new HashMap<String, VirtualPet>(); 

	public Collection<VirtualPet> pets(){
		return petShelter.values();
	}

	public VirtualPet getPet(String name){
		return petShelter.get(name);
	}
	
	//Litterbox
	public int getLitterBox() {
		return catLitterBox;
	}

	public void cleanLitterBox() {
		catLitterBox = 0;
	}

	// robot maint / oil
	public void oilAllRobotCrude() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof RobotPet) {
				((RobotPet) pet).oilPetCrude();
			}
		}
	}
	
	public void oilAllRobotRefined() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof RobotPet) {
				((RobotPet) pet).oilPetRefined();
			}
		}
	}
	
	public void maintAllRobot() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof RobotPet) {
				((RobotPet) pet).maintPet();
			}
		}
	}
	public void maintAllRobotSuper() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof RobotPet) {
				((RobotPet) pet).maintPetSuper();
			}
		}
	}
	
	// organic feed / water
	
	public void feedAllOrganic() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feed();
			}
		}
	}
	
	public void feedAllOrganicGood() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feedGood();
			}
		}
	}
	
	public void waterAllOrganic() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).water();
			}
		}
	}
	
	public void waterAllOrganicGood() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).waterGood();
			}
		}
	}
	
	// heal pets
	public void healPet(String name) {
		getPet(name).heal();
	}
	
	
	// dogs
	public void walkDogs() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof Dog) {
				((Dog) pet).walk();
			}
		}

	}
	
	public void cleanDogCages() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof Dog) {
				((Dog) pet).cleanCage();
			}
		}
	}

	// Add new dog
	public void newPetDog(Dog pet){
		petShelter.put(pet.name, pet);
	}
	
	// Add new cat
	public void newPetCat(Cat pet){
		petShelter.put(pet.name, pet);
	}
	
	// Add new robot dog
	public void newPetDogRobot(DogRobot pet){
		petShelter.put(pet.name, pet);
	}
	
	// Add new robot cat
	public void newPetCatRobot(CatRobot pet){
		petShelter.put(pet.name, pet);
	}
	
	// pet Adoption
	public void adoptPet(VirtualPet pet){
		petShelter.remove(pet.getName());
	}

	// play
	public void playWith(String name){
		getPet(name).play();
	}
	
	// dead
	public void petDeath(VirtualPet pet){
		petShelter.remove(pet.getName());
	}

	// Update all pets stats
	void allTick() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPet) {
					((OrganicPet) pet).tick();
				}
			if (!(pet instanceof OrganicPet)) 
				((RobotPet) pet).tick();

			catLitterBox ++;
			}
		}

	
	public String toString() {
		return ("" + petShelter.keySet() + petShelter.values()); 
	}

	public int size() {
		return petShelter.size();
	}


}