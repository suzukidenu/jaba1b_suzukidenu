package course09;

import java.util.Scanner;

public class practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 System.out.println("入力してね");
	     Scanner stdIn = new Scanner(System.in);
	     
	     String like = stdIn.next();
	     
	     switch(like) {
	     case"野菜":
	     case"薬":
	    	 System.out.println("健康的ですね");
             break;
             
	}
	}
}

