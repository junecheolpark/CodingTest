package programmers_level0;

import java.util.Arrays;

public class _a62_공던지기 {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6 };
		int[] arr3 = { 1, 2, 3 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(arr1, 2)));
		System.out.println((solution(arr2, 5)));
		System.out.println((solution(arr3, 3)));
	}

	public static int solution(int[] numbers, int k) {
		int cnt = 0, leth = numbers.length;
		for (int i = 0; i < k - 1; i++) {
			cnt += 2;
		}
		while (cnt > leth) {
			cnt -= leth;
		}
		return numbers[cnt];
	}
}