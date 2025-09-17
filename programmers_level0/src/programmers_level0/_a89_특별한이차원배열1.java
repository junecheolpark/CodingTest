package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181833
 * */

public class _a89_특별한이차원배열1 {
	public static void main(String[] arg) {
		System.out.println(Arrays.deepToString(solution(3)));
	}

	public static int[][] solution(int n) {
        int[][] answer = new int [n][n];
        for (int i = 0; i<n; i++){
            answer[i][i] = 1;
        }
        return answer;
    }

}