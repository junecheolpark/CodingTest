package programmers_level0;

import java.util.*;

public class _a46_369∞‘¿” {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		// int[] arr3 = { 1, 2, 3 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(3)));
		System.out.println((solution(29423)));
	}

	public static int solution(int order) {
		String str = Integer.toString(order);
		int answer = 0;
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case '3':
			case '6':
			case '9':
				answer++;
				break;
			}

		}
		return answer;
	}
}