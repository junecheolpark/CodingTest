package programmers_level0;

import java.util.Arrays;

public class _a42_배열뒤집기 {
	public static void main(String[] arg) {
		int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		int[] arr3 = { 1, 2, 3 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println(Arrays.toString(solution(arr2, "left")));
		System.out.println(Arrays.toString(solution(arr3, "right")));
	}

	public static int[] solution(int[] numbers, String direction) {
		int len = numbers.length;
		int[] answer = new int[len];
		if (direction.equals("right")) {
			for (int i = 0; i < len; i++) {
				if (i == 0) {
					answer[i] = numbers[len - 1];
				} else {
					answer[i] = numbers[i - 1];
				}
			}
		} else if (direction.equals("left")) {
			for (int i = 0; i < len; i++) {
				if (i == len - 1) {
					answer[i] = numbers[0];
				} else {
					answer[i] = numbers[i + 1];
				}
			}
		}
		return (answer);
	}
}
