import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a16_핸드폰번호가리기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phone_number = sc.next();
		String answer = new Solution16().solution(phone_number);
		System.out.println(answer);

	}
}

class Solution16 {
	public String solution(String phone_number) {
        char[] ch = phone_number.toCharArray(); // 폰번호를 char배열로 저장
        for(int i = 0; i<ch.length-4; i++) { // 폰번호 4자리를 제외한 *표시
        	ch[i] = '*';
        }
        return String.valueOf(ch); // String형변환해주고 리턴
    }
}
