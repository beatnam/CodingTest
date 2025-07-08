package codingTest;

import java.util.Scanner;

public class Tree {

	public static void main(String[] args) {
		// 역삼각형과 삼각형

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N - 1; i++) { // 줄
			for (int j = 2; j <= i; j++) {
				System.out.print(" "); // 공백
			}
			for (int j = 2 * N - 1; j >= i * 2 - 1; j--) {
				System.out.print("*"); // 별
			}
			System.out.println();
		}

		for (int i = 1; i <= N; i++) {
			for (int j = i + 1; j <= N; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
