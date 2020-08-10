package timeComplexity;

/**
 * @author leeseul kim
 * @since 10th Aug 2020
 * 
 * 해당 solution은 58%의 task score를 갖음.
 */

public class TapeEquilibrium {
    public static int solution(int[] A){
        int rst = 0;
        int len = A.length;

        //반으로 나누어 더한 값을 뺸 값을 저장시킬 배열 
        int[] sArr = new int[len-1];

        int n = 1;

        while(n <= len-1){
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0; i < n; i++){
                sum1 += A[i];
            }
            // System.out.println(sum1);
            for(int i = n; i < len; i++){
                sum2 += A[i];
            }
            // System.out.println(sum2);
            int tmp = sum1 - sum2;
            // System.out.println(tmp);

            if(tmp < 0){
                //tmp값이 음수일 때 절대값을 씌워야한다.
                tmp *= -1;
            }

            sArr[n-1] = tmp;
            n++;
        }
        // //출력해보기
        // for(int i = 0; i < sArr.length; i++){
        //     System.out.print(sArr[i] + " | ");
        // }
       
        // System.out.println();
        
        //내림차순으로 배열 정리
        for(int i = 0; i < sArr.length; i++){
            for(int j = i+1; j < sArr.length; j++){
                if(sArr[i] < sArr[j]){
                    int tmp = sArr[i];
                    sArr[i] = sArr[j];
                    sArr[j] = tmp;
                }
            }
        }
        
        // //출력해보기
        // for(int i = 0; i < sArr.length; i++){
        //     System.out.print(sArr[i] + " | ");
        // }

        rst = sArr[sArr.length-1];
        return rst;
    }
    
    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3};
        int rst = solution(A);
        System.out.println(rst);
    }
}