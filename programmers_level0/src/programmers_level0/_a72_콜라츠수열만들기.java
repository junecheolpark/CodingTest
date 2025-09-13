package programmers_level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181919

public class _a72_�ݶ������������ {

	public static void main(String[] arg) {
		int parts = 10;

		System.out.println(Arrays.toString(solution(parts)));
	}

	public static int[] solution(int n) {
		List<Integer> list = new ArrayList<>();
		while (n != 1) { // 1�ɋ����� �ݺ�
			list.add(n);
			n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
		}
		list.add(1);

		// �޼ҵ� �������
		return list.stream().mapToInt(Integer::intValue).toArray();

		// ���ٽ� �̿�
		// return list.stream().mapToInt(i -> i).toArray();
	}

}