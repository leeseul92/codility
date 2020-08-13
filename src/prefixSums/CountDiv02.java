package prefixSums;
/**
 * @author leeseul kim
 * 
 * 해당 솔루션은 A = 11, B = 345, K = 17일 경우 오답이 나옴.
 * 수학적 계산이 필요함
 */
public class CountDiv02 {
    public static int solution(int A, int B, int K){
        int diff = B - A;
        // int rst = diff / K + 1;
        int rst = diff / K;

        if(A % K == 0 || B % K == 0){
            //A 또는 B가 K의 배수일 때
            rst++;
        }

        // if(diff == 0) rst--;

        return rst;
    }

    public static void main(String[] args) {
        int rst = solution(1, 1, 11);
        System.out.println(rst);
    }
}