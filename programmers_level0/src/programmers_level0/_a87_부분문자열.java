package programmers_level0;
/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181842
 * */

public class _a87_�κй��ڿ� {
	public static void main(String[] arg) {
		System.out.println(solution("abc", "aabcc"));
//		System.out.println(Arrays.toString(solution(arr, "ef")));
	}

	public static int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0 ;
    }

}