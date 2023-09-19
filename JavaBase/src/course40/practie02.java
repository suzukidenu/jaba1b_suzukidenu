package course40;

public class practie02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		for(int a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		
		for(int i = 0; i < 100; i++) {
			
			System.out.println(i);
			
			int b = i % 2;
			if(b == 0) {
				System.out.println("現在" + i + "回目のループです。偶数です");
			}
			
			
		}
		for(int c = 10; c > 0; c--) {
			System.out.println(c);
		}
		
		int sum = 1;
		for(int d = 1; d < 100; d++) {
			int e = d + 1;
			System.out.println(e);
		}
	}

}
