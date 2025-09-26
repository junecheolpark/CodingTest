package programmers_level0;

import java.util.HashMap;
import java.util.Map;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181855
 * */

public class _b151_문자열묶기 {
	public static void main(String[] arg) {
		String[] arr1 = { "a", "bc", "d", "efg", "hi" };
		System.out.println((solution2(arr1)));
	}

	// 방법1 범위(1~30)가 작게 고정되어 있을 때 최적
	public static int solution(String[] strArr) {
		// 문자열 최대 길이가 30이므로 크기 31짜리 배열 준비
		int[] cnt = new int[31];
		int max = 0;
		for (String s : strArr) {
			cnt[s.length()]++;
		}
		// 최댓값 구하기
		for (int c : cnt) {
			if (c > max)
				max = c;
		}

		return max;
	}

	// 방법 2 다양한 기준으로 그룹핑해야 할 때 더 유연
	public static int solution2(String[] strArr) {
		Map<Integer, Integer> map = new HashMap<>();

		// 문자열 길이별 카운트
		for (String s : strArr) {
			int len = s.length();
			map.put(len, map.getOrDefault(len, 0) + 1);
		}

		// 최댓값 찾기
		int max = 0;
		for (int count : map.values()) {
			max = Math.max(max, count);
		}

		return max;
	}
}