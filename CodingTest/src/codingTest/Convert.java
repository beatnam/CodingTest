package codingTest;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String B = sc.next();

		String N = sc.next();
		int B = sc.nextInt();
		System.out.println(Integer.parseInt(N, B));
	}

}
