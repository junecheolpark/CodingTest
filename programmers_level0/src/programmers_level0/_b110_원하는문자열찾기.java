package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181878
 * */

public class _b110_���ϴ¹��ڿ�ã�� {
	public static void main(String[] arg) {
		System.out.println(solution("AbCdEfG", "aBc"));
	}

	public static int solution(String myString, String pat) {
		return (myString.toLowerCase()).contains(pat.toLowerCase()) ? 1 : 0;
    }

}