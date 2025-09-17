package programmers_level0;
/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181847
 * */

public class _a86_0¶¼±â {
	public static void main(String[] arg) {
		System.out.println(solution("0010"));
//		System.out.println(Arrays.toString(solution(arr, "ef")));
	}

	public static String solution(String n_str) {
		int cnt = 0;
		while (cnt < n_str.length() && n_str.charAt(cnt) == '0') {
			cnt++;
		}
		return n_str.substring(cnt);
	}

}