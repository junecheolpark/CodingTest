import java.util.Scanner;

public class a08_정수내림차순으로정렬하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long answer = new Solution8().solution(n);
		System.out.println(answer);

	}

}

class Solution8 {
	public long solution(long n) {
		//118372	873211
		
		int tmp = 0;
		char[] ch = String.valueOf(n).toCharArray(); //String 형변환 후 char배열로 저장
		for(int i = 0; i<ch.length; i++) {
			for(int j = i+1; j<ch.length; j++) {
				if(ch[i] < ch[j]) {
					tmp = ch[i];
					ch[i] = ch[j]; //i보다 큰 j 를 i 에 정의
					ch[j] = (char)tmp; // j위치에 원래 i를 정의
				}
			}
		}
		long answer = Long.parseLong(String.valueOf(tmp));// tmp를 String형으로 변환후 Long형으로 변환
		return answer;
		/*
		 *  char[] sort = String.valueOf(n).toCharArray();
		    int tmp = 0;
		    for(int i=0; i<sort.length; i++) {
		        for(int j=i+1; j<sort.length; j++) {
		            if(sort[i] < sort[j]) {
		                tmp = sort[i];
		                sort[i] = sort[j];
		                sort[j] = (char) tmp;
		            }
		        }
		    }
		
		    return Long.parseLong(String.valueOf(sort));
		 */
	}
}
