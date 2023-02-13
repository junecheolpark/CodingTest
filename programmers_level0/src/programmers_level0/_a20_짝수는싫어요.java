package programmers_level0;

import java.util.*;

public class _a20_Â¦¼ö´Â½È¾î¿ä {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		System.out.println(Arrays.toString(solution(10)));
	}

	public static int[] solution(int n) {
		// nÀÌ Â¦¼ö¶ó¸é /2 È¦¼ö¶ó¸é /2 +1
		int nl = n % 2 == 0 ? n / 2 : n / 2 + 1, cnt = 0;
		int[] answer = new int[nl];

		System.out.println(nl);
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				// System.out.println(i);
				answer[cnt] = i;
				cnt++;
			}
		}
		return answer;
	}
}
