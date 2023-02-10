package programmers_level0;

public class _a09_최대값만들기 {
	public static void main(String[] arg) {
		int[] arr = { 0, 31, 24, 10, 1, 9 };
		// String str = "hello";
		System.out.println(solution1(arr));
	}

	public static int solution1(int[] numbers) {
		int answer = 0, num = 0, length = numbers.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (i != j)
					num = numbers[i] * numbers[j];
				if (answer < num)
					answer = num;
				// System.out.println(numbers[i] + " * " + numbers[j] + " = " + num);
			}
		}
		return answer;
	}
}
/*/  
 // 방법 2. 배열 오름차순으로 정렬
 
Arrays.sort(numbers);
// 정렬한 배열의 마지막 전 숫자와 마지막 숫자 곱을 구한다.
return numbers[numbers.length-2]*numbers[numbers.length-1];
/**/
