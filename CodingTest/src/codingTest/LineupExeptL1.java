package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class LineupExeptL1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		int i = 1;
		while (i > 0) {
			boolean hasL = false;
			int h = i;

			while (h > 0) {
				if (h % 10 == L) {
					hasL = true;
					break;
				}
				h = h / 10;
			}
			if (hasL == false)
				number.add(i);
			i++;
			if (number.size() == N)
				break;
		}
		System.out.println(number.get(number.size() - 1));
	}
}