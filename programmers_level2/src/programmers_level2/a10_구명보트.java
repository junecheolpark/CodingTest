package programmers_level2;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/42885
public class a10_구명보트 {
	public static void main(String[] args) {
		int[] people = { 70, 50, 80, 50 };
		// 배열의 내용을 출력
		System.out.println(solution(people, 100)); // 출력: 3
	}

	public static int solution(int[] people, int limit) {
		int answer = 0;
		int a = 0;
		int b = people.length - 1;
		Arrays.sort(people);

		//가장 가벼운 사람 + 가장 무거운사람을 비교하며 차이가 가장 적은 순으로 비교  
		while (a <= b) {
			if (people[a] + people[b] <= limit) {
				a++;
			}
			b--;
			answer++;
		}

		return answer;
	}

}

