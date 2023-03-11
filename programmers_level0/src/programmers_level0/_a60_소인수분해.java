package programmers_level0;

import java.util.ArrayList;
import java.util.Arrays;

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
		int[] answer = {};
		int leth = n / 2, cnt = 2, sum = 1, num = n;
		ArrayList<Integer> list = new ArrayList<>();
		while (true) {
			if (num % cnt == 0) {
				sum *= cnt;
				num /= cnt;
				list.add(cnt);
				cnt = 1;
			}
			if (sum == n) {
				break;
			}
			cnt++;
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		return answer;
	}
}