package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181890
 * */

public class _b167_왼쪽오른쪽 {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution(new String[] {"u", "u", "l", "r"})));
	}

	public static String[] solution(String[] str_list) {
		for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                // "l" 왼쪽 부분
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                // "r" 오른쪽 부분
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        // "l"이나 "r"이 없는 경우
        return new String[0];
	}

}
