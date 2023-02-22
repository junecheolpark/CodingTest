package programmers_level0;

import java.util.Arrays;

public class _a38_최대값만들기 {
	public static void main(String[] arg) {
		int[] arr = { 1, 2, -3, 4, -5 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(arr)));
	}

	public static int solution(int[] numbers) {
		Arrays.sort(numbers);
        int res1 = numbers[0] * numbers[1];
        int res2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        return res1 > res2 ? res1 : res2;
	}
}