package course39;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Student a = new Student();
		a.name = "すずき";
		a.no = 15;

		Student a2 = new Student();
		a2.name = "うすい";
		a2.no = 4;

		Student[] myfriend = new Student[2];
		myfriend[0] = a;
		myfriend[1] = a2;

		for (int i = 0; i < 2; i++) {
			System.out.println(myfriend[i].name);

		}

	}
}
