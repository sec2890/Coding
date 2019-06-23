package ZooKeeperTwo;

public class Bat extends Mammal {
	
	public Bat() {
	this.energyLevel = 300;
	displayEnergy();
	}
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("Swish!!!!!");
		displayEnergy();
	}
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("NAM NAM NAM NAM, Ate a Human and gains energy.");
		displayEnergy();
	}
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("REEEEE!!!!");
		displayEnergy();
	}
}