package timeComplexity;

// import java.util.*;

/**
 * @author leeseul kim
 * @since 10th Aug 2020
 * 
 * 해당 solution은 71%의 정확도, 28%의 tast score를 갖음
 */

public class TapeEquilibrium02 {
    public static int solution(int[] A){
        int rst = 0;

        int diff = 0;
        for(int n = 1; n < A.length-1; n++){
            int sum1 = 0;
            for(int i = 0; i < n; i++){
                sum1 += A[i];
            }
            int sum2 = 0;
            for(int i = n; i < A.length; i++){
                sum2 += A[i];
            }
            int temp = sum1 - sum2;
            if(temp < 0){
                temp *= -1;
            }
            System.out.println(temp);
            if(n == 1){
                diff = temp;
            } else {
                if(temp < diff){
                    diff = temp;
                }
            }
        }

        rst = diff;
        return rst;
    }

    public static void main(String[] args) {
        int[] A = {1, 2001};
        int rst = solution(A);
        System.out.println(rst);
    }
}