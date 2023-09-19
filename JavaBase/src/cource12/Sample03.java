package cource12;

public class Sample03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
     ///鉄板文法
		int i = 0;
		do {
			System.out.println("ここに実行したいことを書くよーーー");
			i++;
		} while(i < 3);
		
		int x = 0;
		do {
			if(x < 3) {
				System.out.println("ifとの組み合わせだよー");
			} else if (x == 2) {
				break;
				
			}
			x++;
		}while (x < 3);
	}
	
}
