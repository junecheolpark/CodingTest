package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181888
 * */

public class _b141_n개의간격의원소들 {
	public static void main(String[] arg) {
		int[] arr = {4, 2, 6, 1, 7, 6};
		System.out.println((Arrays.toString(solution(arr, 2))));
	}

	public static int[] solution(int[] num_list, int n) {
        int length = (num_list.length + n - 1) / n; // 간격 n으로 뽑을 개수 계산
        int[] answer = new int [length];
        for (int i = 0; i < length; i++){
            answer[i] = num_list[i*n];
        }
        return answer;
	}

}