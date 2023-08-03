//https://school.programmers.co.kr/learn/courses/30/lessons/136798

public class a58_기사단원의무기 {
	public static void main(String[] arg) {
		System.out.println(solution(5, 3, 2));
		System.out.println(solution(10, 3, 2));

	}

	public static int solution(int number, int limit, int power) {
		int answer = 0;
		int maxPower = 0;
		for (int i = 1; i <= number; i++) {
			maxPower = cnt(i);
			maxPower = (maxPower > limit ? power : maxPower);
			answer += maxPower;
		}

		return answer;
	}

	public static int cnt(int number) { // number 약수의 개수를 구함
		int cnt = 0;
		for (int i = 1; i * i <= number; i++) {
			if (number % i == 0) {
				int divisor2 = number / i;
				if (i != divisor2) {
					cnt += 2;
				} else {
					cnt++;
				}
			}
		}
		return cnt;
	}

}
