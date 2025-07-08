package codingTest;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// System.out.println("몇쌍 출력>>>");
		int N = sc.nextInt();
		int x[] = new int[N];
		int y[] = new int[N];

		String isTime[] = new String[N];
		String isDate[] = new String[N];

		for (int i = 0; i < N; i++) {
			// System.out.println("x입력>>");
			x[i] = sc.nextInt();
			// System.out.println("y입력>>");
			y[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < N; i++) {
			if (x[i] <= 23 && x[i] >= 0 && y[i] >= 0 && y[i] <= 59) {
				isTime[i] = "Yes";
			} else {
				isTime[i] = "No";
			}

			if ((x[i] > 0)
					&& (x[i] == 1 || x[i] == 3 || x[i] == 5 || x[i] == 7 || x[i] == 8 || x[i] == 10 || x[i] == 12)
					&& (y[i] >= 1 && y[i] <= 31)) {
				isDate[i] = "Yes";
			} else if ((x[i] > 0) && (x[i] == 4 || x[i] == 6 || x[i] == 9 || x[i] == 11) && (y[i] >= 1 && y[i] <= 30)) {
				isDate[i] = "Yes";
			} else if ((x[i] > 0) && x[i] == 2 && (y[i] >= 1 && y[i] <= 29)) {
				isDate[i] = "Yes";
			} else {
				isDate[i] = "No";
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println(isTime[i] + " " + isDate[i]);
		}

	}

}
