import java.util.Scanner;

public class a32_�̻��ѹ��ڸ���� {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String s = "try hello world";
		String answer = new Solution32().solution(s);
		System.out.println(answer);
	}
}

class Solution32 {
    public String solution(String s) {
    	/*/ �ȵǴ� ������ ����
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
    	
            String[] str = s.split(""); // ���� �迭�� ����
            StringBuilder sb = new StringBuilder();
            int idx = 0;
            for(int i=0; i<str.length; i++) {
                if(str[i].equals(" ")) { // �����̶�� �ε��� �ʱ�ȭ
                    sb.append(str[i]);
                    idx = 0;
                } else if(idx % 2 == 0) { // �ε����� ¦����� �빮�ں����� index++
                    sb.append(str[i].toUpperCase());
                    idx++;
                } else if(idx % 2 != 0) { // �ε����� Ȧ����� �빮�� �ϼ��� ������ �ҹ��ں����� index++
                    sb.append(str[i].toLowerCase());
                    idx++;
                }
                
            } 
            return sb.toString(); // 
        }
