package programmers_level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181926

public class _a73_수조작하기1 {
	public static void main(String[] arg) {
		System.out.println((solution(0, "wsdawsdassw")));
	}

	public static int solution(int n, String control) {
		int answer = n;
		for (int i = 0; i < control.length(); i++) {
			switch (control.charAt(i)) {
			case 'w':
				answer += 1;
				break;
			case 's':
				answer -= 1;
				break;
			case 'd':
				answer += 10;
				break;
			case 'a':
				answer -= 10;
				break;
			}
		}
		return answer;
	}

}