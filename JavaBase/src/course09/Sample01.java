package course09;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
       System.out.println("数値を入力してください");
       Scanner stdIn = new Scanner(System.in);
       
		int a = stdIn.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("1ですね？");
			break;
		case 2:
			System.out.println("2ですね？");
			break;
		case 10:
			System.out.println("10ですね？");
			break;
		default:
			System.out.println("該当せず");
		}
	}

}
