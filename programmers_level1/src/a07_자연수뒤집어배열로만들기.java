import java.util.Scanner;

public class a07_자연수뒤집어배열로만들기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] answer = new Solution7().solution(n);
		// System.out.println(answer);

	}

}

class Solution7 {
	public int[] solution(long n) {
		/*
		String str = Long.toString(n);
		int[] answer = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			answer[i] = (int)n % 10;
			n /= 10;
			System.out.println(answer[i]);
		}
		return answer;
		*/
		String str = String.valueOf(n); //1
		int[] answer = new int[str.length()]; //2
		for(int i =str.length()-1; i>=0; i--) {//3 str길이값~0까지 반복
			answer[str.length()-1-i] = str.charAt(i)- '0';//4 char타입으로 변환해 한글자씩 저장
		}
		return answer;
	}
}
