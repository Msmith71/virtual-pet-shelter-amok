package petsamok;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class VirtualPetTest {
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	
	public void shouldMakeOrganic() {
		
		Organic underTest = new Organic(null, null, 0, 0, 0, 0, 0);
		
		assertNotNull(underTest);
	}
	
	@Test
	
	public void shouldMakeRobot() {
		
		Robot underTest = new Robot(null, null, 0, 0, 0, 0, 0);
		
		assertNotNull(underTest);
	}
	
	@Test
	
	public void shouldMakeCat() {
		
		Cat underTest = new Cat(null, null, 0, 0, 0, 0, 0);
		
		assertNotNull(underTest);
	}
	
	@Test
	
	public void shouldMakeDog() {
		
		Dog underTest = new Dog(null, null, 0, 0, 0, 0, 0);
		
		assertNotNull(underTest);
	}
	
	@Test
	
	public void shouldMakeRobotDog() {
		
		DogRobot underTest = new DogRobot(null, null, 0, 0, 0, 0, 0);
		
		assertNotNull(underTest);
	}
	
	@Test
	
	public void shouldMakeRobotCat() {
		
		CatRobot underTest = new CatRobot(null, null, 0, 0, 0, 0, 0);
		
		assertNotNull(underTest);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	
	public void RobotShouldBeAVirtualPet() {

		VirtualPet underTest = new Robot(null, null, 0, 0, 0, 0, 0);

		assertNotNull(underTest);
	}
	
	@Test
	
	public void OrganicShouldBeAVirtualPet() {

		VirtualPet underTest = new Organic(null, null, 0, 0, 0, 0, 0);

		assertNotNull(underTest);
	}
	
	@Test
	
	public void CatShouldbeAnOrganic() {

		Organic underTest = new Cat(null, null, 0, 0, 0, 0, 0);

		assertNotNull(underTest);
	}

	@Test
	
	public void DogShouldbeAnOrganic() {

		Organic underTest = new Dog(null, null, 0, 0, 0, 0, 0);

		assertNotNull(underTest);
	}
	
	@Test
	
	public void RobotCatShouldbeARobot() {

		Robot underTest = new CatRobot(null, null, 0, 0, 0, 0, 0);

		assertNotNull(underTest);
	}
	
	@Test
	
	public void RobotDogShouldbeARobot() {

		Robot underTest = new DogRobot(null, null, 0, 0, 0, 0, 0);

		assertNotNull(underTest);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////


	


}
