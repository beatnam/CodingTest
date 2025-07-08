package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Microwave {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		ArrayList<Integer> time = new ArrayList<Integer>();

		//   C        D            E
		// A ~ 0(ice) ~ 0(not ice) ~ B
		if (A < 0) {
			time.add(C * Math.abs(A));
			time.add(D);
			time.add(E * Math.abs(B));
		}

		if (A == 0) {
			time.add(D);
			time.add(E * Math.abs(B));
		}

		if (A > 0) {
			time.add(Math.abs(B - A) * E);
		}

		
		// 걸리는 시간 더하기(배열에 삽입한 값 전체 더하기)
		int sumtime = 0;
		for (int i = 0; i < time.size(); i++) {
			sumtime += time.get(i);
		}

		System.out.println(sumtime);
	}

}
