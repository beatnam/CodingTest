package codingTest;

import java.util.Scanner;

public class Yabawi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N번 수행
		int N = sc.nextInt();
		int Ball[] = { 0, 1, 2, 3 };

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			int temp = Ball[x];
			Ball[x] = Ball[y];
			Ball[y] = temp;
		}

		for (int i = 1; i <= 3; i++) {
			if (Ball[i] == 1) {
				System.out.println(i);
				break;
			}

		}
	}
}
