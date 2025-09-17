package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181843
 * */

public class _a90_부분문자열인지확인하기 {
	public static void main(String[] arg) {
		System.out.println(solution("banana", "ana"));
	}

	public static int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }

}