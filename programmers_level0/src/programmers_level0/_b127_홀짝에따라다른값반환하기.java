package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181935
 * */

public class _b127_홀짝에따라다른값반환하기 {
	public static void main(String[] arg) {
		System.out.println((solution(7)));
	}

	// 방법1
	public static int solution(int n) {
        boolean check = (n % 2 == 0); // 짝수체크
        int num = check ? 0 : 1; // 짝수면 0: 1
        int answer = 0;
        for (int i = num; i <= n; i = i+2){
                answer += (check) ? i * i : i;      
        }
        return answer;
	}

}