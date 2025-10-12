package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181836
 * */

public class _b179_그림확대 {
	public static void main(String[] arg) {
		String[] arr = { ".xx...xx.", "x..x.x..x" };
		System.out.println(Arrays.toString(solution(arr, 3)));
	}

	public static String[] solution(String[] picture, int k) {
		String[] arr = new String[picture.length * k];
		String str = "";
		for (int i = 0; i < picture.length; i++) {
			str = picture[i].replace("x", "x".repeat(k)).replace(".", ".".repeat(k));
			for (int j = 0; j < k; j++) {
				arr[i * k + j] = str;
			}
		}
		return arr;
	}
}
