package cource16;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		int x = 8;
		
		// >> は右に2ビットずらす。
		x = x >> 2;
		
		System.out.println(x);
		
		int y = 8;
		
		// << は左にずらす。
		y = y << 2;
		
		System.out.println(y);
		
		//ちなみに
		int z = 8;
		
		//こう書くと4ビットずらす。
		z = z << 4;
		
		System.out.println(z);
		
	}

}
