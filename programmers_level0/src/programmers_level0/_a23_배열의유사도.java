package programmers_level0;

import java.util.*;

public class _a23_배열의유사도 {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		String[] sarr = { "a", "b", "c" };
		String[] sarr2 = { "com", "b", "d", "p", "c" };
		System.out.println((solution(sarr, sarr2)));
	}

	public static int solution(String[] s1, String[] s2) {
		int answer = 0;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				System.out.println(s1[i] + " : " + s2[j]);
				if (s1[i].equals(s2[j])) {
					System.out.println("ok");
					answer++;
				}
			}
		}
		return answer;
	}
}
