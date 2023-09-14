package programmers_level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12945
public class a05_피보나치수 {
	public static void main(String[] args) {
		System.out.println((way1(3)));
		System.out.println((way1(5)));
	}

	public static int way1(int n) {
		int num1 = 0, num2 = 1, num3 = 1;

		for (int i = 2; i <= n; i++) {
			num3 = (num1 + num2)% 1234567;
			num1 = num2;
			num2 = num3; 
		}
		return num3;
	}

}
