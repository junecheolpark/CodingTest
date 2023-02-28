package programmers_level0;

public class _a44_ÇÇÀÚ³ª´²¸Ô±â {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		// int[] arr3 = { 1, 2, 3 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(6)));
		System.out.println((solution(10)));
	}

	public static int solution(int n) {
		int answer = 1;
		while ((6 * answer) % n != 0) {
			answer++;
		}
		return answer;
	}
}