package programmers_level0;

public class _a16_머쓱이보다키큰사람 {
	public static void main(String[] arg) {
		int[] arr = { 149, 180, 192, 170 };
		// String str = "hello";
		System.out.println((solution(arr, 167)));
	}

	public static int solution(int[] array, int height) {
		int answer = 0;
		for (int num : array) {
			if (num > height)
				answer++;
		}
		return answer;
	}
}

