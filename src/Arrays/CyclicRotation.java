// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] B = new int[A.length];

        for(int i = 0; i < A.length; i++){
            int tmp = (i + K) % A.length;
            B[tmp] = A[i];
        }

        return B;
    }
}