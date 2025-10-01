package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181837
 * */

public class _b163_커피심부름 {
	public static void main(String[] arg) {
		System.out.println((solution(new String[] {"cafelatte", "americanoice", "hotcafelatte", "anything"})));
	}

	//"확인 횟수 많다" → Set
	//"확인 몇 번 안 한다" → equals 직접 비교
	public static int solution(String[] order) {
        int answer = 0 ;
        for (String o : order) {
            if (o.contains("americano") || o.equals("anything")) {
                answer += 4500;
            } else if (o.contains("cafelatte")) {
                answer += 5000;
            }
        }
        return answer;
    }

}
