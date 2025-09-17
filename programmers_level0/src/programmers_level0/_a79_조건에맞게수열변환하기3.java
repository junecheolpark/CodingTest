package programmers_level0;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181835

public class _a79_조건에맞게수열변환하기3 {
	public static void main(String[] arg) {
		int[] arr = {1, 2, 3, 100, 99, 98};
		System.out.println(Arrays.toString(solution(arr, 3)));
	}

	public static int[] solution(int[] arr, int k) {
		boolean bool = (k % 2 == 0);
		for (int i = 0; i < arr.length; i++) {
			if (bool) {
				arr[i] += k;
			} else {
				arr[i] *= k;
			}
		}
		return arr;
	}
}