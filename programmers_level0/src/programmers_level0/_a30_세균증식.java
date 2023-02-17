package programmers_level0;

public class _a30_¼¼±ÕÁõ½Ä {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(2, 10)));
		System.out.println((solution(7, 15)));
	}

	public static int solution(int n, int t) {
		int answer = n;
		for (int i = 0; i < t; i++) {
			answer *= 2;
		}
		return answer;
	}
}
