package d1�����迭;

/*/
�ִ밪
����
9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ���, ���� �ٸ� 9���� �ڿ���

3, 29, 38, 12, 57, 74, 40, 85, 61

�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.

�Է�
ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.

���
ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.

���� �Է�1 3
		29
		38
		12
		57
		74
		40
		85
		61

���� ���1 85
		8
/**/
import java.util.Scanner;

public class d02_�ִ밪 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[9];
		int max = 0, cnt=0;
		for (int i=0; i<9;i++) {
			num[i]=sc.nextInt();
		}
		// max = num[0]; <- �̰Ŷ����� �ڲ� Ʋ�ȴ���
		for (int i=0; i<9;i++) {
			if(max<num[i]) {
				max=num[i];
				cnt = i+1;
			}
		}
		System.out.println(max);
		System.out.println(cnt);
	}
}


