package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181920
 * */

public class _b126_카운트업 {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution(3, 10)));
	}

	// 방법1
	public static int[] solution(int start_num, int end_num) {
		 int[] answer = new int [end_num - start_num +1];
	        for (int i = 0 ; i < answer.length; i++){ // 0 ~ 7
	            answer[i] += i+start_num;
	        }
	        return answer;
	}

}