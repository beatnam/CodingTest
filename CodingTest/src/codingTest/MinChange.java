package codingTest;

import java.util.Scanner;

public class MinChange {

	public static void main(String[] args) {
		// n엔 짜리 물건 사고 1000엔 냈을 때 거스름돈 갯수
		// 잔돈 500엔, 100엔, 5엔, 1엔
		Scanner sc = new Scanner(System.in);

		int P = sc.nextInt();
		int change = 1000 - P;

		int a = change / 500;
		change = change % 500;

		int b = change / 100;
		change = change % 100;

		int c = change / 50;
		change = change % 50;

		int d = change / 10;
		change = change % 10;

		int e = change / 5;
		change = change % 5;

		int f = change / 1;
		change = change % 1;
		System.out.println(a + b + c + d + e + f);
	}

}
