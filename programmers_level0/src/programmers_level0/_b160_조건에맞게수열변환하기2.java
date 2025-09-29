package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181881
 * */

public class _b160_조건에맞게수열변환하기2 {
	public static void main(String[] arg) {
		System.out.println((solution(new int[] { 1, 2, 3, 100, 99, 98 })));
	}

	// 배열 비교 -> 1차원 배열 → Arrays.equals(), 2차원 이상 배열 → Arrays.deepEquals()
	// 배열 복사 -> System.arraycopy(a, 0, b, 0, a.length), Arrays.copyOf()

	public static int solution(int[] arr) {
		int cnt = 0;
		while (true) {
			// newArr while밖에서 선언시arr 과 newArr 이 동일 객체를 가리켜 안에서 선언
			int[] newArr = new int[arr.length]; 
			for (int i = 0; i < arr.length; i++) { // 메서드 arr 실행
				newArr[i] = arr(arr[i]);
			}
			if (Arrays.equals(arr, newArr)) { // 두배열이같다면 리턴
				return cnt;
			} else { // 아니라면 복사
				arr = newArr;
			}
			cnt++;
		}
	}

	public static int arr(int x) {
		if (x >= 50 && x % 2 == 0) { // 50보다 크거나 같은 짝수
			return x / 2;
		} else if (x < 50 && x % 2 != 0) { // 50보다 작은 홀수
			return (x * 2) + 1;
		}
		return x;
	}
}
