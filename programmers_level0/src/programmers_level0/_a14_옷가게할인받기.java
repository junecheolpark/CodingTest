package programmers_level0;

public class _a14_옷가게할인받기 {
	public static void main(String[] arg) {
		// int[] arr = { 199, 72, 222 };
		// String str = "hello";
		System.out.println((solution(150000)));
	}

	public static int solution(int price) {
		int answer = 0;
		if (price >= 500000)
			answer = (int) (price * 0.8);
		else if (price >= 300000)
			answer = (int) (price * 0.9);
		else if (price >= 100000)
			answer = (int) (price * 0.95);
		else
			answer = price;

		return answer;
	}
}
