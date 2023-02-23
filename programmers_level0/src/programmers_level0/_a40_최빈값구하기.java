package programmers_level0;

import java.util.Arrays;

public class _a40_최빈값구하기 {
	public static void main(String[] arg) {
		int[] arr3 = { 1 };
		int[] arr2 = { 1, 2, 3, 3, 3, 4 };
		int[] arr = { 1, 1, 2, 2 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		 System.out.println((solution(arr2)));
		 System.out.println((solution(arr)));
		System.out.println((solution(arr3)));
	}

	public static int solution(int[] array) {
		if (array.length == 1) {
			return 1;
		}
		Arrays.sort(array);
		int cnt = 1, cnt2 = 0, answer = array[0];
		for (int i = 1; i < array.length; i++) {
			if (answer != array[i]) {
				answer = array[i];
				if (cnt > cnt2) {
					cnt2 = cnt;
					cnt = 1;
				} 
				// System.out.println(i + "gg1: " + cnt);
			} else {
				cnt++;
			}
			// System.out.println(i + "gg: " + cnt);
		}
		// System.out.println("gg: " + cnt);
		// System.out.println("gg: " + cnt2);
		return cnt == cnt2 ? -1 : cnt2;
	}
}
/*
 * char temp = my_string.charAt(num1); StringBuilder sb = new
 * StringBuilder(my_string); sb.setCharAt(num1, my_string.charAt(num2));
 * sb.setCharAt(num2, temp); return String.valueOf(sb);
 */
