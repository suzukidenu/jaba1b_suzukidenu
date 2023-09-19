package cource13;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	    System.out.println("入力してね");
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt();
		
		for(int i = 0; i < x; i++) {
			
			
		
			
			int y = i % 2;
			if(y == 1) {
				
			System.out.println("奇数だよ");
			}
			
			System.out.println(i);
		
			int z = i % 2;
		if(z > 0) {
			System.out.println("偶数だよ");
		}
		
		if(i >= 100) {
			System.out.println("どれだけ回すの");
			
			
		
	}

}
		
	}
	
}
