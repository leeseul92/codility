package prefixSums;

/**
 * @author leeseul kim
 * 
 * 해당 솔루션은 timeout error로 속도 최적화가 필요함
 */

//compute number of integers divisible by k in range [a..b]
public class CountDiv {
    public int solution(int A, int B, int K){
        int cnt = 0;

        for(int i = A; i <= B; i++){
            //A~B 사이에 있는 값 중 K로 나누어 떨어지는 수를 카운트해준다.
            if(i % K == 0){
                cnt++;
            }
        }
        return cnt;
    }
}