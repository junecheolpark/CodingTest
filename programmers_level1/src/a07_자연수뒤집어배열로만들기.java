import java.util.Scanner;

public class a07_�ڿ���������迭�θ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] answer = new Solution7().solution(n);
		// System.out.println(answer);

	}

}

//String.valueOf()= null(o) 
//Object.toString()=null(x) ���� -> Long.toString();, Integer.toString();
class Solution7 {
	public int[] solution(long n) {
		
		/*/
		String str = Long.toString(n);
		int[] answer = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			answer[i] = (int) n % 10;
			n /= 10;
		}
		/**/
		String str = String.valueOf(n);
		int[] answer = new int[str.length()];
		for(int i =str.length()-1; i>=0; i--) {//str���̰�~0���� �ݺ�
			answer[str.length()-1-i] = str.charAt(i)- '0'; // charŸ������ ��ȯ�� �ѱ��ھ� ����
		}
		return answer;

	}
}
