package cource15;

import java.util.Random;
import java.util.Scanner;

public class pea1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		///	所持金
		int kane = 10000;
		while (kane > 0 && kane < 50000) {

			System.out.println("あなたの所持金は" + kane + "です");

			System.out.println("賭け金を入力してね");
			Scanner stdIn = new Scanner(System.in);

			///賭け金
			int kakekin = stdIn.nextInt();

			int e = kane - kakekin;

			///ダイス
			Random rnd = new Random();

			int a = rnd.nextInt(6) + 1;

			System.out.println(a);

			int b = rnd.nextInt(6) + 1;

			System.out.println(b);

			int c = rnd.nextInt(6) + 1;

			System.out.println(c);

			///ピンゾロ(5倍パターン)
			if (a == 1 && b == 1 && c == 1) {
				System.out.println("ピンゾロ");
				kane = kane + (kakekin * 5);

				System.out.println("あなたの所持金は" + kane + "です");

				//ゾロ目判定(3倍)///////
			} else if (a == 2 && b == 2 && c == 2) {
				System.out.println("ぞろ目");
				kane = kane + (kakekin * 3);
				System.out.println("あなたの今の所持金は" + kane + "です");
			} else if (a == 3 && b == 3 && c == 3) {
				System.out.println("ぞろ目");
				kane = kane + (kakekin * 3);
				System.out.println("あなたの今の所持金は" + kane + "です");
			} else if (a == 4 && b == 4 && c == 4) {
				System.out.println("ぞろ目");

				kane = kane + (kakekin * 3);
				System.out.println("あなたの今の所持金は" + kane + "です");
			} else if (a == 5 && b == 5 && c == 5) {
				System.out.println("ぞろ目");

				kane = kane + (kakekin * 3);
				System.out.println("あなたの今の所持金は" + kane + "です");
			} else if (a == 6 && b == 6 && c == 6) {
				System.out.println("ぞろ目");

				kane = kane + (kakekin * 3);

				System.out.println("あなたの今の所持金は" + kane + "です");
				//ピンゾロでもなくて、ゾロ目でもなくて456のパターン
			} else if (a == 4 && b == 5 && c == 6) {
				System.out.println("しごろ");
				kane = kane + (kakekin * 2);
				System.out.println("あなたの今の所持金は" + kane + "です");
			} else if (a == 5 && b == 6 && c == 4) {
				System.out.println("しごろ");
				kane = kane + (kakekin * 2);
				System.out.println("あなたの今の所持金は" + kane + "です");
			} else if (a == 6 && b == 4 && c == 5) {
				System.out.println("しごろ");
				kane = kane + (kakekin * 2);
				System.out.println("あなたの今の所持金は" + kane + "です");
			} else if (a == 6 && b == 5 && c == 4) {
				System.out.println("しごろ");
				kane = kane + (kakekin * 2);
				System.out.println("あなたの今の所持金は" + kane + "です");
			} else if (a == 5 && b == 4 && c == 6) {
				System.out.println("しごろ");
				kane = kane + (kakekin * 2);

				System.out.println("あなたの今の所持金は" + kane + "です");
			} else if (a == 4 && b == 6 && c == 5) {
				System.out.println("しごろ");
				kane = kane + (kakekin * 2);
				System.out.println("あなたの今の所持金は" + kane + "です");
				//ピンゾロ、ゾロ目、４５６じゃない。通常の目パターン
			} else if (a == b || b == c || a == c) {
				System.out.println("通常の目");

				kane = kane + kakekin;
				System.out.println("あなたの今の所持金は" + kane + "です");
				//通常の目でもなくて123のパターン
			} else if (a == 1 && b == 2 && c == 3) {
				System.out.println("ヒフミ");

				kane = e - kakekin;
				System.out.println("あなたの今の所持金は" + kane + "です");
				//123でもなくてしょんべんパターン
			} else if (a == 7 && b == 7 && c == 7) {
				System.out.println("しょんべん");
				kane = kane - kakekin;
				System.out.println("あなたの今の所持金は" + kane + "です");
				//役なし
			} else {
				System.out.println("役なし");
				kane = kane - kakekin;
				System.out.println("あなたの今の所持金は" + kane + "です");

			}

			if (kane >= 50000) {
				System.out.println("ゲームクリア");
			}

			if (kane <= 0) {

				System.out.println("地下行き");
			}
		}
	}
}
