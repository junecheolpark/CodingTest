package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181909
 * */

public class _b131_n번째원소부터 {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution("banana")));
	}

	// 방법1
	public static String[] solution(String my_string) {
		int mLeng = my_string.length(); // 6
		String[] answer = new String[mLeng];
		for (int i = 0; i < mLeng; i++) { // 0~5
			answer[i] = my_string.substring(i); 				//1) i 부터 자르기
			// answer[i] = my_string.substring(mLeng - 1 - i); 	//2) 뒤에서부터 자르기
			// answer[i] = my_string.substring(i, mLeng); 		//3) i~ mLeng값까지 자르기 2와동인
		}
		Arrays.sort(answer);
		return answer;
	}

}