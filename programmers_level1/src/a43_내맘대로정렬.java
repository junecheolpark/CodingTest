
//https://school.programmers.co.kr/learn/courses/30/lessons/12915

public class a43_����������� {
	public static void main(String[] arg) {
		String[] arr = { "sun", "bed", "car" };
		String[] arr2 = { "abce", "abcd", "cdx" };
		String[] strArray = solution(arr2, 2);
		System.out.println(String.join(",", arr2));

	}

	public static String[] solution(String[] strings, int n) {
		String[] answer = strings;
		int sLength = strings.length;
		String temp = "";
		char nextChar = ' ';
		char nowChar = ' ';
		int num = 0;

		for (int i = 0; i < sLength; i++) {
			for (int j = 0; j < sLength - 1; j++) {
				nowChar = answer[j].charAt(n);
				nextChar = answer[j + 1].charAt(n);
				temp = answer[j];
				
				if (nowChar > nextChar) {
					answer[j] = answer[j + 1];
					answer[j + 1] = temp;
				} else if (nowChar == nextChar) {
					num = answer[j].compareTo(answer[j + 1]); // n��° ���ڰ� ���ٸ� ���ڿ� ���������� ��
					
					if (num > 0) { // j �� j+1 ���� ũ�ٸ�
						answer[j] = answer[j + 1];
						answer[j + 1] = temp;
					}
				}
			}
		}
		
		return answer;
	}
}
/* 2���� ���
import java.util.Arrays;

public static String[] solution(String[] strings, int n) {
    Arrays.sort(strings, (s1, s2) -> {
        char c1 = s1.charAt(n);
        char c2 = s2.charAt(n);
        
        if (c1 != c2) {
            return Character.compare(c1, c2);
        } else {
            return s1.compareTo(s2);
        }
    });
    
    return strings;
}
*/