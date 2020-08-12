package countingElements;

import java.util.*;

//Check whether array A is a permutation.
public class PermCheck {
    public int solution(int[] A){
        int rst = 0;
        
        Set<Integer> set = new HashSet<Integer>();

        for(int N : A){
            set.add(N);
        }

        int min = 0;
        boolean chck = false;
        // int lastNum = A.length;

        while(true){
            min++;
            // if(set.contains(min))
        }

        if(min == A.length){
            rst = 1;
        }
        
        return rst;
    }
}