package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120868
 * */

public class _b177_삼각형의완성조건2 {
	public static void main(String[] arg) {
		int[] arr = { 11, 7 };
		int[] arr2 = { 3, 6 };
		int[] arr3 = { 1, 2 };
		System.out.println(solution(arr));
		System.out.println(solution(arr2));
		System.out.println(solution(arr3));
	}

	public static int solution(int[] sides) {
		int num1 = 0, num2 = 0, max = 0, min = 0;

		// 긴 변과 짧은 변 구하기
		max = Math.max(sides[0], sides[1]);
		min = Math.min(sides[0], sides[1]);

		// 긴 변이 max일 때
		num1 = max - (max - min);
		// x가 긴 변이 일 때
		num2 = (max + min - 1) - max;
		return num1 + num2;
	}

}
