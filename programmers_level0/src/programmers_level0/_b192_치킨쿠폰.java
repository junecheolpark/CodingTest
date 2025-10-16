package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120884
 * */

public class _b192_치킨쿠폰 {
	public static void main(String[] arg) {
		System.out.println((solution(100)));

	}

	public static int solution(int chicken) {
		int answer = 0;
		int coupon = chicken;

		while (coupon >= 10) {
			int service = coupon / 10; // 서비스 치킨 수
			int rest = coupon % 10; // 남는 쿠폰 수

			answer += service;
			coupon = service + rest; // 새로 받은 쿠폰 + 남은 쿠폰
		}

		return answer;
	}
}
