package programmers_level0;

public class _a25_문자안에문자열 {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution("AbcAbcA", "AAA")));
		System.out.println((solution("ab6CDE443fgh22iJKlmn1o", "6CD")));
	}

	public static int solution(String str1, String str2) {
		int answer = 2, Length1 = 0, Length2 = 0;
		Length1 = str1.length();
		Length2 = str2.length();

		for (int i = 0; i < Length1 - (Length2 - 1); i++) {
			int cnt = 0;
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(j + i) == str2.charAt(j)) {
					cnt++;
				}
			}
			if (cnt == Length2) {
				answer = 1;
			}
		}
		return answer;
	}
}

// return (str1.contains(str2)? 1: 2);