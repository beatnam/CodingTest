package codingTest;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maxT[] = new int[9];
		for (int i = 0; i < maxT.length; i++) {
			maxT[i] = sc.nextInt();
		}
		sc.close();
		int flag = 0;
		int index = 0;
		for (int j = 0; j < maxT.length; j++) {
			if (maxT[j] > flag) {
				flag = maxT[j];
				index = j + 1;
			}
		}

		System.out.println(flag);
		System.out.println(index);

	}
}
