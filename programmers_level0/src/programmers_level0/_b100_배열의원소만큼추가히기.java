package programmers_level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181861
 * */

public class _b100_�迭�ǿ��Ҹ�ŭ�߰����� {
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
        // ������ for������ stream�� 1.5~2�� ���̳�
        int[] arr2 = list.stream().mapToInt(Integer::intValue).toArray();
        
        return arr2;
    }

}