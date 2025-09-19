package programmers_level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181895
 * */

public class _b111_배열만들기3 {
	public static void main(String[] arg) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[][] arr2 = { { 1, 3 }, { 0, 4 } };
		System.out.println(Arrays.toString(solution(arr, arr2)));
	}

	// 방법1(성능 최우선) 배열직접생성 장점: 성능 가장 좋음 → O(N) 순수 배열 연산 

	public static int[] solution(int[] arr, int[][] intervals) {
		int inter1 = intervals[0][0], inter2 = intervals[0][1], inter3 = intervals[1][0], inter4 = intervals[1][1],
				idx = 0;
		int[] answer = new int[inter2 - inter1 + inter4 - inter3 + 2];

		for (int i = inter1; i <= inter2; i++) {
			answer[idx++] = arr[i];
		}

		for (int i = inter3; i <= inter4; i++) {
			answer[idx++] = arr[i];
		}

		return answer;
	}

	//	방법 2(코드가독성) 리스트 활용 장점: 가독성 높음, 직관적이고 유지보수가 쉬움 arr 크기가 몇천개까지는괜춘

	public static int[] solution2(int[] arr, int[][] intervals) {
		List<Integer> list = new ArrayList();
		for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
			list.add(arr[i]);
		}
		for (int j = intervals[1][0]; j <= intervals[1][1]; j++) {
			list.add(arr[j]);
		}
		//성능은 for문보다 stream이 1.5~2배 차이남
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

}