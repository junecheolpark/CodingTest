package f���ڿ�;

/*/
�ܾ� ����

����
���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.

�Է�
ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.

���
ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.

���� �Է�1 Mississipi

���� ���1 ?
/**/
import java.util.Scanner;

public class f05_�ܾ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26]; // ������ ����
		String s = sc.next();

		for (int i = 0; i < s.length(); i++) {

			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {// �빮���ϰ��
				arr[s.charAt(i) - 'A']++;
			} else { //�ҹ����� ���
				arr[s.charAt(i) - 'a']++;
			}
		}
		
		int max = -1;
		char ch = '?';
		for (int i = 0; i < 26; i++) { //���� ���� ���� ���
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 'A'); //�빮�ڷ� ���
			} else if (arr[i] == max) { //2�� �̻��ϰ�� ?�� ���
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
