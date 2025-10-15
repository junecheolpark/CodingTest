package programmers_level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181851
 * */

public class _b189_������ȸ���߰�� {
	public static void main(String[] arg) {
		System.out.println((solution(new int[] { 1, 2, 3 }, new boolean[] { true, true, true })));
	}

	public static int solution(int[] rank, boolean[] attendance) {
		// ����� �л���ȣ�� ��� ����Ʈ�� ����
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            list.add(new int[]{rank[i], i});
        }

        // ��� �������� ���� (��������)
        Collections.sort(list, (a, b) -> a[0] - b[0]);

        // ���� ������ ���� 3���� �л� ��ȣ ã��
        int[] selected = new int[3];
        int idx = 0;
        for (int[] info : list) {
            int studentNum = info[1];

            if (attendance[studentNum]) {
                selected[idx++] = studentNum;
                if (idx == 3) break;
            }
        }

        // ���� ���
        return 10000 * selected[0] + 100 * selected[1] + selected[2];
	}
}
