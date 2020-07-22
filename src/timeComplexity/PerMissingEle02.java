package timeComplexity;

import java.util.*;

public class PerMissingEle02 {
    public int solution(int[] A){
        int len = A.length;
        int rst = 0;

        //정렬
        ArrayList<Integer> list = new ArrayList<Integer>();
        //향상된 for문
        for(int num : A){
            list.add(num);
        }

        Collections.sort(list);

        return rst;
    }
}