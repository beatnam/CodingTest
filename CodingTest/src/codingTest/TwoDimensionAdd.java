package codingTest;

import java.util.Scanner;

public class TwoDimensionAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int arr[][] = new int[N + 1][M + 1];

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int K = sc.nextInt();
		int sumK[] = new int[K];

		for (int l = 0; l < K; l++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int a = i; a <= x; a++) {
				for (int b = j; b <= y; b++) {
					sumK[l] += arr[a][b];

				}
			}
		}

		for (int k = 0; k < sumK.length; k++) {
			System.out.println(sumK[k]);
		}

	}
}