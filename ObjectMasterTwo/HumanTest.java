package ObjectMasterTwo;

public class HumanTest {

	public static void main(String[] args) {
		Human testHuman1 = new Human("Ziz");
		Human testHuman2 = new Human("Mathil");
		Human testHuman3 = new Human("Ziggy");
		Samurai testSamurai1 = new Samurai("Shen");
		Samurai testSamurai2 = new Samurai("Lee Sin");
		Samurai testSamurai3 = new Samurai("Jax");
		Ninja testNinja1 = new Ninja("Genji");
		Ninja testNinja2 = new Ninja("Yi");
		Ninja testNinja3 = new Ninja("Xin");
		Wizard testWizard1 = new Wizard("Lux");
		Wizard testWizard2 = new Wizard("LeBlanc");
		Wizard testWizard3 = new Wizard("Karthus");
			
		
		testHuman2.attack(testSamurai2);
		testWizard1.fireball(testNinja3);
		testNinja1.steal(testHuman1);
		testSamurai2.attack(testHuman3);
		testWizard2.heal(testNinja2);
		testWizard3.fireball(testNinja3);
		testSamurai2.deathBlow(testNinja2);
		testSamurai3.meditate();
		testNinja2.runAway();
		testSamurai1.howMany();		
	}
}