package codingTest;

import java.util.Scanner;

public class B11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int sum = 0;
		
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}

		System.out.println(sum);
	}

}
