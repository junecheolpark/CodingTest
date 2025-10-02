package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181913
 * */

public class _b170_문자열여러번뒤집기 {
	public static void main(String[] arg) {
		int[][] arr = { { 2, 3, }, { 0, 7 }, { 5, 9 }, { 6, 10 } };
		System.out.println((solution("rermgorpsam", arr)));
	}

	public static String solution(String my_string, int[][] queries) {
		StringBuilder sb = new StringBuilder(my_string);
	    
	    for (int[] q : queries) {
	        int s = q[0];
	        int e = q[1];
	        // s~e 구간 뒤집기
	        while (s < e) {
	            char tmp = sb.charAt(s);
	            sb.setCharAt(s, sb.charAt(e));
	            sb.setCharAt(e, tmp);
	            s++;
	            e--;
	        }
	    }
	    
	    return sb.toString();
	}

}
