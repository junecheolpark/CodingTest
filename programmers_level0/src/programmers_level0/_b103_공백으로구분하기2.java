package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181868
 * */

public class _b103_공백으로구분하기2 {
	public static void main(String[] arg) {
		
		System.out.println(Arrays.toString(solution("i    love  you")));
		System.out.println(Arrays.toString(solution("   programmers  ")));
	}

	public static String[] solution(String my_string) {
		/*
		 * \\s+ → 모든 공백 문자(띄어쓰기, 탭, 줄바꿈) 등 부분을 한 칸 띄어쓰기로 치환
		 * trim() → 문자열 앞뒤 공백 제거
		 */
        return my_string.replaceAll("\\s+", " ").trim().split(" ");
    }

}