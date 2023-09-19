package course49;

import java.util.Random;

public class a {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rnd = new Random();
		int[][] arr = new int[6][6];

		for (int tate = 0; tate < 6; tate++) {
			for (int yoko = 0; yoko < 6; yoko++) {
				arr[tate][yoko] = rnd.nextInt(36) + 1;

				for (int tate2 = 0; tate2 < 6; tate2++) {
					for (int yoko2 = 0; yoko2 < 6; yoko2++) {
						arr[tate2][yoko2] = rnd.nextInt(36) + 1;

						if (arr[tate2][yoko2] == arr[tate][yoko]) {
							int a = arr[tate][yoko] = rnd.nextInt(36) + 1;
							
							
						}
					}
				}
			}
		}

		for (int tate = 0; tate < 6; tate++) {
			for (int yoko = 0; yoko < 6; yoko++) {
				System.out.print(arr[tate][yoko]);
				System.out.print(" ");
			}

			System.out.println("");

		}

	}

}
