package programmers_level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181918
 * */

public class _b168_�迭�����4 {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution(new int[] {1, 4, 2, 5, 3})));
	}

	public static int[] solution(int[] arr) {
		List<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {
                // stk�� ��������� �׳� �߰�
                stk.add(arr[i]);
                i++;
            } else {
                int last = stk.get(stk.size() - 1); // ������ ���� Ȯ��
                if (last < arr[i]) {
                    stk.add(arr[i]);
                    i++;
                } else {
                    stk.remove(stk.size() - 1); // ������ ���� ����
                }
            }
        }

        // List �� int[] ��ȯ
        int[] result = new int[stk.size()];
        for (int j = 0; j < stk.size(); j++) {
            result[j] = stk.get(j);
        }

        return result;
    }

}
