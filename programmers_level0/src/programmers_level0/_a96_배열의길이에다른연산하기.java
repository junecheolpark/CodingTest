package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181854
 * */

public class _a96_�迭�Ǳ��̿��ٸ������ϱ� {
	public static void main(String[] arg) {
		int[] arr = { 49, 12, 100, 276, 33 };
		System.out.println(Arrays.toString(solution(arr, 27)));
	}

	public static int[] solution(int[] arr, int n) {
        int num = arr.length % 2 == 0 ? 1 : 0 ;  // ¦����� Ȧ�����ͽ���
        for (int i = num ; i < arr.length; i= i + 2){
            arr[i] += n;
        }
        return arr;
    }

}