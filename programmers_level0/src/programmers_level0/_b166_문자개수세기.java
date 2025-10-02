package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181902
 * */

public class _b166_문자개수세기 {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution("Programmers")));
	}

	public static int[] solution(String my_string) {
		 int[] answer = new int[52];
	        
	        for (char ch : my_string.toCharArray()) {
	            if (ch >= 'A' && ch <= 'Z') {
	                answer[ch - 'A']++;
	            } else if (ch >= 'a' && ch <= 'z') {
	                answer[ch - 'a' + 26]++;
	            }
	        }
	        
	        return answer;
	}

}
