package course57;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();

		//トレーニング回数
		int tore = 0;

		//プレイヤーのステータス

		Player me = new Player();
		int myK = rnd.nextInt(5) + 1;
		int myG = rnd.nextInt(5) + 1;
		int myM = rnd.nextInt(5) + 1;
		int myO = rnd.nextInt(5) + 1;

		//相手のステータス
		Player koku = new Player();
		int kokuK = rnd.nextInt(13) + 3;
		int kokuG = rnd.nextInt(13) + 3;
		int kokuM = rnd.nextInt(13) + 3;
		int kokuO = rnd.nextInt(13) + 3;

		
		//自分のステータス表示
		System.out.println("筋力" + myK);
		System.out.println("学力" + myG);
		System.out.println("見た目" + myM);
		System.out.println("面白さ" + myO);

		
		//やること選択
		System.out.println("やること選択");
		System.out.println("1:筋トレ 2:勉強 3:整形 4:会話");
		int yarukoto = stdIn.nextInt();

		
		//トレーニング結果
		if (yarukoto == 1) {
			

		}

	}

}
