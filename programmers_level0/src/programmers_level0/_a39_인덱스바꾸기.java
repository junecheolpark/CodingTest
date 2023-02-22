package programmers_level0;

import java.util.Arrays;

public class _a39_인덱스바꾸기 {
	public static void main(String[] arg) {
		int[] arr = { 1, 2, -3, 4, -5 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution("hello", 1, 2)));
	}

	public static String solution(String my_string, int num1, int num2) {
		char[] arr = my_string.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (num1 == i) {
				arr[num1] = my_string.charAt(num2);
				arr[num2] = my_string.charAt(num1);
				break;
			}
		}
		return String.valueOf(arr);
	}
}
/*
 * char temp = my_string.charAt(num1); StringBuilder sb = new
 * StringBuilder(my_string); sb.setCharAt(num1, my_string.charAt(num2));
 * sb.setCharAt(num2, temp); return String.valueOf(sb);
 */
