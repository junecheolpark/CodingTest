package programmers_level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _a66_잘라서배열로저장하기 {
	public static void main(String[] arg) {
		// int[] arr1 = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));
		System.out.println(Arrays.toString(solution("abcdef123", 3)));
	}

	public static String[] solution(String my_str, int n) {
		int leth = (my_str.length() + n - 1) / n;
        String[] answer = new String[leth];

        for (int i = 0; i < leth; i++) {
            int start = n * i;
            int end = start + n >= my_str.length()? my_str.length(): start + n;
            answer[i] = my_str.substring(start, end);
        }

        return answer;
		/*/
		List<String> answer = new ArrayList();
		for (int i = 0; i < (my_str.length() / n); i++) {
			answer.add(my_str.substring((n * i), (n * (i + 1))));
		}
		if (my_str.length() % n != 0) {
			answer.add(my_str.substring((my_str.length() / n) * n));
		}
		return answer.toArray(new String[0]);

		/**/
	}
}
