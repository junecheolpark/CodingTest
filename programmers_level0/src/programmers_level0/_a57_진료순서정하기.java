package programmers_level0;

import java.util.Arrays;

public class _a57_����������ϱ� {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		int[] arr1 = { 3, 76, 24 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr3 = { 30, 10, 23, 6, 100 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println(Arrays.toString(solution(arr1)));
		System.out.println(Arrays.toString(solution(arr2)));
		System.out.println(Arrays.toString(solution(arr3)));
	}

	public static int[] solution(int[] emergency) {
		int[] answer = emergency.clone(), arr = new int[emergency.length]; // clone()�迭 ��������
		int cnt = 0;
		Arrays.sort(emergency); // �������� ����
		for (int i = emergency.length; i > 0; i--) {
			for (int j = 0; j < answer.length; j++) {
				if (emergency[i - 1] == answer[j]) {// ���� ���� ã�� j��ġ�� ���� ����
					cnt++;

					arr[j] = cnt;
				}
			}
		}
		return arr;
	}
}

/*/
int[] answer = new int[emergency.length];

for(int i = 0; i < answer.length; i++){
    if(answer[i] != 0){
        continue;
    }
    int idx = 1;
    for(int j = 0; j < answer.length; j++){
        if(emergency[i] < emergency[j]){
            idx++;
        }
    }
    answer[i] = idx;
}
return answer;
}
}
/**/