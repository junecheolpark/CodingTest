//https://school.programmers.co.kr/learn/courses/30/lessons/12921

public class a55_소수찾기 {
	public static void main(String[] arg) {
		System.out.println(solution(17));
	}

	public static boolean minority(int number) {
		if (number == 2 || number == 3 || number == 5 || number == 7) {
            return true;
        } else if (number < 2 || number % 2 == 0) {
            return false;
        }

		// 제곱을 구해 홀수만 계산해줌 23 = 4.795.... -> 23%3 != 0 이므로 소수
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
	}

	public static int solution(int n) {
		int answer = 0;
		for (int i = 2; i <= n; i++) {
			if (minority(i))
				answer++;
		}
		return answer;
	}
}
