import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a08_���������������������ϱ� {
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
		char[] ch = String.valueOf(n).toCharArray(); //String ����ȯ �� char�迭�� ����
		for(int i = 0; i<ch.length; i++) {
			for(int j = i+1; j<ch.length; j++) {
				if(ch[i] < ch[j]) {
					tmp = ch[i];
					ch[i] = ch[j]; //i���� ū j �� i �� ����
					ch[j] = (char) tmp; // j��ġ�� ���� i�� ����
				}
			}
		}
		return Long.parseLong(String.valueOf(ch));// ch�� String������ ��ȯ�� Long������ ��ȯ
		/**/
		/**/
		String[] arr = String.valueOf(n).split(""); // String������ ��ȯ�� �ϳ��� �迭�� ����
		Arrays.sort(arr,Collections.reverseOrder());// ������������ ����
		StringBuilder sb = new StringBuilder();
		
		for(String str : arr) { // for-each������ sb�� �����
			sb.append(str);
		}
		return Long.parseLong(sb.toString()); // sb�� Long Ÿ������ ��ȯ �� ���� 
		/**/
	}
}