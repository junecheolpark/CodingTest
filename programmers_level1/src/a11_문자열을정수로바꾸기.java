import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a11_���ڿ��������ιٲٱ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int answer = new Solution11().solution(s);
		System.out.println(answer);

	}
}

class Solution11 {
	public int solution(String s) {
	        return Integer.parseInt(s);
	}
}
