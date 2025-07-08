package codingTest;

import java.util.HashSet;
import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int K[] = new int[M];
		HashSet<Integer> num = new HashSet<Integer>();

		for (int i = 0; i < M; i++) {
			K[i] = sc.nextInt();
		}

		for (int j = 0; j < M; j++) {
			int count = 1;
			while (K[j] * count <= N) {
				num.add(K[j] * count);
				count++;
			}
		}

		int sum = 0;

		for (int val : num) {
			sum += val;
		}

		System.out.println(sum);
	}
}