package course10;

import java.util.Scanner;

public class practice06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		System.out.println("xの数値を入力してね");
		int x = stdIn.nextInt();

		System.out.println("yの数値を入力してね");
		int y = stdIn.nextInt();

		if (x > y) {
			String h = "xがでかいなぜならxは"+ x;
			String i = "でyは"+ y;
			String j = "だから";
			System.out.println(h + i + j);


		} else {
			if( x == y) {
				System.out.println("同じ");
			
				
			} else {
				String e = "yがでかいなぜならyは"+ y;
				String f = "でxは"+ x;
				String g = "だから";
			System.out.println(e + f + g );
			
	///	System.out.println("yがでかい、なぜならyは" + y + "で、ｘは" + x +"だから");
	}

}
	}
}
