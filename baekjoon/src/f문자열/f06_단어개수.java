package f���ڿ�;

/*/
�ܾ��� ����

����
���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� 

���α׷��� �ۼ��Ͻÿ�. ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.

�Է�
ù �ٿ� ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. �� ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�. 

�ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����. ���� ���ڿ��� �������� �����ϰų� ���� �� �ִ�.

���
ù° �ٿ� �ܾ��� ������ ����Ѵ�.

���� �Է�1 The Curious Case of Benjamin Button

���� ���1 6
/**/
import java.util.Scanner;
import java.util.StringTokenizer;

public class f06_�ܾ�� {
	public static void main(String[] args) {
		/*/
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String str = sc.nextLine();
		// ����������� �ڸ�
		String[] stnl = str.split(" ");
		//stnl �迭 ���̸�ŭ ī��Ʈ ��
		for (int i = 0; i < stnl.length; i++) {
			cnt++;
		}
		//���۽� ������ ������� -1
		if (str.charAt(0) == ' ' && str.charAt(str.length()-1) == ' ') {
			cnt = cnt-1;
		}
		System.out.println(cnt);
		/**/
			Scanner in = new Scanner(System.in);
	 
			String S = in.nextLine();
			in.close();
	 
			// st �� ������ �������� ���� ��ū���� st �� �����Ѵ�
			StringTokenizer st = new StringTokenizer(S," ");
			
			// countTokens() �� ��ū�� ������ ��ȯ�Ѵ�
			System.out.println(st.countTokens());	
			
	 
	}
}
