package programmers_level0;

import java.util.*;

public class _a45_약수구하기 {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		// int[] arr3 = { 1, 2, 3 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println(Arrays.toString(solution(24)));
		System.out.println(Arrays.toString(solution(29)));
	}

	public static int[] solution(int n) {
		int num = (int) Math.sqrt(n);
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 1; i <= num; i++) {
			if (n % i == 0) { // 약수 중 작은 수 저장
				arr.add(i);
				if (n / i != i) { // 약수 중 큰 수 저장
					arr.add(n / i);
				}
			}
		}
		Collections.sort(arr);
		int[] answer = new int[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i);
		}
		return answer;
	}
}