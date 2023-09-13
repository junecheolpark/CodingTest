package programmers_level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12924
public class a04_숫자의표현 {
	public static void main(String[] args) {
		System.out.println((solution(15)));
	}

	public static int solution(int n) {
		int answer = 0;
		int sum = 0;
		int j = 0;
		for (int i = 1; i <= n; i++) {
			sum = i;
			j = i;
			while (true) {
				System.out.println(sum);
				if (sum == n) {
					answer++;
				} else if (sum > n) {
					break;
				}
				j += 1;
				sum += j;
			}
		}
		return answer;
	}
	
}
