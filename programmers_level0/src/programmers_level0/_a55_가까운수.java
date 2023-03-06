package programmers_level0;

import java.util.Arrays;

public class _a55_가까운수 {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		// int[] arr3 = { 1, 2, 3 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution("olleh", "hello")));
		System.out.println((solution("allpe", "apple")));
	}

	public static int solution(String before, String after) {
		char[] b_ch = before.toCharArray();
		char[] a_ch = after.toCharArray();

		Arrays.sort(b_ch);
		Arrays.sort(a_ch);

		return new String(b_ch).equals(new String(a_ch)) ? 1 : 0;
	}
}