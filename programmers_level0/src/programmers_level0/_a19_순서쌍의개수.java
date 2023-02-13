package programmers_level0;

import java.util.*;

public class _a19_순서쌍의개수 {
	public static void main(String[] arg) {
		int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		System.out.println(Arrays.toString(solution(arr)));
	}

	public static int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i] * 2;
		}
		return answer;
	}
}
