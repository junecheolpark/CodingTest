package programmers_level0;


/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181839
 * */

public class _a98_�ֻ�������1 {
	public static void main(String[] arg) {
		System.out.println(solution(3, 5));
	}

	public static int solution(int a, int b) {
        if(a % 2 != 0 && b % 2 != 0){ //Ȧ�����
            return (a * a) + (b * b);
        }else if(a % 2 != 0 || b % 2 != 0){ //�����ϳ� Ȧ�����
            return 2* (a + b);
        }
       
        return Math.abs(a - b);
    }

}