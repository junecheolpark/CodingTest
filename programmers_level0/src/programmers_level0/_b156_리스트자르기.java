package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181897
 * */

public class _b156_리스트자르기 {
	public static void main(String[] arg) {
		int[] arr1 = { 1, 5, 2 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println((Arrays.toString(solution(4, arr1, arr2))));
	}

	public static int[] solution(int n, int[] slicer, int[] num_list) {
		int a = slicer[0], b = slicer[1], c = slicer[2];
		if (n == 1) { // num_list의 0번 인덱스부터 b번 인덱스까지
			return Arrays.copyOfRange(num_list, 0, b + 1);
		} else if (n == 2) {// num_list의 a번 인덱스부터 마지막 인덱스까지
			return Arrays.copyOfRange(num_list, a, num_list.length);
		} else if (n == 3) {// num_list의 a번 인덱스부터 b번 인덱스까지
			return Arrays.copyOfRange(num_list, a, b + 1);
		} else { // num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
			int size = (b - a) / c + 1;
			int[] result = new int[size];
			for (int i = a, idx = 0; i <= b; i += c) {
				result[idx++] = num_list[i];
			}
			return result;
		}
	}

}