import java.util.Arrays;
import java.util.Scanner;

public class a19_음양더하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] absolutes = { 4,7,12 };
		boolean[] signs = {true,false,true};
		int answer = new Solution19().solution(absolutes, signs);
		System.out.println(answer);

	}
}

class Solution19 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for(int i = 0; i<absolutes.length; i++) {
			answer += absolutes[i] * (signs[i] ? 1:-1); //signs[i] 가 true 면 1 을 곱해주고 아니면 -1을 곱해줌
		}
		return answer;
	}
}
