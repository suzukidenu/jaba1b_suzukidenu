package course54_55;

import java.util.Scanner;

public class TyphoonControll {
	public static void main(String[] args) {

		Typhoon ty = new Typhoon("1", "4月8日", "マラカス");
		Typhoon ty1 = new Typhoon("2", "4月10日", "メーギー");
		Typhoon ty2 = new Typhoon("3", "6月30日", "チャバ");
		Typhoon ty3 = new Typhoon("4", "7月1日", "アイレー");
		Typhoon ty4 = new Typhoon("5", "7月28日", "ソングダー");
		Typhoon ty5 = new Typhoon("6", "7月31日", "トレーセス");
		Typhoon ty6 = new Typhoon("7", "8月9日", "ムーラン");
		Typhoon ty7 = new Typhoon("8", "8月12日", "メアリー");
		Typhoon ty8 = new Typhoon("9", "8月22日", "マーゴン");

		Typhoon[] typhoonList = new Typhoon[9];
		typhoonList[0] = ty;
		typhoonList[1] = ty1;
		typhoonList[2] = ty2;
		typhoonList[3] = ty3;
		typhoonList[4] = ty4;
		typhoonList[5] = ty5;
		typhoonList[6] = ty6;
		typhoonList[7] = ty7;
		typhoonList[8] = ty8;

		Scanner stdIn = new Scanner(System.in);
		System.out.println("表示:0 編集:99");

		int x = stdIn.nextInt();
		if (x == 0) {
			for (int i = 0; i < 9; i++) {
				System.out.println(typhoonList[i].getAsiaName());

			}else if( x == 99) {
				
				
			}
		}
	}
}