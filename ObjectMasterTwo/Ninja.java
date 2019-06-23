package ObjectMasterTwo;

public class Ninja extends Human {

	//The Constructor
	public Ninja() {
		this.stealth = 10;
	}
	public Ninja(String name) {
		this.stealth = 10;
		this.name = name;
	}
	
	// The Methods
	public void steal(Human human) {
		human.setHealth(human.getHealth()-stealth);
		this.setHealth(this.getHealth()+stealth);
		System.out.println("Yoink!");
		System.out.println("(" + human.getName() + " was caught off guard " + stealth + " points of damage!)");
	}
	public void runAway() {
		this.setHealth(-10);
	}
}