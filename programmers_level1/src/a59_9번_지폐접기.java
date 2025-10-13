//https://school.programmers.co.kr/learn/courses/30/lessons/340199

public class a59_9번_지폐접기 {
	public static void main(String[] arg) {
		int[] arr = { 30, 15 };
		int[] arr2 = { 26, 17 };
		System.out.println(solution(arr, arr2));

	}

	public static int solution(int[] wallet, int[] bill) {
		int answer = 0;

		// 지갑과 지폐 크기를 비교하기 쉽게 정렬
		int walletMin = Math.min(wallet[0], wallet[1]);
		int walletMax = Math.max(wallet[0], wallet[1]);
		int billMin = Math.min(bill[0], bill[1]);
		int billMax = Math.max(bill[0], bill[1]);

		// 지폐가 지갑에 들어갈 수 있을 때까지 반복
		while (billMin > walletMin || billMax > walletMax) {
			// 긴 쪽을 접음
			if (billMax >= billMin) {
				billMax = billMax / 2;
			} else {
				billMin = billMin / 2;
			}

			// 다시 min/max 업데이트
			int tempMin = Math.min(billMin, billMax);
			int tempMax = Math.max(billMin, billMax);
			billMin = tempMin;
			billMax = tempMax;

			answer++;
		}

		return answer;
	}

}
