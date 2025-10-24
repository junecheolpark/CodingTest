package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181893
 * */

public class _b204_배열조각하기 {
	public static void main(String[] arg) {
		int[] arr = { 0, 1, 2, 3, 4, 5 };
		int[] arr2 = { 4, 1, 2 };
		System.out.println(Arrays.toString(solution(arr, arr2)));

	}

	private static int[] solution(int[] arr, int[] query) {
		int start = 0;
		int end = arr.length; // end는 잘리는 범위의 "끝 + 1"

		for (int i = 0; i < query.length; i++) {
			if (i % 2 == 0) {
				// 짝수 인덱스: query[i] 이후를 잘라냄
				end = start + query[i] + 1;
			} else {
				// 홀수 인덱스: query[i] 이전을 잘라냄
				start = start + query[i];
			}
		}

		// 잘라낸 구간만 남김
		return Arrays.copyOfRange(arr, start, end);
	}

}
