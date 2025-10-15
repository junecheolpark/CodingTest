package programmers_level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181851
 * */

public class _b189_전국대회선발고사 {
	public static void main(String[] arg) {
		System.out.println((solution(new int[] { 1, 2, 3 }, new boolean[] { true, true, true })));
	}

	public static int solution(int[] rank, boolean[] attendance) {
		// 등수와 학생번호를 묶어서 리스트로 저장
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            list.add(new int[]{rank[i], i});
        }

        // 등수 기준으로 정렬 (오름차순)
        Collections.sort(list, (a, b) -> a[0] - b[0]);

        // 참석 가능한 상위 3명의 학생 번호 찾기
        int[] selected = new int[3];
        int idx = 0;
        for (int[] info : list) {
            int studentNum = info[1];

            if (attendance[studentNum]) {
                selected[idx++] = studentNum;
                if (idx == 3) break;
            }
        }

        // 공식 계산
        return 10000 * selected[0] + 100 * selected[1] + selected[2];
	}
}
