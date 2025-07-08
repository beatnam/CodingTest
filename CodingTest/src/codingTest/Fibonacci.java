package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> f = new ArrayList<Integer>();
		f.add(0);
		f.add(1);

		int N = sc.nextInt();

		for (int i = 2; i < 46; i++) {
			f.add(f.get(i - 1) + f.get(i - 2));

		}

		System.out.println(f.get(N));
	}
}
