package codingTest;

import java.util.Collections;
import java.util.Scanner;

public class DvdWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String w = sc.next();

		char w1[] = w.toCharArray();

		char w2[] = new char[w1.length];

		for (int i = w1.length - 1, j = 0; i >= 0; i--, j++) {

			w2[i] = w1[j];
		}

		for (int i = 0; i < w1.length; i++) {
			System.out.println(w1[i]);

		}
		for (int i = 0; i < w1.length; i++) {

			System.out.println(w2[i]);
		}

	}

}
