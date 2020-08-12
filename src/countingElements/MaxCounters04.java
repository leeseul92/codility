package countingElements;

public class MaxCounters04 {
    public static int[] solution(int N, int[] A){
        int[] rst = new int[N];
        // int maxIdx = 0;
        int max = 0;

       for(int i = 0; i < A.length; i++){
           //A배열을 모두 돌면서 판단 
           if(A[i] >= 1 && A[i] <= N){
               rst[A[i] - 1]++;

               if(max < rst[A[i] - 1]){
                   max = rst[A[i] - 1]; //max값 정의
               }
           }

           if(A[i] > N){
               rst = fillMax(max, rst);
           }
       }

        //출력
        for(int X : rst){
            System.out.print(X + " ");
        }

        return rst;
    }

    //배열을 모두 max로 채워줄 함수 호출
    public static int[] fillMax(int max, int[] rst){
        for(int i = 0; i < rst.length; i++){
            rst[i] = max;
        }

        return rst;
    }

    public static void main(String[] args) {
        int[] A = {1};
        solution(1, A);
    }
}