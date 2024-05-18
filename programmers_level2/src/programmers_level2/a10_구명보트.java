package programmers_level2;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/42885
public class a10_����Ʈ {
	public static void main(String[] args) {
		int[] people = { 70, 50, 80, 50 };
		// �迭�� ������ ���
		System.out.println(solution(people, 100)); // ���: 3
	}

	public static int solution(int[] people, int limit) {
		int answer = 0;
		int a = 0;
		int b = people.length - 1;
		Arrays.sort(people);

		//���� ������ ��� + ���� ���ſ����� ���ϸ� ���̰� ���� ���� ������ ��  
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

