package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181863
 * */

public class _b104_my_string {
	public static void main(String[] arg) {
		
		System.out.println(solution("masterpiece"));
	}

	public static String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }

}