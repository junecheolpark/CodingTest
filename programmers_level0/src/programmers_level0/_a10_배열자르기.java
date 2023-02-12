package programmers_level0;

import java.util.Arrays;

public class _a10_배열자르기 {
	public static void main(String[] arg) {
		int[] arr = { 1, 3, 5 };
		// String str = "hello";
		System.out.println(Arrays.toString(solution(arr, 1, 2)));
	}

	public static int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = new int[num2 - num1 + 1];

		for (int i = num1; i <= num2; i++) {
			answer[i - num1] = numbers[i];
		}

		return answer;
	}
}
