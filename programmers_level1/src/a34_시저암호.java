import java.util.Arrays;
import java.util.Scanner;

public class a34_시저암호 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String s = "a B z";
		int n = 4;

		String answer = new Solution34().solution(s, n);
		System.out.println(answer);
	}
}

class Solution34 {
	public String solution(String s, int n) {
		 String answer = "";
         
         for(int i=0; i<s.length(); i++) {
             char ch = s.charAt(i);
             if(Character.isLowerCase(ch)) { //소문자
                 ch = (char) ((ch - 'a' + n) % 26 + 'a');
             } else if(Character.isUpperCase(ch)) { //대문자
                 ch = (char) ((ch - 'A' + n) % 26 + 'A');
             }
             
             answer += ch;
         }
             
         
         return answer;
	}
}
