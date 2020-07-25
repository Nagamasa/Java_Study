import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;

	void selfeid() {
		this.mp -= 5;
		this.hp = MAXHP;
	}

	public int pray(int sec) {
		int recorver = new Random().nextInt(3) + sec;

		int recoverActual = Math.min(this.MAXHP - this.mp, recorver);

		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");

		return recoverActual;
	}
}
