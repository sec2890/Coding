package ObjectMasterOne;

public class HumanTest {

	public static void main(String[] args) {
			Human ninja0 = new Human("Genji");
			Human samurai0 = new Human("Shen");
			Human wizard0 = new Human("Lux");
			
			wizard0.attack(ninja0);
			samurai0.attack(ninja0);
			ninja0.attack(samurai0);
	}
}
