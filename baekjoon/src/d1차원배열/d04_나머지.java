package d1�����迭;


/*/
������
����
�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 

�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. �� ���ڴ� 1,000���� �۰ų� ����, ���� �ƴ� �����̴�.

���
ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.

���� �Է�1 1
		2
		3
		4
		5
		6
		7
		8
		9
		10

���� ���1 10
/**/
import java.util.Scanner;
import java.util.HashSet;

public class d04_������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//HashSet : �ߺ��� �ɷ���
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			set.add(sc.nextInt()% 42);
			}
		System.out.println(set.size());
	}
		
}
