package codingTest;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			String str = sc.next();
			
			StringTokenizer st = new StringTokenizer(str, ",");

			int a = Integer.parseInt(st.nextToken()); // 첫번째 조각
			int b = Integer.parseInt(st.nextToken()); // 두번째 조각

			System.out.println(a + b);
		}
		sc.close();
	}
}
