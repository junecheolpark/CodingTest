import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a16_�ڵ�����ȣ������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phone_number = sc.next();
		String answer = new Solution16().solution(phone_number);
		System.out.println(answer);

	}
}

class Solution16 {
	public String solution(String phone_number) {
        char[] ch = phone_number.toCharArray(); // ����ȣ�� char�迭�� ����
        for(int i = 0; i<ch.length-4; i++) { // ����ȣ 4�ڸ��� ������ *ǥ��
        	ch[i] = '*';
        }
        return String.valueOf(ch); // String����ȯ���ְ� ����
    }
}
