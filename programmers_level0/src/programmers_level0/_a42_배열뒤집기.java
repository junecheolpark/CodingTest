package programmers_level0;

import java.util.Arrays;

public class _a42_배열뒤집기 {
	public static void main(String[] arg) {
		int[] arr3 = { 1, 8, 3 };
		int[] arr2 = { 9, 10, 11, 8 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println(Arrays.toString(solution(arr2)));
		System.out.println(Arrays.toString(solution(arr3)));
	}

	public static int[] solution(int[] array) {
		int len = array.length-1;
		System.out.println(len);
		int[] answer = new int[len];
		Arrays.toString(answer);
		for (int i = len; i > 0; i--) {
			System.out.println(array[i]);
			answer[len - i] = array[i];
		}
		return (answer);

	}
}
