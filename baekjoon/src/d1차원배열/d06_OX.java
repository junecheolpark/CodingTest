package d1�����迭;

/*/
OX����

����
"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.

"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.

OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.

���
�� �׽�Ʈ ���̽����� ������ ����Ѵ�.

���� �Է�1 5
		OOXXOXXOOO
		OOXXOOXXOO
		OXOXOXOXOXOXOX
		OOOOOOOOOO
		OOOOXOOOOXOOOOX

���� ���1 10
		9
		7
		55
		30
/**/
import java.util.Scanner;
public class d06_OX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.nextLine();
		for(int i = 0; i<n; i++) {
			str = sc.nextLine();
			int index = 0,num = 0;
			for(int j=0; j<str.length();j++) {
				if(str.charAt(j) == 'O') {
					num += ++index;
				}else {
					index=0;
				}
			}
			System.out.println(num);
		}
		
	}

}
