package course35;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("値を入力して");
		int x = stdIn.nextInt();

		if (x >= 50) {

			int y = stdIn.nextInt();
			calc(x, y);
		} else {
			calc(x);
		}
	}

	static void calc(int a, int b) {
		System.out.println("受け取った値は" + a + b + "です");
	}

	static void calc(int c) {
		System.out.println("受け取った値は" + c * 10 + "です");

	}
}
