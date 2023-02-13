package programmers_level0;

import java.util.*;

public class _a19_순서쌍의개수 {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		System.out.println(solution(20));
	}

	public static int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				answer++;
		}
		return answer;
	}
}
