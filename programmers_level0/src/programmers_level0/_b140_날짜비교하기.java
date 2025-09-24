package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181838
 * */

public class _b140_날짜비교하기 {
	public static void main(String[] arg) {
		int[] arr1 = { 2021, 12, 28 };
		int[] arr2 = { 2021, 12, 29 };
		int[] arr3 = { 2022, 12, 29 };
		int[] arr4 = { 2021, 12, 29 };
		System.out.println((solution(arr1, arr2)));
		System.out.println((solution(arr3, arr4)));
	}

	public static int solution(int[] date1, int[] date2) {
		for (int i = 0; i < date1.length; i++) {
			if (date1[i] < date2[i]) {
				if (date1[i] < date2[i]) {
					return 1;
				} else if (date1[i] > date2[i]) {
					return 0;
				}
			}
		}
		return 0;
	}

}