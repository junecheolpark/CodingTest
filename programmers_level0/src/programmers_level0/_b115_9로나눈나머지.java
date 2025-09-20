package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181914
 * */

public class _b115_9로나눈나머지 {
	public static void main(String[] arg) {
		System.out.println(solution("123"));
	}

	public static int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++){
            answer += (number.charAt(i) -'0');
        }
        return answer % 9;
    }

}