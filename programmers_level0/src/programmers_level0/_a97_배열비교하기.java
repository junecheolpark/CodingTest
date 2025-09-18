package programmers_level0;


/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181856
 * */

public class _a97_�迭���ϱ� {
	public static void main(String[] arg) {
		int [] arr1= {49, 13};
		int [] arr2= {70, 11, 2};
		System.out.println(solution(arr1, arr2));
	}

	public static int solution(int[] arr1, int[] arr2) {
        //1. ���� ��
        if (arr1.length > arr2.length) return 1;
        if (arr1.length < arr2.length) return -1;
          
        // 2. ���̰� ������ �� ��
        int sum1 = 0;
        int sum2 = 0;
        for(int num1 : arr1) sum1 += num1;
        for(int num2 : arr2) sum2 += num2;
   
        if (sum1 > sum2) return 1;
        if (sum1 < sum2) return -1;
       
        // ��� ���ٸ�
        return 0;
    }

}