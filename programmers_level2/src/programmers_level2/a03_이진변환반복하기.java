package programmers_level2;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/70129
public class a03_이진변환반복하기 {
	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution("110010101001")));
		System.out.println(Arrays.toString(solution("01110")));
		System.out.println(Arrays.toString(solution("1111111")));
	}

	public static int[] solution(String s) {
		int[] answer = {1,0};
		int sLength = 0;

		answer[1] += zeroRemove(s);
		sLength = s.replaceAll("0", "").length();
		String oneStr = Integer.toBinaryString(sLength); // 1길이값 2진수로 변환

		while (sLength > 1) { // 문자열의 길이값이 1일때까지 반복
			answer[1] += zeroRemove(oneStr);
			oneStr = Integer.toBinaryString((oneStr.replaceAll("0", "").length()));
			sLength = oneStr.length();
			answer[0]++;
		}
		return answer;
	}

	public static int zeroRemove(String str) { // 0 개수 확인해서 리턴
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				cnt++;
			}
		}
		return cnt;
	}

}
