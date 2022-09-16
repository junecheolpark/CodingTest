import java.util.Arrays;
import java.util.Scanner;

public class a20_수박수박수박수박수박수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String answer = new Solution20().solution(n);
		System.out.println(answer);

	}
}

class Solution20 {
	public String solution(int n) {

        String result = "";
        for(int i = 0; i<n; i++){
            result += i % 2 == 0 ? "수" : "박"; // 짝수일때는 "수"홀수일때는 "박"을 출력해준다
        }
        return result;
	}
}
