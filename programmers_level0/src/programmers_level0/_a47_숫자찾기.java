package programmers_level0;

import java.util.*;

public class _a47_숫자찾기 {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		// int[] arr3 = { 1, 2, 3 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(232443, 4)));
		System.out.println((solution(123456, 7)));
	}

	public static int solution(int num, int k) {
		String str = Integer.toString(num);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) - '0' == k) {
				return i + 1;
			}
		}
		return -1;
	}
}