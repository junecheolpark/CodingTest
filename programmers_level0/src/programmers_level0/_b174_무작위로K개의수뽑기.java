package programmers_level0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181858
 * */

public class _b174_무작위로K개의수뽑기 {
	public static void main(String[] arg) {
		int[] arr = { 0, 1, 1, 2, 2, 3 };

		System.out.println(Arrays.toString(solution2(arr, 3)));
	}

	// 방법1 contains와 add가 평균적으로 O(1)이기 때문에 빠름
	public static int[] solution(int[] arr, int k) {
		int[] answer = new int[k];
		// 배열 안의 수를 모두 -1로 변경
		Arrays.fill(answer, -1);
		Set<Integer> set = new HashSet<>();
		int cnt = 0;

		for (int num : arr) {
			// 아직 뽑은 적 없는 수라면 추가
			if (!set.contains(num)) {
				set.add(num);
				answer[cnt++] = num;
			}
			// k개 다 채우면 멈춤
			if (cnt == k)
				break;
		}
		return answer;
	}

	// 방법2 O(n × k) 값 하나 넣을 때마다 지금까지 넣은 값들을 일일이 비교해야 함
	public static int[] solution2(int[] arr, int k) {
		int[] answer = new int[k];
		boolean exists = true;
		int cnt = 0; // 배열 안의 수를 모두 -1로 변경
		Arrays.fill(answer, -1);

		for (int i = 0; i < arr.length; i++) {
			if (k == cnt) { // k길이만큼 다채우면 멈춤
				break;
			}
			exists = false;
			for (int j = 0; j < cnt; j++) {
				if (answer[j] == arr[i]) {
					exists = true;
					break;
				}
			}

			if (!exists) {
				answer[cnt] = arr[i]; 
				cnt++;
			}
		}
		return answer;
	}
}
