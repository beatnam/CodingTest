package codingTest;

import java.util.Scanner;

public class B10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A;
		int B;

		while (sc.hasNextInt()) {
			A = sc.nextInt();
			B = sc.nextInt();
			if (A == 0 && B == 0) {
				break;
			}
			System.out.println(A + B);

		}
	}

}
