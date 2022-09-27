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
        char ch[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<s.length(); i++) {
        	System.out.println(1);
        	 for(int j = 0 ; j<n; j++) {
        		 System.out.println((char)(ch[i]-25));
        		 if(ch[i] == ' ') {
        			 sb.append(ch[i]);
        		 }else if(ch[i]!='z' && ch[i]!='Z') {
        			 sb.append((char)(ch[i] + 1));
        		 }else {
        			 sb.append((char)(ch[i] -25));
        		 }
        		 
        		 
        		
        	 }
        	
        }
        return String.valueOf(sb.toString());
    }
}
