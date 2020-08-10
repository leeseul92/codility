package timeComplexity;
/**
 * @author leeseul kim
 * 
 * 해당 solution은 큰 값의 배열이 들어왔을 때 time out 되어버린다.
 */
public class TapeEquilibrium03 {
    public static int solution(int[] A){
        int rst = Integer.MAX_VALUE;
        
        int n = 1;
        while(n <= A.length - 1){
            int sum1 = 0; int sum2 = 0;
            for(int i = 0; i < n; i++){
                sum1 += A[i];
            }
            for(int i = n; i < A.length; i++){
                sum2 += A[i];
            }
            int temp = Math.abs(sum1 - sum2);

            rst = (rst > temp) ? temp : rst;
            //rst는 정수형의 최댓값
            //temp가 rst보다 크다면 rst를 그대로 갖음.
            //하지만 첫번째 루프에서 위와 같은 경우는 나올 수 없으므로 무조건 temp가 rst에 대입될 것

            n++;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3};
        int rst = solution(A);
        System.out.println(rst);
    }
}