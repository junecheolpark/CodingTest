package programmers_level0;

import java.util.Arrays;

public class _a34_n의배수고르기 {
	public static void main(String[] arg) {
		 int[] arr = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println(Arrays.toString(solution(3,arr)));
	}

	public static int[] solution(int n, int[] numlist) {
        int cnt = 0, cnt2= 0;
     
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n ==0){
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n ==0){
                answer[cnt2] = numlist[i];
                cnt2++;
            }
        }
        return answer;
    }
}