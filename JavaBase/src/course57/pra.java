package course57;

import java.util.Random;
import java.util.Scanner;

public class pra {

	Scanner stdIn = new Scanner(System.in);

	int y = 0;

	//1-100までのランダムな数値を生成し、変数「ransu」に格納する。
	Random rnd = new Random();
	int ransu = rnd.nextInt(100) + 1;

	while(x!=ransu)
	{

		//予想数値
		int x = stdIn.nextInt();

		if (x == ransu) {
			System.out.println(y + "回目で一致");

			break;

		} else if (x > ransu) {
			System.out.println("もっと小さい");

		} else {
			System.out.println("もっと大きい");

			y = y++;

		}
	}
}}