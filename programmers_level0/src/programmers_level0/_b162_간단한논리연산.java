package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181917
 * */

public class _b162_간단한논리연산 {
	public static void main(String[] arg) {
		System.out.println((solution(false, true, true, true)));
	}

	public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean as1 = true;
        boolean as2 = true;
        as1 = x1 || x2;
        as2 = x3 || x4;
        return as1 && as2;
    }

}
