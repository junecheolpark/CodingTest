import java.util.ArrayList;

/*/
���� ���ڴ� �Ⱦ�

���� ����
�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. �̶�, �迭 arr���� ���������� 

��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,

arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.

���� ����
�迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
�迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����

arr				answer
[1,1,3,3,0,1,1]	[1,3,0,1]
[4,4,4,3,3]		[4,3]
/**/

public class �������ڴ½Ⱦ� {
	public int[] solution(int[] arr) {
	        int[] answer = {};
	        ArrayList<Integer> arrList = new ArrayList<Integer>();
	        
	        int num = -1; //���Ұ� 0~9���� �̹Ƿ� ���� �ȹ޴� �ƹ� ����.
	        for(int i=0; i<arr.length; i++){
	             if(arr[i] != num){
	                 arrList.add(arr[i]);
	                 num = arr[i];
	             }
	        }
	        
	        answer = new int[arrList.size()]; //answer ����Ʈ ũ�� ����.
	        for(int i=0; i<answer.length; i++){
	            answer[i] = arrList.get(i); 
	        }
	        
	        return answer;
	}
}
