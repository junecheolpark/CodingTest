package programmers_level0;

import java.util.*;

public class _a21_아이스아메리카노 {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		System.out.println(Arrays.toString(solution(15000)));
	}

	public static int[] solution(int money) {
		int icame = 5500, cnt = 0;
		int[] answer = new int[2];
		while (money >= icame) {
			money -= icame;
			cnt++;
		}
		answer[0] = cnt;
		answer[1] = money;
		return answer;
	}
}
// return new int[] { money / 5500, money % 5500 };
