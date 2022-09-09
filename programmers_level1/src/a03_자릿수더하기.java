import java.util.Scanner;

public class a03_자릿수더하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int answer = new Solution3().solution(n);
		int answer = new Solution3_1().solution(n);
		System.out.println(answer);

	}

}

class Solution3 {
	public int solution(int n) {
		int answer = 0;
		while(n!=0) {// n 이 0이 아니라면
			answer += n%10; //1의자리수를 구해 더해줌
			n /= 10; // 10씩 나눠줌
			System.out.println(answer);
		}
		return answer;
	}
}
class Solution3_1 {
	public int solution(int n) {
		int answer = 0;
		while(n!=0) {// n 이 0이 아니라면
			answer += n%10; //1의자리수를 구해 더해줌
			n /= 10; // 10씩 나눠줌
			System.out.println(answer);
		}
		return answer;
	}
}