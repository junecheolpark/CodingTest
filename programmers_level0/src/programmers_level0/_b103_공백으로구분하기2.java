package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181868
 * */

public class _b103_�������α����ϱ�2 {
	public static void main(String[] arg) {
		
		System.out.println(Arrays.toString(solution("i    love  you")));
		System.out.println(Arrays.toString(solution("   programmers  ")));
	}

	public static String[] solution(String my_string) {
		/*
		 * \\s+ �� ��� ���� ����(����, ��, �ٹٲ�) �� �κ��� �� ĭ ����� ġȯ
		 * trim() �� ���ڿ� �յ� ���� ����
		 */
        return my_string.replaceAll("\\s+", " ").trim().split(" ");
    }

}