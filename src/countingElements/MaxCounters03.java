package countingElements;

import java.util.Arrays;

public class MaxCounters03 {
    public int[] solution(int N, int[] A){
        int[] rst = new int[N];
        int max = 0;

        //전반적으로 배열 A를 모두 반복해본다.
        for(int i = 0; i < A.length; i++){
            if(A[i] >= 1 && A[i] <= N){
                rst[A[i] - 1]++;

                if(max < rst[A[i] - 1]){
                    max = rst[A[i] - 1]; //max값 정의 
                }
            }

            if(A[i] > N){
                final int MAX = max;
                Arrays.setAll(rst, (inex) -> MAX);
            }
        }

        return rst;
    }
}