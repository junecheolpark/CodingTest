package programmers_level0;

import java.util.Arrays;

public class _a55_가까운수 {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		int[] arr3 = { 3, 10, 28 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(arr3, 28)));
	}

	public static int solution(int[] array, int n) {
		int num1 = 0, num2 = 0;
		// 오름차 순 정렬
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= n) { // n의 위치를 찾는다
				continue;
			} else { // i의 앞과 뒤의 값을 계산하여 비교해 리턴해준다
				num1 = n - array[i - 1];
				num2 = array[i] - n;

				if (num1 > num2) {
					return array[i];
				} else if (num1 < num2) {
					return array[i - 1];
				} else if (num1 == num2) {
					return array[i - 1];
				}
			}
		}
		return array[array.length - 1];
	}
}