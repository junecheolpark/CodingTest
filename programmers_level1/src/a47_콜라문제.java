//https://school.programmers.co.kr/learn/courses/30/lessons/134240

public class a47_�ݶ��� {
	public static void main(String[] arg) {
		System.out.println(solution(2, 1, 20));
		System.out.println(solution(3, 1, 20));
	}

	public static int solution(int a, int b, int total) {
		int rest = 0;
		int bottle = total;
		int changedDrinks = 0;
		int totalDrinks = 0;

		while (bottle >= a) {
			changedDrinks = (bottle / a) * b; // �ݶ�� �ٲ� ��
			rest = bottle % a; // ������ �� ��
			bottle = changedDrinks + rest; // ��ü ����
			totalDrinks += changedDrinks; 
		}
		return totalDrinks;
	}
}
