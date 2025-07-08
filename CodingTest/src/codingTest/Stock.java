package codingTest;

import java.util.Scanner;

public class Stock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 현금 입력
		int money = sc.nextInt();
		int j = money;
		int s = money;

		int jStock = 0;
		int sStock = 0;
		int jRate = 0;
		int sRate = 0;

		int currentP[] = new int[14];

		for (int i = 0; i <= 13; i++) {
			currentP[i] = sc.nextInt();
		} // 현재가 대입

		for (int i = 0; i <= 13; i++) {
			if (j >= currentP[i]) {
				jStock += j / currentP[i];
				j = j % currentP[i];
			}
		} // 내 돈이 현재가보다 많으면 무지성 매수

		for (int k = 0; k <= 10; k++) {
			if (currentP[k + 3] < currentP[k + 2] && currentP[k + 2] < currentP[k + 1] && currentP[k + 1] < currentP[k]
					&& (s >= currentP[k + 2])) {
				sStock += s / currentP[k + 3];
				s = s % currentP[k + 3];
			}
			// 하락장에 산다.

			if (currentP[k + 3] > currentP[k + 2] && currentP[k + 2] > currentP[k + 1]
					&& currentP[k + 1] > currentP[k]) {
				s += currentP[k + 3] * sStock;
				sStock = 0;
			}
		} // 상승장에 판다.

		jRate = jStock * currentP[13] + j;
		sRate = sStock * currentP[13] + s;

		if (jRate > sRate) {
			System.out.println("BNP");
		} else if (jRate < sRate) {
			System.out.println("TIMING");
		} else {
			System.out.println("SAMESAME");
		}

	}
}
