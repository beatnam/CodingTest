package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class LineUpExeptL {

	public static void main(String[] args) {

		// 1부터 차례대로 M개의 수 출력하는데 L이 들어가는 숫자는 빼고

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int L = sc.nextInt();
		ArrayList<Integer> number = new ArrayList<Integer>();

		for (int i = 0; i <= 1000000; i++) {
			if (i == L || i == 0) {
				continue;
			} else {
				for (int j = 0; j < 7; j++) {
					if (((i / (10 ^ j)) / L) == 1) {
						continue;
					} else
						number.add(i);
				}
			}
			if (number.size() == M) {
				break;
			}
		}
		System.out.println(number.get(M - 1));
	}
}
