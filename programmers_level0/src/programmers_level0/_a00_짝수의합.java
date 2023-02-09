package programmers_level0;

import java.util.Scanner;

public class _a00_Â¦¼öÀÇÇÕ {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = solution1(n);
		System.out.println(answer);
	}

	public static int solution1(int n) {
		int answer = 0;
		for (int i = 0; i <= n; i += 2) {

			answer += i;

		}
		return answer;
	}
}
