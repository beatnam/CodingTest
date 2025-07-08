package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Min {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("몇개의 수를 입력할까요");
		int N = sc.nextInt();

		int arr[] = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.println(arr[i]);
		}
		sc.close();
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);

	}

}
