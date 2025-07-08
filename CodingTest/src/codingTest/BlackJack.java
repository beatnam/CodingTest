package codingTest;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// N개 수 입력받기
		// 3장 뽑아서 M 이하 최대수 출력
		int N = sc.nextInt(); // 5
		int M = sc.nextInt(); // 21

		int number[] = new int[N];
		int sum = 0;
		int result = 0;
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		for (int i = 0; i < number.length; i++) {

			for (int k = i + 1; k < number.length; k++) {

				for (int j = k + 1; j < number.length; j++) {
					sum = number[i] + number[k] + number[j];
					if (sum <= M && result < sum) {
						result = sum;
					}
				}
			}
		}
		System.out.println(result);
	}

}
