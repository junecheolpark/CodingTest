package programmers_level0;

public class _a40_�ֺ󰪱��ϱ� {
	public static void main(String[] arg) {
		int[] arr3 = { 1 };
		int[] arr2 = { 1, 2, 3, 3, 3, 4 };
		int[] arr = { 1, 1, 2, 2 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(arr2)));
		System.out.println((solution(arr)));
		System.out.println((solution(arr3)));
	}

	public static int solution(int[] array) {
		int result = 0;
		int arrayMax = 0;
		for (int i = 0; i < array.length; i++) { // �Ű������� ���� �迭�� �ִ밪�� ����
			if (array[i] > arrayMax) {
				arrayMax = array[i];
			}
		}
		int[] count = new int[arrayMax + 1]; // ũ�Ⱑ �ִ밪+1 �� �迭�� �ϳ� ����

		for (int j = 0; j < array.length; j++) { // �Ű����� �迭�� ����ִ� ������°����
			count[array[j]]++; // ���� ���� �迭�� 1�� ������
		}

		int countMax = 0;
		for (int m = 0; m < count.length; m++) { // ���θ��� �迭�� �ִ밪�� ����
			if (count[m] > countMax) {
				countMax = count[m]; // ���θ��� �迭�� m��° ��Ұ� �ִ밪�̶��
				result = m; // �Ű������� ���� �迭�� m �� �ֺ�
			}
		}

		int rep = 0;
		for (int n = 0; n < count.length; n++) { // �� �ִ밪�� �ߺ����� �ִ����� Ȯ��
			if (countMax == count[n]) { // �ߺ��� ���ٸ� rep�� 1,
				rep++; // �ߺ��� �ִٸ� reo�� 2�̻�
			}
		}
		if (rep != 1) {
			result = -1;
		}
		return result;
	}
}
/*
 * char temp = my_string.charAt(num1); StringBuilder sb = new
 * StringBuilder(my_string); sb.setCharAt(num1, my_string.charAt(num2));
 * sb.setCharAt(num2, temp); return String.valueOf(sb);
 */
