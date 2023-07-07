//https://school.programmers.co.kr/learn/courses/30/lessons/134240

public class a47_콜라문제 {
	public static void main(String[] arg) {
		System.out.println(solution(2, 1, 20));
		System.out.println(solution(3, 1, 20));
	}

	public static int solution(int a, int b, int total) {
		int rest = 0;
		int bottle = total;
		int changedDrinks = 0;
		int totalDrinks = 0;

		while (bottle >= a) {
			changedDrinks = (bottle / a) * b; // 콜라로 바꾼 수
			rest = bottle % a; // 나머지 병 수
			bottle = changedDrinks + rest; // 전체 병수
			totalDrinks += changedDrinks; 
		}
		return totalDrinks;
	}
}
