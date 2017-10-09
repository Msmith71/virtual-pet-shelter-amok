package petsamok;

abstract class VirtualPet {

	  String name;
	  String description;
	  int health;
	  int mood;
	  
	public VirtualPet(String petName, String petDescription) {
			name = petName;
			description = petDescription;
			health = 100;
			mood = 50;
		}
	
	// pet
	public VirtualPet(String petName, String petDescription, int petHealth, int petMood) {
		name = petName;
		description = petDescription;
		health = petHealth;
		mood = petMood;
	}
	
		public void petUpdate() {
		mood -= 5;
	}
	
	//pet name
		public String getName() {
			return name;
		}
		
		//pet hunger | feed
		public int getHealth() {
			return health;
		}

		// pet mood | play
		public int getMood() {
			return mood;
		}
		public void play() {
			mood += 50;
		}
		
		// pet heal
		public void heal() {
			health += 70;
		}
		
		// health decay
		public void healthDecayMinor() {
			health -= 15;
		}
		
		public void healthDecayMajor() {
			health -= 45;
		}
		
		// low health
		public void petLowHealth() {
			mood -= 10;
		}
		
		public String toString() {
			return (name + " " + description); 
		}

		public void petDeath(VirtualPet pet) {
			
		}
	
	
	
}