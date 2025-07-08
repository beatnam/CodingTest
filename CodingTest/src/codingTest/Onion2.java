package codingTest;

import java.util.Scanner;

public class Onion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int pA = sc.nextInt();
		int pB = sc.nextInt();
		int A = 1;
		int B = 1;

		for (int i = 0; i < N; i++) {
			A += pA;
			B += pB;
			if (A < B) {
				int temp = A;
				A = B;
				B = temp;
			} else if (A == B) {
				B -= 1;
			}
		}
		System.out.println(A + " " + B);
	}

}
