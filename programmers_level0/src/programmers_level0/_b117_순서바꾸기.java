package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181891
 * */

public class _b117_순서바꾸기 {
	public static void main(String[] arg) {
		int[] arr = { 2, 1, 6 };
		int[] arr2 = {5, 2, 1, 7, 5};
		System.out.println(Arrays.toString(solution(arr, 1)));
		System.out.println(Arrays.toString(solution(arr2, 3)));
	}

	public static int[] solution(int[] num_list, int n) {
        int numL = num_list.length; 
        int cnt = 0;
        int[] answer = new int [numL]; 
        for (int i = n; i< numL; i++){ 
            answer[cnt++] = num_list[i];
        }
        for (int j = 0; j < n; j++){ 
            answer[cnt++] = num_list[j]; 
        }
        return answer;
    }

}