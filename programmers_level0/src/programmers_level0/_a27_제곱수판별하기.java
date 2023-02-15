package programmers_level0;

import java.util.Arrays;

public class _a27_제곱수판별하기 {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(144)));
		System.out.println((solution(976)));
	}

	public static int solution(int n) {
		int answer = 1;
		int cnt = 2;
		while (true) {
			if (answer * answer == n) {
				cnt = 1;
			} else if (answer * answer > n) {
				break;
			}
			answer++;

		}
		return cnt;
	}
}

//return Math.sqrt(n) % 1 == 0 ? 1 : 2;