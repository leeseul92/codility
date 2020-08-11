package timeComplexity;

public class TapeEquilibrium04 {
    public static int solution(int[] A){
        int rst = Integer.MAX_VALUE;
        int front = 0; int back = 0;

        for(int i = 0; i < A.length; i++){
            back += A[i];
        }
        System.out.println(back);
        for(int i = 0; i < A.length-1; i++){
            front += A[i];
            back -= A[i];
            System.out.println(front + " " + back);
            int temp = Math.abs(front - back);
            System.out.println(temp);
            
            rst = (rst > temp) ? temp : rst;
            System.out.println(rst);
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3};
        int rst = solution(A);
        System.out.println(rst);
    }
}