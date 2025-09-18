package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181865
 * */

public class _b107_간단한식계산하기 {
	public static void main(String[] arg) {
		System.out.println(solution("43 + 12"));
	}

	public static int solution(String binomial) {
		 // 공백 기준으로 나누기
		String[] arr = binomial.split(" ");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[2]);

		 // 연산자에 따라 계산
		if (arr[1].equals("+")) {
			return num1 + num2;
		} else if (arr[1].equals("-")) {
			return num1 - num2;
		} else {
			return num1 * num2;
		}
	}

}