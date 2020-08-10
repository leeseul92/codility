package timeComplexity;

import java.util.*;

public class PermMissingEle {
    public int solution(int[] A){
        int len = A.length;

        //정렬 
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < len; i++){
            list.add(A[i]);
        }

        Collections.sort(list);

        int rst = 0;

        if(list.get(0) != 1){
            rst = 1;
        } else{
            int i = 0;
            for(i = 0; i < len - 1; i++){
                if(list.get(i+1) - list.get(i) > 1){
                    rst = (list.get(i+1) + list.get(i)) / 2;
                    break;
                }
            }
            //list를 모두 돌지않았다면, 중간에 빠진 원소가 있다는 얘기이므로 그대로 rst 출력

            if(i == len - 1){
                rst = 100001;
            }
            
        }

        return rst;
    }
}