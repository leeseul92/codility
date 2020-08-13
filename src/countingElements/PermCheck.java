package countingElements;

import java.util.*;

//Check whether array A is a permutation.
public class PermCheck {
    public int solution(int[] A){
        int rst = 1;
        
        Set<Integer> set = new HashSet<Integer>();

        for(int N : A){
            set.add(N);
        }

        int max = Collections.max(set); //set에 존재하는 max 값이 N보다 큰지 판단

        if(set.size() < A.length){
            //중복된 값이 있으면 순열이 아님
            rst = 0;
        } else if(max > A.length){
            //max 값이 N보다 크다면 순열이 아님
            rst = 0;
        } else if(!set.contains(1)){
            //1을 포함하지 않는다면 순열이 아님
            rst = 0;
        }
        
        return rst;
    }
}