//https://school.programmers.co.kr/learn/courses/30/lessons/340199

public class a59_9��_�������� {
	public static void main(String[] arg) {
		int[] arr = { 30, 15 };
		int[] arr2 = { 26, 17 };
		System.out.println(solution(arr, arr2));

	}

	public static int solution(int[] wallet, int[] bill) {
		int answer = 0;

		// ������ ���� ũ�⸦ ���ϱ� ���� ����
		int walletMin = Math.min(wallet[0], wallet[1]);
		int walletMax = Math.max(wallet[0], wallet[1]);
		int billMin = Math.min(bill[0], bill[1]);
		int billMax = Math.max(bill[0], bill[1]);

		// ���� ������ �� �� ���� ������ �ݺ�
		while (billMin > walletMin || billMax > walletMax) {
			// �� ���� ����
			if (billMax >= billMin) {
				billMax = billMax / 2;
			} else {
				billMin = billMin / 2;
			}

			// �ٽ� min/max ������Ʈ
			int tempMin = Math.min(billMin, billMax);
			int tempMax = Math.max(billMin, billMax);
			billMin = tempMin;
			billMax = tempMax;

			answer++;
		}

		return answer;
	}

}
