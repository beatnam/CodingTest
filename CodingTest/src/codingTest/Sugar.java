package codingTest;

import java.util.Scanner;

public class Sugar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		int result = -1;
		
		for (int i = 0; i <= s / 3; i++) {
			int remaining = s - (3 * i);
			
			if (remaining % 5 == 0) {
				
				int count5 = remaining / 5;
				int count3 = i;
				
				result = count5 + count3;
				break;
			}
		}

		System.out.println(result);
	}
}
