package pokemon;

import java.util.Scanner;

public class UseClass {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int count = 0;
		Trainer t1 = new Trainer();
		System.out.println("名前を入力してください");
		Scanner stdIn = new Scanner(System.in);
		String name = stdIn.next();
		while (count < 9999) {
			System.out.println("名前は" + name + "。");
			System.out.println("メニューを選択");
			System.out.println("1・・・捕獲");
			System.out.println("2・・・図鑑を見る。");
			System.out.println("3・・・バトル");
			System.out.println("99・・プログラム終了");
			int menu = stdIn.nextInt();
			if (menu == 1) {
				System.out.println("ポケトンの名前入力");
				String pockname = stdIn.next();
				System.out.println("タイプ（火、水、地面、草）を入力してください");
				String type = stdIn.next();
				System.out.println("戦闘力を入力してください");
				int power = stdIn.nextInt();
				System.out.println("捕獲難易度を入力");
				int difficult = stdIn.nextInt();
				Pocketon poke = new Pocketon(pockname, type, power, difficult);
				t1.capture(poke);
				t1.display();
			} else if (menu == 2) {
				t1.display();
			} else if (menu == 3) {
				System.out.println("一体目のポケモンの名前入力");
				String poke1 = stdIn.next();
				System.out.println("二体目のポケモンの名前入力");
				String poke2 = stdIn.next();
				int box1 = 0;
				int box2 = 0;
				for (int i = 0; i < t1.myPokes.length; i++) {
					if (t1.myPokes[i] != null) {
						if (poke1.equals(t1.myPokes[i].name)) {
							box1 = i;
						} else if (poke2.equals(t1.myPokes[i].name)) {
							box2 = i;
						}
					}
				}
				Battle vs = new Battle();
				String z = vs.doBattle(t1.myPokes[box1], t1.myPokes[box2]);
				System.out.println("バトルの結果は・・・" + z + "です");
			} else if (menu == 99) {
				count = count + 10000;
			} else {
				System.out.println("メニューにない数字を検出したため終了します");
				count = count + 100000;
			}
		}
		System.out.println("終了しました");
	}
}