package ZooKeeperOne;


public class Mammal {
	int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("Current Energy Level: " + energyLevel);
		return energyLevel;
	}
}
