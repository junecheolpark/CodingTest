package programmers_level2;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12973
public class a07_ī�� {
	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
        int total = brown + yellow; // ��ü ���� ��
        
        // ���� ���� x�� ���� ���� y�� ���ϴ� ����
        for (int y = 1; y <= Math.sqrt(total); y++) {
            if (total % y == 0) {
                int x = total / y;
                if ((x - 2) * (y - 2) == yellow) {
                    answer[0] = x;
                    answer[1] = y;
                    break;
                }
            }
        }
        
        return answer;
    }
    public static void main(String[] args) throws Exception {
    	System.out.println(Arrays.toString(solution(24,24)));
    }
}
