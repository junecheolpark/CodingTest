import java.util.Arrays;
import java.util.Scanner;

public class a19_������ϱ� {
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
			answer += absolutes[i] * (signs[i] ? 1:-1); //signs[i] �� true �� 1 �� �����ְ� �ƴϸ� -1�� ������
		}
		return answer;
	}
}
