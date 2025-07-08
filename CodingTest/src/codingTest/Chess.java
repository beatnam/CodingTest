package codingTest;

import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
		Scanner sc = new Scanner(System.in);

		int input[] = new int[6];
		int correct[] = { 1, 1, 2, 2, 2, 8 };
		int output[] = new int[6];

		for (int i = 0; i <= 5; i++) {
			input[i] = sc.nextInt();
		}

		sc.close();
		for (int i = 0; i <= 5; i++) {
			output[i] = correct[i] - input[i];
		}

		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}

		
	}

}
