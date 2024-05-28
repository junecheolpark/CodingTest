package programmers_level2;

import java.util.HashSet;
import java.util.Set;

//https://school.programmers.co.kr/learn/courses/30/lessons/131701
public class a15_연속부분수열합의개수 {
	public static void main(String[] args) {

		int[] elements = { 7, 9, 1, 1, 4 };
		System.out.println(solution(elements)); // 출력:18
	}

	// 방법 1
	public static int solution(int[] elements) {
		Set<Integer> set = new HashSet<>();
		int eLength = elements.length;
		int cnt = 0;

		// 합계를 계산하고 Set에 추가
		for (int i = 0; i < eLength; i++) {
			for (int j = 0; j < eLength; j++) {
				int sum = 0; // 이 부분을 각 루프마다 초기화
				for (int s = j; s <= j + cnt; s++) {
					sum += elements[s % eLength];
				}
				set.add(sum);
			}
			cnt++;
		}

		return set.size();
	}

	// 방법 2
	public static int solution2(int[] elements) {
		int eLength = elements.length;

		// 중복되지 않은 합계를 저장하기 위한 Set
		Set<Integer> set = new HashSet<>();

		// 모든 연속 부분 수열의 합을 계산하여 Set에 추가
		for (int start = 0; start < eLength; start++) {
			int sum = 0;
			// start에서 시작하는 모든 길이의 부분 수열 검사
			for (int length = 1; length <= eLength; length++) {
				sum += elements[(start + length - 1) % eLength];
				set.add(sum);
			}
		}

		// 고유한 합의 개수를 반환
		return set.size();
	}

}
