import java.util.Scanner;

public class a32_이상한문자만들기 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String s = "try hello world";
		String answer = new Solution32().solution(s);
		System.out.println(answer);
	}
}

class Solution32 {
    public String solution(String s) {
    	/*/ 안되는 이유가 뭘까
        char[] ch = {};
        String[] arr = s.split(" ");
        
        for(int i = 0; i<arr.length; i++) {
        	StringBuilder sb = new StringBuilder();
        	ch = arr[i].toCharArray();
        	 for(int j = 0; j<arr[i].length(); j++) {
        		 if(j%2==0) {
        			 sb.append(String.valueOf(ch[j]).toUpperCase());
        		 }else {
        			 sb.append(String.valueOf(ch[j]).toLowerCase());
        		 }
        		
        	 }
        	 arr[i] = sb.toString();
        }
        return String.join(" ",arr);
        /**/
    	
            String[] str = s.split(""); // 각각 배열로 저장
            StringBuilder sb = new StringBuilder();
            int idx = 0;
            for(int i=0; i<str.length; i++) {
                if(str[i].equals(" ")) { // 공백이라면 인덱스 초기화
                    sb.append(str[i]);
                    idx = 0;
                } else if(idx % 2 == 0) { // 인덱스가 짝수라면 대문자변경후 index++
                    sb.append(str[i].toUpperCase());
                    idx++;
                } else if(idx % 2 != 0) { // 인덱스가 홀수라면 대문자 일수도 있으니 소문자변경후 index++
                    sb.append(str[i].toLowerCase());
                    idx++;
                }
                
            } 
            return sb.toString(); // 
        }
