package course10;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		System.out.println("xの数値を入力してね");
		int x = stdIn.nextInt();

		System.out.println("yの数値を入力してね");
		int y = stdIn.nextInt();

		if (x > y) {
			System.out.println("xがでかい");


		} else {
			if( x == y) {
				System.out.println("同じ");
			
				
			} else {
			System.out.println("yがでかい");
			}
		}

	}
}
