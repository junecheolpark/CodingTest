import java.util.Scanner;

public class a21_������ڰ������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String answer = new Solution21().solution(s);
		System.out.println(answer);

	}
}

class Solution21 {
	public String solution(String s) {
		//���1
		/*/
		StringBuilder sb = new StringBuilder();
		int leng = s.length();
		if (s.length() % 2 != 0) { // Ȧ�����
			sb.append(s.charAt(leng / 2));
			return sb.toString();
		}
		for (int i = 0; i < leng; i++) { // ¦�����
			if (i == leng / 2 - 1 || i == leng / 2) {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
		/**/
		
		//���2 (�ӵ��� �� ����)
		/**/
		int leng = s.length(); // String s ���̰���ŭ leng�� ����
		String s2;
		
		if (leng % 2 == 0) { // ¦�����
			//substr, substring, slice ���� �˻��� ����� �ø��� https://velog.io/@siugan/Javascript-%EB%AC%B8%EC%9E%90%EC%97%B4-%EC%9E%90%EB%A5%B4%EA%B8%B0-substr-substring-slice
			s2 = s.substring(leng / 2 - 1, leng / 2 + 1); //  abcd �ϰ�� 1,3-> 1=b���� 3���� 2=c���� s�� ��������
		} else {
			s2 = s.substring(leng / 2, leng / 2 + 1); // abcde �ϰ�� 2,3��ġ������ ����̹Ƿ� 2=c�� s�� ��������
		}
		return s2;
		/**/
	}
}
