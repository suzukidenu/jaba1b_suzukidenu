package cource26;

public class practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		
	///初期化プログラム
		
		int wincount = 0;
		
		
		
		
	///ゲーム数、勝利数、敗北数表示
		
	    dispResult(10 , 20 , 30);
    
	}
	
	static void  dispResult(int kazu , int kati , int make ) {
		
		System.out.println("現在の行ったゲーム数は" + kazu + "です");
		System.out.println("現在の勝利数は" + kati + "です");
		System.out.println("現在の敗北数は" + make + "です");
		
		
	
		
		
		  ///所持金
	     int kane = 1000;
	      int okane = motigane(kane);
	      
	      System.out.println("現在の所持金は" + okane + "です");
	      
	    	  
	      }
		static int motigane(int x) {
			int sum = x;
			return sum;
			
	}
		
		dispResult(gamecount , wincount , losecount);
		

		}
		
		static void dispResult(int kazu , int kati , int make ) {
			System.out.println("現在の行ったゲーム数は" + kazu + "です");
			System.out.println("現在の勝利数は" + kati + "です");
			System.out.println("現在の敗北数は" + make + "です");
	}
		
		
		static String owari(int hantei) {
			String shuuryou = "";
			if (hantei == 9999) {
			shuuryou = "END";
			} else {
			shuuryou = "CONT";
			}
			return shuuryou;
			}
			
}
		
		
	

 
	      
	