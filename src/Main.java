
public class Main {

	public static void main(String[] args) {

		Hero hero = new Hero();
		hero.name = "マサ";
		hero.hp = 100;

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';

		hero.slip();
		m1.run();
		m2.run();
		hero.run();

	}

}
