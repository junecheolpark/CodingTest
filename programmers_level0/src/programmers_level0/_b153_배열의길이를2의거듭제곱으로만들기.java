package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181857
 * */

public class _b153_배열의길이를2의거듭제곱으로만들기 {
	public static void main(String[] arg) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		System.out.println((Arrays.toString(solution(arr1))));
	}

	public static int[] solution(int[] arr) {
		int length = arr.length;
		int pow = 1;

		// length보다 크거나 같은 2의 거듭제곱 찾기
		while (pow < length) {
			pow *= 2;
		}
		/*방법1 새 배열 생성 x 빠름 (복사만)*/
		int[] result = new int[pow]; // 새로운 배열 생성, 0으로 초기화됨
		System.arraycopy(arr, 0, result, 0, length); // 기존 배열 복사
		return result;
		/**/
		
		/*방법2 새 배열 생성 o 약간 느림 (배열 생성 포함)/
		 return Arrays.copyOf(arr, length);
		/**/
	}

}