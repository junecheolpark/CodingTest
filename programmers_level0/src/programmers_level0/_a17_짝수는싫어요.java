package programmers_level0;

import java.util.*;

public class _a17_Â¦¼ö´Â½È¾î¿ä {
	public static void main(String[] arg) {
		// int[] arr = { 149, 180, 192, 170 };
		// String str = "hello";
		System.out.println(Arrays.toString(solution(10)));
	}

	public static int[] solution(int n) {
		List<Integer> list = new ArrayList<>();
		int[] answer = new int[(n%2 == 0) ? n / 2 : n / 2 + 1];
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0)
				System.out.println(i);
				list.add(i);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			//answer[i] = list.get(i);
		}
		return answer;
	}
}
