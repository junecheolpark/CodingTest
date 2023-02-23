package programmers_level0;

public class _a40_최빈값구하기 {
	public static void main(String[] arg) {
		int[] arr3 = { 1 };
		int[] arr2 = { 1, 2, 3, 3, 3, 4 };
		int[] arr = { 1, 1, 2, 2 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(arr2)));
		System.out.println((solution(arr)));
		System.out.println((solution(arr3)));
	}

	public static int solution(int[] array) {
		int result = 0;
		int arrayMax = 0;
		for (int i = 0; i < array.length; i++) { // 매개변수로 들어온 배열의 최대값을 구함
			if (array[i] > arrayMax) {
				arrayMax = array[i];
			}
		}
		int[] count = new int[arrayMax + 1]; // 크기가 최대값+1 인 배열을 하나 생성

		for (int j = 0; j < array.length; j++) { // 매개변수 배열에 들어있는 정수번째마다
			count[array[j]]++; // 새로 만든 배열에 1을 더해줌
		}

		int countMax = 0;
		for (int m = 0; m < count.length; m++) { // 새로만든 배열의 최대값을 구함
			if (count[m] > countMax) {
				countMax = count[m]; // 새로만든 배열의 m번째 요소가 최대값이라면
				result = m; // 매개변수로 들어온 배열의 m 이 최빈값
			}
		}

		int rep = 0;
		for (int n = 0; n < count.length; n++) { // 그 최대값이 중복으로 있는지를 확인
			if (countMax == count[n]) { // 중복이 없다면 rep는 1,
				rep++; // 중복이 있다면 reo는 2이상
			}
		}
		if (rep != 1) {
			result = -1;
		}
		return result;
	}
}
/*
 * char temp = my_string.charAt(num1); StringBuilder sb = new
 * StringBuilder(my_string); sb.setCharAt(num1, my_string.charAt(num2));
 * sb.setCharAt(num2, temp); return String.valueOf(sb);
 */
