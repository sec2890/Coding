package ObjectMasterTwo;

public class Wizard extends Human {
	
	//The Constructor
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	public Wizard(String name) {
		this.health = 50;
		this.intelligence = 8;
		this.name = name;
	}

	//The Methods
	public void heal(Human human) {
		human.setHealth(human.getHealth()+intelligence);
		System.out.println("Allow my heals to bring you aid!");
		System.out.println("(" + human.getName() + " had their health increased by " + this.intelligence + ".)");
	}
	public void fireball(Human human) {
		human.setHealth(human.getHealth()-(intelligence*3));
		System.out.println("Feel the heat of Hell!");
		System.out.println("(" + human.getName() + " has taken " + intelligence*3 + " points of damage!)");
	}
}