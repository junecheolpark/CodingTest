package programmers_level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _a60_소인수분해 {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		// int[] arr1 = { 3, 76, 24 };
		// int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
		// int[] arr3 = { 30, 10, 23, 6, 100 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println(Arrays.toString(solution(12)));
		System.out.println(Arrays.toString(solution(17)));
		System.out.println(Arrays.toString(solution(420)));
		// System.out.println((solution("1a2b3c4d123Z")));
	}

	public static int[] solution(int n) {
		int leth = n / 2, cnt = 2, sum = 1, num = n;
		Set <Integer> set = new HashSet<Integer>();
		while (true) {
			if (num % cnt == 0) { // cnt를 나눈 num값의 나머지가 0이면
				sum *= cnt; // sum 값이 n값과 같아질떄까지
				num /= cnt; // 
				set.add(cnt); // set을 이용한 중복된 값은 제거
				cnt = 1;
			}
			if (sum == n) {
				break;
			}
			cnt++;
		}
		List<Integer> list = new ArrayList<Integer>(set); // list에담아줘 정렬
		Collections.sort(list);
		int[] answer = new int[list.size()]; // 배열에 넣어줘 리턴
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}