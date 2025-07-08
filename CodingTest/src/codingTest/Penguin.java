package codingTest;

import java.util.Scanner;

public class Penguin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Floor[] = new int[N];

		// 바닥값 설정(-1 하나 포함)
		for (int i = 0; i < N; i++) {
			Floor[i] = sc.nextInt();
		}
		sc.close();
		int m1 = -1;
		for (int i = 0; i < N; i++) {
			if (Floor[i] == -1) {
				m1 = i;
				break;
			}
		}

		int minF = 1000000000;
		int minL = 1000000000;
		for (int j = 0; j < m1; j++) {
			if (Floor[j] < minF) {
				minF = Floor[j];
			}
		}
		for (int k = m1 + 1; k < N; k++) {
			if (Floor[k] < minL) {
				minL = Floor[k];
			}
		}

		System.out.println(minF + minL);
	}
}
