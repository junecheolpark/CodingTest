package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181909
 * */

public class _b131_n��°���Һ��� {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution("banana")));
	}

	// ���1
	public static String[] solution(String my_string) {
		int mLeng = my_string.length(); // 6
		String[] answer = new String[mLeng];
		for (int i = 0; i < mLeng; i++) { // 0~5
			answer[i] = my_string.substring(i); 				//1) i ���� �ڸ���
			// answer[i] = my_string.substring(mLeng - 1 - i); 	//2) �ڿ������� �ڸ���
			// answer[i] = my_string.substring(i, mLeng); 		//3) i~ mLeng������ �ڸ��� 2�͵���
		}
		Arrays.sort(answer);
		return answer;
	}

}