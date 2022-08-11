package d1차원배열;


/*/
나머지
문제
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 

수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

입력
첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

출력
첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

예제 입력1 1
		2
		3
		4
		5
		6
		7
		8
		9
		10

예제 출력1 10
/**/
import java.util.Scanner;
import java.util.HashSet;

public class d04_나머지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//HashSet : 중복을 걸러줌
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			set.add(sc.nextInt()% 42);
			}
		System.out.println(set.size());
	}
		
}
