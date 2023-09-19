package course22;

public class practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[][] arr = new String[3][3];
		arr[0][0] = "o";
		arr[0][1] = "x";
		arr[0][2] = "o";

		arr[1][0] = "x";
		arr[1][1] = "o";
		arr[1][2] = "x";

		arr[2][0] = "o";
		arr[2][1] = "o";
		arr[2][2] = "o";

		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("現在の要素は" + arr[i][j]);

				if (arr[i][j].equals("o")) {

					count = count + 1;
				}
			}
			System.out.println();
		}
			System.out.println("oの値は" + count + "です");
		}

	}

