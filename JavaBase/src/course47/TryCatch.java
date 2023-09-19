package course47;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			System.out.println("入力して");
			Scanner stdIn = new Scanner(System.in);

			int x = stdIn.nextInt();

			int[] numArr = new int[3];
			numArr[1] = 10;
			numArr[2] = 20;
			numArr[3] = 30;
			numArr[4] = 40;

		} catch (Exception e) {
			System.out.println("以下のエラーを検出しました！ぐぐれ");
			System.out.println(e);
			e.printStackTrace();
		}

	}
}
