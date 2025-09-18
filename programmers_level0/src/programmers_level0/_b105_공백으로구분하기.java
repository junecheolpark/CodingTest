package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181869
 * */

public class _b105_공백으로구분하기 {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution("i love you")));
	}

	public static String[] solution(String my_string) {
        return my_string.split("[ ]");
    }

}