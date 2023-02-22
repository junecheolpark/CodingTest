package programmers_level0;

public class _a37_주사위의개수 {
	public static void main(String[] arg) {
		int[] arr = { 10, 8, 6 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(arr, 3)));
	}

	public static int solution(int[] box, int n) {
		int answer = 1;
		for (int i = 0; box.length > i; i++) {
				answer *= (box[i] / n);

		}
		return answer;
	}
}