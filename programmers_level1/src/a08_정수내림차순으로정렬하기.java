import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a08_정수내림차순으로정렬하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long answer = new Solution8().solution(n);
		System.out.println(answer);

	}

}

class Solution8 {
	public long solution(long n) {
		//118372	873211
		/*/
		int tmp = 0;
		char[] ch = String.valueOf(n).toCharArray(); //String 형변환 후 char배열로 저장
		for(int i = 0; i<ch.length; i++) {
			for(int j = i+1; j<ch.length; j++) {
				if(ch[i] < ch[j]) {
					tmp = ch[i];
					ch[i] = ch[j]; //i보다 큰 j 를 i 에 정의
					ch[j] = (char) tmp; // j위치에 원래 i를 정의
				}
			}
		}
		return Long.parseLong(String.valueOf(ch));// ch를 String형으로 변환후 Long형으로 변환
		/**/
		/**/
		String[] arr = String.valueOf(n).split(""); // String형으로 변환후 하나씩 배열로 정의
		Arrays.sort(arr,Collections.reverseOrder());// 내림차순으로 정렬
		StringBuilder sb = new StringBuilder();
		
		for(String str : arr) { // for-each문으로 sb에 담아줌
			sb.append(str);
		}
		return Long.parseLong(sb.toString()); // sb를 Long 타입으로 변환 후 리턴 
		/**/
	}
}