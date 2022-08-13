import java.util.HashSet;

public class 새로운기술 {
/*/
 * -b07
 *  Math.max(30,2) = 30
 *  Math.min(30,2) = 2
 *  -c12
 *  sc.hasNextInt() -> 입력값이 int형일경우 true
 *  -d03
 *  반드시 charAt() 을 쓸 경우  - '0' 또는 -48 을 연산해야 한다. (아니면 아스키코드에 대응하는 문자가 나온다.)
 *  -d04
 *  //HashSet : 중복을 걸러줌
	HashSet<Integer> set = new HashSet<Integer>();
	
	-f04
	next()는 개행문자를 무시하고 입력을 받고 nextLine은 한줄 단위로 입력을 받기 때문에 개행문자로 포함한다.
	좀 더 직관적으로 설명하자면 위 처럼 5를 입력하고 Enter를 쳤다면 버퍼에 5\n이 존재한다. 이 때 nextInt()가 
	버퍼의 내용을 가져올 때 분리자를 제외하고 가져오기 때문에 5만 가져오게 된다. 그러면 버퍼에 \t가 남아있는데 nextLine()은 
	공백문자, 개행문자인 분리자를 포함시키기 때문에 \t만 가져오고 프로그램이 종료되는 것이다.

 
/**/
}
