package codingTest;

import java.util.Scanner;

public class DivideWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		// 재조립한 단어의 경우의 수 중 가장 먼저 나오는 알파벳
		// 단어 받고 그 단어 하나하나를 배열 한칸씩에 박기
		char[] cW = w.toCharArray();
		int min1 = 0; // 자르는 선
		int min2 = 0;
		// 첫번째 그룹

		for (int i = 0; i < cW.length - 2; i++) {
			if (cW[i] < cW[i + 1]) {
				min1 = i;
			}
		}

		// 그 그룹을 하나의 배열로
		char[] cW1 = new char[min1 + 1];
		for (int i = 0; i <= min1; i++) {
			cW1[i] = cW[i];
		}

		// 두번째 그룹
		for (int i = min1 + 1; i < cW.length - 1; i++) {
			if (cW[i] < cW[i + 1]) {
				min2 = i;
			}
		}
		// 그 그룹을 하나의 배열로
		char[] cW2 = new char[cW.length - min1 - 1];
		for (int i = 0; i <= min2 - min1 + 1; i++) {
			cW2[i] = cW[min1 + i + 1];
		}

		for (int i = 0; i < cW1.length; i++) {
			System.out.println(cW1[i]);
		}

		for (int i = 0; i < cW2.length; i++) {
			System.out.println(cW2[i]);
		}
	}
}
