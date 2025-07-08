package codingTest;

import java.util.Scanner;

public class Tree7 {
	public static void main(String[] agrs) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = i + 1; j <= N; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= N; i++) { // 줄
			for (int j = 1; j <= i; j++) {
				System.out.print(" "); // 공백
			}
			for (int j = 2 * (N - 1); j > i * 2 - 1; j--) {
				System.out.print("*"); // 별
			}
			System.out.println();
		}

	}
}
