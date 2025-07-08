package codingTest;

import java.util.Scanner;

public class SearchPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x[] = new int[3];
		int y[] = new int[3];

		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		int x4 = 0, y4 = 0;

		if (x[0] == x[1]) {
			x4 = x[2];
		} else if (x[1] == x[2]) {
			x4 = x[0];
		} else {
			x4 = x[1];
		}
		
		if (y[0] == y[1]) {
			y4 = y[2];
		} else if (y[1] == y[2]) {
			y4 = y[0];
		} else {
			y4 = y[1];
		}
		System.out.println(x4 + " " + y4);
	}
}
