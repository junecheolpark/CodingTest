package programmers_level0;

public class _a13_ÇÇÀÚ³ª´²¸Ô±â {
	public static void main(String[] arg) {
		//int[] arr = { 199, 72, 222 };
		// String str = "hello";
		System.out.println((solution(7,10)));
	}

	public static int solution(int slice, int n) {
        int answer = 0;
        while(true){
            answer++;
            if(n <= slice*answer) break;
        }
        return answer;
    }
}
