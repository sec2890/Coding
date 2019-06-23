package ZooKeeperTwo;

public class Mammal {
	int energyLevel = 300;
	
	public int displayEnergy() {
		System.out.println("Current Energy Level: " + energyLevel);
		return energyLevel;
	}
}