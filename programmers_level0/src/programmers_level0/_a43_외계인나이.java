package programmers_level0;

public class _a43_외계인나이 {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		// int[] arr3 = { 1, 2, 3 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(23)));
		System.out.println((solution(51)));
	}

	public static String solution(int age) {
		StringBuilder sb = new StringBuilder();
		String answer = Integer.toString(age);
		for (int i = 0; i < answer.length(); i++) {
			sb.append((char)(answer.charAt(i) + 49));
		}
		return sb.toString();
	}
}
