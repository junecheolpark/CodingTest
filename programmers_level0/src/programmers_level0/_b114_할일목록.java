package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181885
 * */

public class _b114_할일목록 {
	public static void main(String[] arg) {
		String[] arr = { "problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] arr2 = { true, false, true, false };
		System.out.println(Arrays.toString(solution(arr, arr2)));
	}

	public static String[] solution(String[] todo_list, boolean[] finished) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< todo_list.length; i++){
            if(!finished[i]){
                sb.append(todo_list[i] + "-");
            }
        }
        
        return sb.toString().split("-");
    }

}