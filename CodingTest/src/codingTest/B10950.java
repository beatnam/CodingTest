package codingTest;

import java.util.Scanner;

public class B10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int A;
		int B;
		int sum[] = new int[N];
		for (int i = 0; i < N; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			sum[i] = A + B;
		}
		for (int i = 0; i < N; i++) {
			System.out.println(sum[i]);
		}
	}

}
