package pokemon;

import java.util.Random;

public class Trainer {
	String name;
	Pocketon[] myPokes;

	Trainer() {
		name = "";
		myPokes = new Pocketon[6];
	}

	
	void capture(Pocketon poke) {
		Random rand = new Random();
		int a = rand.nextInt(10) + 1;
		if (poke.difficult < a) {
			System.out.println("捕獲成功");
			for (int i = 0; i < 6; i++) {
				if (myPokes[i] == null) {
					myPokes[i] = poke;
					i = i + 10;
				} else if (poke.difficult >= a) {
					System.out.println("捕獲失敗");
				}
			}
		}
	}

	void display() {
		System.out.println("現在の手持ち");
		for (int i = 0; i < 6; i++) {
			if (myPokes[i] == null) {
				System.out.println("ポケトンなし");
			} else {
				System.out.println(myPokes[i].name);
			}
		}
	}
}
