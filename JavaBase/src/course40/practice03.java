package course40;

public class practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);

		String[] cities = new String[5];
		cities[0] = "東京";
		cities[1] = "大阪";
		cities[2] = "千葉";
		cities[3] = "神奈川";
		cities[4] = "埼玉";

		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		System.out.println(cities[4]);

		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		System.out.println(num[0] + num[1] + num[2] + num[3] + num[4]);

		int[] nu = new int[5];
		nu[0] = 10;
		nu[1] = 20;
		nu[2] = 30;
		nu[3] = 40;
		nu[4] = 50;

		int sum = 0;
		for (int o = 0; o < nu.length; o++) {
			if (sum < nu[o]) {
				sum = nu[o];
			}
			System.out.println(sum);

		
			}
		}
	}

}
