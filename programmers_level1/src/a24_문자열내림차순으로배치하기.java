import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a24_���ڿ������������ι�ġ�ϱ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String answer = new Solution24().solution(s);
		System.out.println(answer);

	}
}

class Solution24 {
	public String solution(String s) {
		String[] arr = s.split(""); // String�迭�� ��ȯ
		Arrays.sort(arr, Collections.reverseOrder());
		return String.join("", arr);
	}
}
