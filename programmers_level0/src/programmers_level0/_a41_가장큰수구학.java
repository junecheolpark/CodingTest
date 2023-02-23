package programmers_level0;

import java.util.Arrays;

public class _a41_가장큰수구학 {
	public static void main(String[] arg) {
		int[] arr3 = { 1, 8, 3 };
		int[] arr2 = { 9, 10, 11, 8 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println(Arrays.toString(solution(arr2)));
		System.out.println(Arrays.toString(solution(arr3)));
	}

	public static int[] solution(int[] array) {
		int[] answer = new int[2];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > answer[0]) {
				answer[0] = array[i];
				answer[1] = i;
			}
		}
		return (answer);

	}
}
