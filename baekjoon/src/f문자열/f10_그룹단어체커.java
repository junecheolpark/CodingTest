package f���ڿ�;


/*/
����� �Ѱ���

����
�׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. ���� ���, 
ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, 
aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.

�ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�
ù° �ٿ� �ܾ��� ���� N�� ���´�. N�� 100���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ� �ܾ ���´�. 

�ܾ�� ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� ������, ���̴� �ִ� 100�̴�.

���
ù° �ٿ� �׷� �ܾ��� ������ ����Ѵ�.

���� �Է�1 3
		happy
		new
		year

���� ���1 3
/**/
import java.util.*;
public class f10_�׷�ܾ�üĿ {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0; // �׷� �ܾ� ����
		
		for (int i = 0; i < N; i++) {
			String S = sc.next();
			boolean check[] = new boolean[26]; // ���ĺ� ��� ����
			boolean tmp = true; // �׷� �ܾ� ����
			
			for (int j = 0; j < S.length(); j++) {
				int index = S.charAt(j)-'a';
				if(check[index]) { // ������ ��������� �ִ� ���ڶ��
					if(S.charAt(j) != S.charAt(j-1)) { // ���� ���ڿ� ���ӵ��� �ʴ´ٸ�
						tmp = false; // �׷� �ܾ �ƴ�
						break;
					}
				}else { // ������ ��������� ���� ���ڶ��
					check[index] = true; // ���� ��� üũ
				}
			}
			if(tmp) cnt++;
		}
		
		System.out.println(cnt);
	}
}