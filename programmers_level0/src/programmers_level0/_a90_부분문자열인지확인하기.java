package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181843
 * */

public class _a90_�κй��ڿ�����Ȯ���ϱ� {
	public static void main(String[] arg) {
		System.out.println(solution("banana", "ana"));
	}

	public static int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }

}