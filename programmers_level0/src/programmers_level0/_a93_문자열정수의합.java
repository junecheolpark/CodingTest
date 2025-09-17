package programmers_level0;


/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181849
 * */

public class _a93_문자열정수의합 {
	public static void main(String[] arg) {
		System.out.println(solution("123456789"));
	}

	public static int solution(String num_str) {
		int answer = 0;
		for (int i = 0; i < num_str.length(); i++) {
			answer += num_str.charAt(i) - '0';
		}
		return answer;
	}

}