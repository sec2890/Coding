package ZooKeeperOne;

public class Gorilla extends Mammal {

	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("Gorilla threw something!");
		displayEnergy();
	}
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("Gorilla eats bananas and instantly gets healed.");
		displayEnergy();
	}
	public void climb() {
		energyLevel -= 10;
		System.out.println("Gorilla climbs something nearby, though, energy becomes slightly reduced.");
		displayEnergy();
	}
}

