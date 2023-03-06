package programmers_level0;

public class _a56_kÀÇ°³¼ö {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		int[] arr3 = { 3, 10, 28 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(1, 13, 1)));
		System.out.println((solution(10, 50, 5)));
		System.out.println((solution(3, 10, 2)));
	}

	public static int solution(int i, int j, int k) {
		int cnt = 0;
		String str = "";

		for (int n = i; n <= j; n++) {
			if (n < 10) {
				if (n == k) cnt++;
			} else {
				str = String.valueOf(n);
				for (int b = 0; b < str.length(); b++) {
					if (str.charAt(b) - '0' == k) cnt++;
				}
			}
		}

		return cnt;
	}
}