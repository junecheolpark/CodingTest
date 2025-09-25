package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181871
 * */

public class _b150_문자열이몇번등장하는지세기 {
	public static void main(String[] arg) {
		System.out.println((solution("banana", "ana")));
		System.out.println((solution("aaaa", "aa")));
	}
	// 방법 1 i뒤로 잘라준뒤 pat을 찾음
	public static int solution(String myString, String pat) {
		int cnt = 0;

		for (int i = 0; i < myString.length(); i++) {
			if (myString.substring(i).startsWith(pat))
				cnt++;
		}
		return cnt;
	}

	// 방법 2 indexof로 해당 idx부터 값을찾음
	public static int solution2(String myString, String pat) {
		int cnt = 0;
		int idx = 0;

		while (true) {
			// index 위치부터 pat를 찾음
			idx = myString.indexOf(pat, idx);
			if (idx == -1)
				break; // 더 이상 없음
			cnt++;
			idx++; // 겹칠 수 있으므로 1만 이동
		}

		return cnt;
	}

}