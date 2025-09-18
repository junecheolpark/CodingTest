package programmers_level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181861
 * */

public class _b100_배열의원소만큼추가히기 {
	public static void main(String[] arg) {
		int[] arr = {5, 1, 4};
		System.out.println(Arrays.toString(solution(arr)));
	}

	public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num2 : arr){
            for(int i = 0; i < num2; i++){
                list.add(num2);
            }
        }
        // 성능은 for문보다 stream이 1.5~2배 차이남
        int[] arr2 = list.stream().mapToInt(Integer::intValue).toArray();
        
        return arr2;
    }

}