package course47;

public class practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習問題④
		try {
	    int result = divideNumbers(10, 0);
	    System.out.println(result);
		
	}
		///////これはmainメソッドの外に書いて////////
	    public static int divideNumbers(int a, int b) {
	        return a / b;
	    }
	} catch (Exception e) {
		System.out.println("以下のエラーを検出しました！ぐぐれ");
		System.out.println(e);
	}



