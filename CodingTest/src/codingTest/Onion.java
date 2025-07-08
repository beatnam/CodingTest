package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Onion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> A = new ArrayList<String>();
		ArrayList<String> B = new ArrayList<String>();
		ArrayList<String> temp = new ArrayList<String>();
		int N = sc.nextInt();
		int pA = sc.nextInt();
		int pB = sc.nextInt();
		A.add("L");
		B.add("L");
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= pA; j++) {
				A.add("L");
			}
			for (int j = 1; j <= pB; j++) {
				B.add("L");
			}
			if (A.size() < B.size()) {
				temp = A;
				A = B;
				B = temp;
			} else if (A.size() == B.size()) {
				B.remove(B.get(0));
			}
		}
		System.out.println(A.size() + "  " + B.size());
	}
}
