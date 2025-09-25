package programmers_level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181860
 * */

public class _b142_빈배열에추가삭제하기 {
	public static void main(String[] arg) {
		int[] arr1 = {3, 2, 4, 1, 3};
		boolean[] arr2 = {true, false, true, false, false};
		System.out.println((Arrays.toString(solution(arr1, arr2))));
	}

	public static int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <arr.length; i++){
            if(flag[i]){
                // true면 arr[i]를 arr[i] * 2번 추가
                for (int j = 0; j <arr[i] * 2; j++){
                    list.add(arr[i]);
                }
            }else{
                // false면 뒤에서 arr[i]개 제거
                for (int j = 0; j <arr[i]; j++){ 
                 list.remove(list.size() - 1);
                }
            }
           
        }
        // List → int[] 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}