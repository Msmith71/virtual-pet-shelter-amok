package petsamok;

import java.util.Random;
import java.util.Scanner;


public class VirtualPetShelterApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		VirtualPetShelter shelter = new VirtualPetShelter();

		// random starting Organic Dog names | description | stats
		String rndOrgDogNames [] = {"Penny", "Beezle", "Jaeger", "Billy", "Scotty", "Selene", "Mitth", "Buddy", "Tiber","Jim", "Kelly", "Jade", "Amber", "Rick", "Gordon"}; 
		String rndOrgDogDesc [] = {"is distracted by a bee.", "looks like they're having a great time!", "is feeling lazy today.", "is excited today.", "wants a new toy.", "looks a little down.", "looks happy to see you.", "is rolling around in the dirt.", "is chewing on toy.", "is giving you a puzzled look.", "is licking themself.", "looks agitated and scared.", "is fighting with another pet."}; 
		int rndOrgDogStat [] = {21,45,25,73,67,88,71,49,42,37,10,100,1,20,57,94,60,50,40,30,17,9};
		
		// random starting Organic Cat names | description | stats
		String rndOrgCatNames [] = {"Penny", "Beezle", "Jaeger", "Billy", "Scotty", "Selene", "Mitth", "Buddy", "Tiber","Jim", "Kelly", "Jade", "Amber", "Mordi", "Gordon"}; 
		String rndOrgCatDesc [] = {"is distracted by a bee.", "looks like they're having a great time!", "is feeling lazy today.", "is excited today.", "wants a new toy.", "looks a little down.", "looks happy to see you.", "is rolling around in the dirt.", "is chewing on toy.", "is giving you a puzzled look.", "is licking themself.", "looks agitated and scared.", "is fighting with another pet."}; 
		int rndOrgCatStat [] = {100,33,14,56,77,32,12,31,33,44,55,66,77,88,12,20,8};
		
		// random starting Robot Dog names | description | stats
		String rndRoboDogNames [] = {"TK421", "D0G", "A.r.c.h.", "Bender", "Woofer_71", "Mr.Bones", "BT-1", "0-0-0", "PAW-100","K9-S0", "K9-3000", "BRK-100"}; 
		String rndRoboDogDesc [] = {"seems to have leaked some oil.", "is trying to integrate with a computer.", "Excited: 'Bark, bark'", "left eye is twitching, must be a malfunction", "Stands at attention.", "is chewing on a metal bone.", "is making metal skid marks on the floor.", "is scanning you for treats."}; 
		int rndRoboDogStat [] = {10,20,30,40,50,60,70,80,90,100,110};
		
		// random starting Robot Cat names | description | stats
		String rndRoboCatNames [] = {"P.R.R.", "Fb-9000", "C4T", "Noodle", "T-800", "Bishop", "G.A.T.O.", "Gris", "Sidhe","Fluffy-9000"}; 
		String rndRoboCatDesc [] = {"is distracted by a robot mouse.", "is like oil from a bowl!", "is in hybernation mode.", "is in hunt mode.", "Assertion: Meow.", "Exclamation: Meow!", "is Purring Mechanically", "is rolling around in the dirt.", "is trying to blend in with the organic cats", "is giving you a puzzled look.", "is scanning for mice int the area."}; 
		int rndRoboCatStat [] = {8,16,24,32,40,48,56,64,72,80,88,96,100};
		
		
		// starting account balance
		double balance = 1000;
		
		// starting food | water 
		int petFeed = 20;
		int goodPetFeed = 10;
		
		int petWater = 20;
		int freshPetWater = 10;
		
		
		// starting oil | maint kit 
		int petOilCrude = 20;
		int petOilRefined = 5;
		
		int petMaintKit = 20;
		int petSuperMaintKit = 5;
		
		int petMedOrRepairKit = 5;

		
		// Initial pets 4-8
		Dog pet1 = new Dog(rndOrgDogNames[new Random().nextInt(rndOrgDogNames.length)], rndOrgDogDesc[new Random().nextInt(rndOrgDogDesc.length)], rndOrgDogStat[new Random().nextInt(rndOrgDogStat.length)], rndOrgDogStat[new Random().nextInt(rndOrgDogStat.length)], rndOrgDogStat[new Random().nextInt(rndOrgDogStat.length)], rndOrgDogStat[new Random().nextInt(rndOrgDogStat.length)], 0);
		shelter.newPetDog(pet1);

		Dog pet2 = new Dog(rndOrgDogNames[new Random().nextInt(rndOrgDogNames.length)], rndOrgDogDesc[new Random().nextInt(rndOrgDogDesc.length)], rndOrgDogStat[new Random().nextInt(rndOrgDogStat.length)], rndOrgDogStat[new Random().nextInt(rndOrgDogStat.length)], rndOrgDogStat[new Random().nextInt(rndOrgDogStat.length)], rndOrgDogStat[new Random().nextInt(rndOrgDogStat.length)], 0);
		shelter.newPetDog(pet2);
		
		Cat pet3 = new Cat(rndOrgCatNames[new Random().nextInt(rndOrgCatNames.length)], rndOrgCatDesc[new Random().nextInt(rndOrgCatDesc.length)], rndOrgCatStat[new Random().nextInt(rndOrgCatStat.length)], rndOrgCatStat[new Random().nextInt(rndOrgCatStat.length)], rndOrgCatStat[new Random().nextInt(rndOrgCatStat.length)], rndOrgCatStat[new Random().nextInt(rndOrgCatStat.length)], rndOrgCatStat[new Random().nextInt(rndOrgCatStat.length)]);
		shelter.newPetCat(pet3);

		Cat pet4 = new Cat(rndOrgCatNames[new Random().nextInt(rndOrgCatNames.length)], rndOrgCatDesc[new Random().nextInt(rndOrgCatDesc.length)], rndOrgCatStat[new Random().nextInt(rndOrgCatStat.length)], rndOrgCatStat[new Random().nextInt(rndOrgCatStat.length)], rndOrgCatStat[new Random().nextInt(rndOrgCatStat.length)], rndOrgCatStat[new Random().nextInt(rndOrgCatStat.length)], rndOrgCatStat[new Random().nextInt(rndOrgCatStat.length)]);
		shelter.newPetCat(pet4);
		
		DogRobot pet5 = new DogRobot(rndRoboDogNames[new Random().nextInt(rndRoboDogNames.length)], rndRoboDogDesc[new Random().nextInt(rndRoboDogDesc.length)],  rndRoboDogStat[new Random().nextInt(rndRoboDogStat.length)], rndRoboDogStat[new Random().nextInt(rndRoboDogStat.length)], rndRoboDogStat[new Random().nextInt(rndRoboDogStat.length)], rndRoboDogStat[new Random().nextInt(rndRoboDogStat.length)], 100);
		shelter.newPetDogRobot(pet5);

		DogRobot pet6 = new DogRobot(rndRoboDogNames[new Random().nextInt(rndRoboDogNames.length)], rndRoboDogDesc[new Random().nextInt(rndRoboDogDesc.length)],  rndRoboDogStat[new Random().nextInt(rndRoboDogStat.length)], rndRoboDogStat[new Random().nextInt(rndRoboDogStat.length)], rndRoboDogStat[new Random().nextInt(rndRoboDogStat.length)], rndRoboDogStat[new Random().nextInt(rndRoboDogStat.length)], 100);
		shelter.newPetDogRobot(pet6);
		
		CatRobot pet7 = new CatRobot(rndRoboCatNames[new Random().nextInt(rndRoboCatNames.length)], rndRoboCatDesc[new Random().nextInt(rndRoboCatDesc.length)], rndRoboCatStat[new Random().nextInt(rndRoboCatStat.length)], rndRoboCatStat[new Random().nextInt(rndRoboCatStat.length)], rndRoboCatStat[new Random().nextInt(rndRoboCatStat.length)], rndRoboCatStat[new Random().nextInt(rndRoboCatStat.length)], 100);	
		shelter.newPetCatRobot(pet7);
		
		CatRobot pet8 = new CatRobot(rndRoboCatNames[new Random().nextInt(rndRoboCatNames.length)], rndRoboCatDesc[new Random().nextInt(rndRoboCatDesc.length)], rndRoboCatStat[new Random().nextInt(rndRoboCatStat.length)], rndRoboCatStat[new Random().nextInt(rndRoboCatStat.length)], rndRoboCatStat[new Random().nextInt(rndRoboCatStat.length)], rndRoboCatStat[new Random().nextInt(rndRoboCatStat.length)], 100);	
		shelter.newPetCatRobot(pet8);
	
		boolean end = false;
		
		System.out.println("\nWelcome to the Pet Emporium: Shelter and Care Centre! Thank you helping out today!");
		

		
		do {
			
			// Weekly payment for working
			  int day = 0;
			  day ++;
			  if (day % 7 == 0) {
				  balance += 600;
			  }

			//low supplies warnings
			if (petOilCrude <= 5) {
				System.out.println("You are running low on Crude Oil. Perhaps you should buy some more?");
			}
			
			if (petOilRefined <= 3) {
				System.out.println("You are running low on Refined Oil. Perhaps you should buy some more?");
			}
			
			if (petMaintKit <= 5) {
				System.out.println("You are running low on Maintenance Kits. Perhaps you should buy some more?");
			}

			if (petSuperMaintKit <= 3) {
				System.out.println("You are running low on Super Maintenace Kits. Perhaps you should buy some more?");
			}

			if (petFeed <= 5) {
				System.out.println("You are running low on Pet Feed. Perhaps you should buy some more?");
			}
			
			if (goodPetFeed <= 3) {
				System.out.println("You are running low on Good Pet Feed. Perhaps you should buy some more?");
			}
			
			if (petWater <= 5) {
				System.out.println("You are running low on Water. Perhaps you should buy some more?");
			}
			
			if (freshPetWater <= 3) {
				System.out.println("You are running low on Fresh Water. Perhaps you should buy some more?");
			}
			
			if (petMedOrRepairKit <= 3) {
				System.out.println("You are running low on Medical/Repair Kits. Perhaps you should buy some more?");
			}
		
			
			//litterbox dirty
			if (shelter.getLitterBox() >= 100) {
				System.out.println("The Cat litterbox is pretty full. You should probably clean it so that the organic cats have a clean environment to live in.");
				for (VirtualPet pet : shelter.pets()) {
					if (pet instanceof Cat) {
						((Cat) pet).healthDecayMinor();
					}
				}
			}
			
//			// robot natural death *work on later
//			for (VirtualPet pet : shelter.pets()) {
//				if (pet instanceof RobotPet) {
//					if (((RobotPet) pet).getPowerLevel() <= 0) {
//						System.out.println(pet.getName() + "'s power has run out and is being moved for decomissioning.");
//						String deadPet = pet.getName();
//						VirtualPet dead = shelter.getPet(deadPet);
//						shelter.petDeath(dead);
//					}
//				}
//			}
			
//			// organic natural death *work on later
//			for (VirtualPet pet : shelter.pets()) {
//				if (pet instanceof OrganicPet) {
//					if (((OrganicPet) pet).getAge() >= 40) {
//						((VirtualPet) pet).petDeath(pet);
//						System.out.println(pet.getName() + " has passed due to age. We will provide them with a proper burial.");
//					}
//				}
//			}
			
			// pet neglect death
			for (VirtualPet pet : shelter.pets()) {
				if (pet instanceof VirtualPet) {
					if (((VirtualPet) pet).getHealth() <= 0) {
						System.out.println(pet.getName() + " has died due to lack of care. You are a terrible caretaker and hereby fired.");
						System.exit(0);
					}
				}
				}
			
			// low oil
			for (VirtualPet pet : shelter.pets()) {
				if (pet instanceof RobotPet) {
					if (((RobotPet) pet).getOilLevel() <= 10) {
						System.out.println(pet.getName() + "'s oil levels are running low. If you don't fuel them up they'll have to be decomissioned.");
						 pet.healthDecayMajor();
					}
				}
			}
			
			// low maint
			for (VirtualPet pet : shelter.pets()) {
				if (pet instanceof RobotPet) {
					if (((RobotPet) pet).getOilLevel() <= 10) {
						System.out.println(pet.getName() + "'s looks in bad shape. They probably need some maintenance or they'll have to be decomissioned.");
						 pet.healthDecayMajor();
					}
				}
			}
			
			// low food
			for (VirtualPet pet : shelter.pets()) {
				if (pet instanceof OrganicPet) {
					if (((OrganicPet) pet).getHunger() <= 10) {
						System.out.println(pet.getName() + " is starving you need to feed them soon or they'll die.");
						 pet.healthDecayMajor();
					}
				}
			}

			// low water
			for (VirtualPet pet : shelter.pets()) {
				if (pet instanceof OrganicPet) {
					if (((OrganicPet) pet).getThirst() <= 10) {
						System.out.println(pet.getName() + " is dehydrated and needs water soon or they'll die.");
						 pet.healthDecayMajor();
					}
				}
			}
			
			// low health
			for (VirtualPet pet : shelter.pets()) {
				if (pet instanceof VirtualPet) {
					if (((VirtualPet) pet).getHealth() <= 10) {
						System.out.println(pet.getName() + "'s current health is not looking good, and it's affected their mood.");
						 pet.petLowHealth();
					}
				}
			}
			
			
			System.out.println("\nCurrent status of all pets are: ");

			
			System.out.println("\nName\t|Mood\t|Health\t|Hunger\t|Thirst\t|Age\t|OilLvl\t|Maint\t|Power\t|CageMess");
			
			//display pets
			for (VirtualPet currentPet : shelter.pets()) {
				System.out.print(currentPet.getName() + "\t|" + ((VirtualPet) currentPet).getMood() + "\t|" + ((VirtualPet) currentPet).getHealth() + "\t|");
						
				if (currentPet instanceof OrganicPet) {
					System.out.print(((OrganicPet) currentPet).getHunger() + "\t|" + ((OrganicPet) currentPet).getThirst() + "\t|" + ((OrganicPet) currentPet).getAge() + "\t|N/A\t|N/A\t|N/A");
							
				} else if (currentPet instanceof RobotPet) {
					System.out.print("N/A\t|N/A\t|N/A\t|" + ((RobotPet) currentPet).getOilLevel() + "\t|" + ((RobotPet) currentPet).getMaintLevel() + "\t|" + ((RobotPet) currentPet).getPowerLevel());
				} else System.out.println("\tN/A\t|");
				if (currentPet instanceof Dog) {
					System.out.print("\t|" + ((Dog) currentPet).getCageMess());
				} else {
					System.out.print("\t|N/A");
				}
				System.out.print("\n");
			}	
			System.out.println("Litter box: " + shelter.getLitterBox());
			System.out.println();
			System.out.println("Current Balance: " + balance);
			System.out.println("Day: " + day);
			System.out.println();
			System.out.println("Current Supplies:");
			System.out.println("[]Feed: " + petFeed);
			System.out.println("[]Good Feed: " + goodPetFeed);
			System.out.println("[]Water: " + petWater);
			System.out.println("[]Fresh Water: " + freshPetWater);
			System.out.println("[]Crude Oil: " + petOilCrude);
			System.out.println("[]Refined Oil: " + petOilRefined);
			System.out.println("[]Maintenance Kit: " + petMaintKit);
			System.out.println("[]Super Maintenance Kit: " + petSuperMaintKit);
			System.out.println("[]Medical/Repair Kit: " + petMedOrRepairKit);

			System.out.println("\nWhat would you like to do next?");
			System.out.println("\n1. Feed all Organic pets \n2. Water all Organic pets \n3. Maintain all Robot pets \n4. Oil all Robot pets \n5. Heal a pet \n6. play with a pet \n7. Clean dog cages \n8. Clean litterbox \n9. Walk dogs \n10. Adopt a pet \n11. Add new pet \n12. Pet Store \n13. Do nothing \n14. Exit :(");
			String response = input.nextLine();
			switch (response) {
			
			// feed all organics
			case "1": 
				System.out.println("Which type of feed do you want to use");
				System.out.println("1. Regular feed");
				System.out.println("2. Good feed");
				int feedChoice = input.nextInt();

				if (petFeed >= shelter.size() && feedChoice == 1) {
		 			shelter.feedAllOrganic();
					System.out.println("All organic pets have been fed.");
					petFeed -= 3;
					}	
				if (goodPetFeed >= shelter.size() && feedChoice == 2) {
		 			shelter.feedAllOrganicGood();
					System.out.println("All organic pets have beed well fed.");
					goodPetFeed -= 1;
				}
				break;
				
			// water all organics
			case "2": 
				int	waterChoice = input.nextInt();
				if (petWater >= shelter.size() && waterChoice == 1) {
					shelter.waterAllOrganic();
					System.out.println("You have given water to all organic pets.");
					petWater -= 3;
					
					}	
				if (freshPetWater >= shelter.size() && waterChoice == 2) {
		 			shelter.waterAllOrganicGood();
					System.out.println("You have given fresh water to all organic pets.");
					freshPetWater -= 1;
					
				}
				break;

			// maint all robots
			case "3": 
					System.out.println("Which type of kit do you want to use");
					System.out.println("1. Maintenance kit");
					System.out.println("2. Super Maintenance kit");
					int maintChoice = input.nextInt();

					if (petFeed >= shelter.size() && maintChoice == 1) {
			 			shelter.maintAllRobot();
			 			petMaintKit -= 3;
						System.out.println("All robot pets have recieved their rutine maintenance.");
						}	
					if (goodPetFeed >= shelter.size() && maintChoice == 2) {
			 			shelter.maintAllRobotSuper();
						System.out.println("All robots pets have recieved enchanced rutine maintenance.");
						petSuperMaintKit -= 1;
					}
					break;
					
				// oil all robots
				case "4": 
					int	oilChoice = input.nextInt();
					if (petOilCrude >= shelter.size() && oilChoice == 1) {
						shelter.oilAllRobotCrude();
						System.out.println("You have refilled all robots fuel tanks.");
						petOilCrude -= 3;
						}	
					if (petOilRefined >= shelter.size() && oilChoice == 2) {
			 			shelter.oilAllRobotRefined();
						System.out.println("You have refilled all robots fuel tanks with refined oil.");
						petOilRefined -= 1;
					}
					break;
				
				
				
			// heal a pet
			case "5" :
				System.out.println("Which pet would you like to heal / repair?");
				System.out.println();
				showPets(shelter);
				String petHeal = input.nextLine();
				shelter.healPet(petHeal);
				System.out.println(petHeal + " is feeling better and ready to go!");
				petMedOrRepairKit -= 1;
				break;
				
				
			// play
			case "6": 
				System.out.println("Please enter the name of the pet you want to play with:");
				System.out.println();
				showPets(shelter);
				String petName = input.nextLine();
				shelter.playWith(petName);
				System.out.println("You play with " + petName + " for a time. They seem more happy.");
				break;
				
			// clean cages
			case "7":
				shelter.cleanDogCages();
				System.out.println("You clean all the organic dog cages!");
				break;
				
			// clean litter box
			case "8":
				shelter.cleanLitterBox();
				System.out.println("You cleaned the litterbox!");
				break;
				
			// walk dogs
			case "9":
				shelter.walkDogs();
				System.out.println("You walked all the dogs!");
				break;
			
			// adopt	
			case "10": 
				System.out.println("Which pet are you interested in adopting?");
				showPets(shelter);
				String petAdopt = input.nextLine();
				VirtualPet x = shelter.getPet(petAdopt);
				shelter.adoptPet(x);
				System.out.println("You've adopted " + petAdopt + ". Please take good care of them!");
				break;
				
			// bring in new pet
			case "11": 
				System.out.println("Is the new pet an Organic or a Robot?");
				String petType = input.next();
				if (petType.equalsIgnoreCase("organic")) {
					System.out.println("Is the organic pet a cat or a dog?");
					String petSpecies = input.next();
					input.nextLine();
					if (petSpecies.equalsIgnoreCase("dog")) {
						System.out.println("What is the name of the dog?");
						String name = input.nextLine();
						System.out.println("Enter a short description of the dog.");
						String description = input.nextLine();
						Dog nd = new Dog(name, description, rndOrgDogStat[new Random().nextInt(rndOrgDogStat.length)], rndOrgDogStat[new Random().nextInt(rndOrgDogStat.length)], rndOrgDogStat[new Random().nextInt(rndOrgDogStat.length)], rndOrgDogStat[new Random().nextInt(rndOrgDogStat.length)], 0);
						shelter.newPetDog(nd);
						System.out.println("We'll be sure to take good care of " + nd.getName()+".");
						
					} else if (petSpecies.equalsIgnoreCase("cat")) {
						System.out.println("What is the name of the cat?");
						String name = input.nextLine();
						System.out.println("Enter a short description of the cat.");
						String description = input.nextLine();
						Cat nd = new Cat(name, description, rndOrgCatStat[new Random().nextInt(rndOrgCatStat.length)], rndOrgCatStat[new Random().nextInt(rndOrgCatStat.length)], rndOrgCatStat[new Random().nextInt(rndOrgCatStat.length)], rndOrgCatStat[new Random().nextInt(rndOrgCatStat.length)], 0);
						shelter.newPetCat(nd);
						System.out.println("We'll be sure to take good care of " + nd.getName()+".");
						
					} else if (petType.equalsIgnoreCase("robotic")) {
						System.out.println("Is the robotic pet a cat or a dog?");
						String petSeries = input.next();
						input.nextLine();

						if (petSeries.equalsIgnoreCase("dog")) {
							System.out.println("What is the robot dog's name?");
							String name = input.nextLine();
							System.out.println("Enter a short description of the robot dog.");
							String description = input.nextLine();
							DogRobot nrd = new DogRobot(name, description, rndRoboDogStat[new Random().nextInt(rndRoboDogStat.length)], rndRoboDogStat[new Random().nextInt(rndRoboDogStat.length)], rndRoboDogStat[new Random().nextInt(rndRoboDogStat.length)], rndRoboDogStat[new Random().nextInt(rndRoboDogStat.length)], 100);
							shelter.newPetDogRobot(nrd);
							System.out.println("We'll be sure to take good care of " + nrd.getName()+".");

						} else if (petSeries.equalsIgnoreCase("cat")) {
							System.out.println("What is the robot cat's name?");
							String name = input.nextLine();
							System.out.println("Enter a short description of the robot cat?");
							String description = input.nextLine();
							CatRobot nrc = new CatRobot(name, description, rndRoboCatStat[new Random().nextInt(rndRoboCatStat.length)], rndRoboCatStat[new Random().nextInt(rndRoboCatStat.length)], rndRoboCatStat[new Random().nextInt(rndRoboCatStat.length)], rndRoboCatStat[new Random().nextInt(rndRoboCatStat.length)], 100);
							shelter.newPetCatRobot(nrc);
							System.out.println("We'll be sure to take good care of " + nrc.getName()+".");
						}
					}
				}
					
			// pet store
			case "12": 
				boolean inStore = true;
				while (inStore) {
				System.out.println("Welcome to the pet shelter shop what would you like to purchase?");
				System.out.println();
				System.out.println("Current Balance:" + balance);
				System.out.println();
				System.out.println("Current Supplies:");
				System.out.println("[]Feed: " + petFeed);
				System.out.println("[]Good Feed: " + goodPetFeed);
				System.out.println("[]Water: " + petWater);
				System.out.println("[]Fresh Water: " + freshPetWater);
				System.out.println("[]Crude Oil: " + petOilCrude);
				System.out.println("[]Refined Oil: " + petOilRefined);
				System.out.println("[]Maintenance Kit: " + petMaintKit);
				System.out.println("[]Super Maintenance Kit: " + petSuperMaintKit);
				System.out.println("[]Medical/Repair Kit: " + petMedOrRepairKit);
				System.out.println();
				System.out.println("1. 3x Feed: $50");
				System.out.println("2. Good Feed: $100");
				System.out.println("3. 3x Water: $60");
				System.out.println("4. Fresh Water: $120");
				System.out.println("5. 3x Maintenace Kit: $70");
				System.out.println("6. Super Maintenance Kit: $145");
				System.out.println("7. 3x Crude Oil: $60");
				System.out.println("8. Refined Oil: $150");
				System.out.println("9. Med / Repair Kit: $200");
				System.out.println("10. Leave store");
				String petStoreResponse = input.nextLine();
				switch (petStoreResponse) {
				case "1":
					if (balance >= 50) {
					petFeed += 3;
					balance -= 50;
					} else
					System.out.println("You don't have enought money for that.");
					break;
				case "2":
					if (balance >= 100) {
					goodPetFeed += 1;
					balance -= 100;
					} else
					System.out.println("You don't have enought money for that.");
					break;
				case "3":
					if (balance >= 60) {
					petWater += 3;
					balance -= 60;
					} else
					System.out.println("You don't have enought money for that.");
					break;
				case "4":
					if (balance >= 120) {
					freshPetWater += 1;
					balance -= 120;
					} else
					System.out.println("You don't have enought money for that."); 
					break;
				case "5":
					if (balance >= 70) {
					petMaintKit += 3;
					balance -= 70;
					} else
					System.out.println("You don't have enought money for that.");
					break;
				case "6":
					if (balance >= 145) {
					petSuperMaintKit += 1;
					balance -= 145;
					} else
					System.out.println("You don't have enought money for that.");
					break;
				case "7":
					if (balance >= 60) {
					petOilCrude += 3;
					balance -= 60;
					} else
					System.out.println("You don't have enought money for that.");
					break;
				case "8":
					if (balance >= 150) {
					petOilRefined += 1;
					balance -= 150;
					} else
					System.out.println("You don't have enought money for that.");
					break;
				case "9":
					if (balance >= 200) {
					petMedOrRepairKit += 1;
					balance -= 200;
					} else
					System.out.println("You don't have enought money for that.");
					break;
				case "10":
					inStore = false;
					System.out.println("Feel free to stop by anytime!");
					break;
				}
			}

			// do nothing
			case "13": 
				break;
				
			// quit
			case "14": 
				System.out.println("Be sure to stop by and volunteer again!");
				System.exit(0);
			
			default:
				System.out.println("Error: does not compute! Please try again!");
				break;
			}
			shelter.allTick();

		} while (!end);
		input.close();
	}

	private static void showPets(VirtualPetShelter shelter) {
		for (VirtualPet currentPet : shelter.pets()) {
			System.out.println(currentPet);
		}
	}
	
}
