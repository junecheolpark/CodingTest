import java.util.Scanner;

public class a25_���ڿ��ٷ��⺻ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean answer = new Solution25().solution(s);
		System.out.println(answer);

	}
}

class Solution25 {
	public boolean solution(String s) {
		/*/
		if(s.length() != 4 && s.length() != 6) return false; // ������ ���̰��� 4,6 �ƴ϶�� false
		return s.matches("^[0-9]*$"); // match()�Լ��� ���� ����ǥ���İ� ������ �����̸� true
		/**/
		/**/
		boolean answer = true;

	      if (s.length() != 4 && s.length() != 6) return false; // ������ ���̰��� 4,6 �ƴ϶�� false
	      for (int i = 0; i < s.length(); i++) {
	          if (s.charAt(i) < '0' || s.charAt(i) > '9') return false; //���ڿ� �ϳ��� �ݺ��ذ��� '0'���� ���ų� '9'���� ũ�� false ����
	      }
	      return answer; // �������� �����ٸ� true
	      /**/
	}
}