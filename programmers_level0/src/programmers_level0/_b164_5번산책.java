package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/250129
 * */

public class _b164_5¹ø»êÃ¥ {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution("NSSNEWWN")));
	}

	public static int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                	north--;
                    break;
                case 'E':
                	east++;
                    break;
                case 'W':
                	east--;
                	break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }

}
