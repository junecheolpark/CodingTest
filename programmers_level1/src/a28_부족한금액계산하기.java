import java.util.Scanner;

public class a28_부족한금액계산하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int money = sc.nextInt();
		int count = sc.nextInt();
		long answer = new Solution28().solution(price, money, count);
		System.out.println(answer);

	}
}
// 3 20 4
class Solution28 {
	public long solution(int price, int money, int count) {
		long answer = 0;
		long sum = 0;
		for (int i = 1; i <= count; i++) { // count 만큼 배로 받을때 그합을 sum에 더하며 정의해줌
			sum += price * i;
		}
		answer = (money-sum); // answer 에 가지고있는 money에서 sum값을 빼줌
		
		return answer < 0 ? -answer : 0; // answer값이 0보다 작으면 -answer을 아니면 0을반환
	}
}