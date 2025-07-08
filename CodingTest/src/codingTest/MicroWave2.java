package codingTest;

import java.util.Scanner;

public class MicroWave2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 주어진 버튼을 초단위로.
		int A = 300;
		int B = 60;
		int C = 10;

		int T = sc.nextInt();
		
		if (T % C != 0) {
			System.out.println(-1);
			return;
		}

		int a = T / A;
		T = T % A;
		int b = T / B;
		T = T % B;
		int c = T / C;
		T = T % C;

		System.out.println(a + " " + b + " " + c);

	}
}
