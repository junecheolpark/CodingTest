import java.util.Scanner;

public class a01_Â¦¼ö¿ÍÈ¦¼ö {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = new Solution().solution(num);
		System.out.println(str);
	}


}

class Solution {
	  public String solution(int num) {

			if(num %2 == 0) {
				return ("Even");
			} else
				return ("Odd");
	  }
}