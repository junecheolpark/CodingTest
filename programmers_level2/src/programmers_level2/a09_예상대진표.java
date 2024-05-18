package programmers_level2;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12985
public class a09_예상대진표 {
	public static void main(String[] args) {
		System.out.println(solution(8, 4, 7)); // 출력: 3
	}

    public static int solution(int N, int A, int B) {
    	int answer = 0;
    	
		while (A != B) {
			A -= A / 2;
			B -= B / 2;
			answer++;
		}
    	
        return answer;
    }

}

