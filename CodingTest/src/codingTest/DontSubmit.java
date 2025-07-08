package codingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DontSubmit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Student[] = new int[28];

		for (int i = 0; i < Student.length; i++) {
			Student[i] = sc.nextInt();
		}

		ArrayList<Integer> dS = new ArrayList<Integer>();

		for (int i = 1; i <= 30; i++) {
			boolean submit = false;
			for (int j = 0; j < Student.length; j++) {
				if (i == Student[j]) {
					submit = true;
					break;
				}
			}
			if (submit == false) {
				dS.add(i);
			}
		}
		Collections.sort(dS);

		for (int i = 0; i < dS.size(); i++) {
			System.out.println(dS.get(i));
		}

	}
}
