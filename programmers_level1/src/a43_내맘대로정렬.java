
//https://school.programmers.co.kr/learn/courses/30/lessons/12915

public class a43_내맘대로정렬 {
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
					num = answer[j].compareTo(answer[j + 1]); // n번째 문자가 같다면 문자열 사전순으로 비교
					
					if (num > 0) { // j 가 j+1 보다 크다면
						answer[j] = answer[j + 1];
						answer[j + 1] = temp;
					}
				}
			}
		}
		
		return answer;
	}
}
/* 2번쟤 방법
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