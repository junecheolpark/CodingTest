package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181882
 * */

public class _b113_���ǿ��°Լ�����ȯ�ϱ�1 {
	public static void main(String[] arg) {
		int[] arr = { 1, 2, 3, 100, 99, 98 };
		System.out.println(Arrays.toString(solution(arr)));
	}

	public static int[] solution(int[] arr) {
        for(int i = 0; i< arr.length; i++) {
            if(arr[i] >= 50 && arr[i] % 2 == 0){ //50�̻� ¦��
               arr[i] /= 2;
            }else if(arr[i] < 50 && arr[i] % 2 != 0){ //50�̸� Ȧ��
               arr[i] *= 2;
            }
        }
        return arr;
    }

}