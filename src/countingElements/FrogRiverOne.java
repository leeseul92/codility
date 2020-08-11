package countingElements;

import java.util.*;

//Find the earliest time when a frog can jump to the other side of a river.
//If the forg is never able to jump to the other side of the river, the function should return -1.
//The frog can cross only when leaves appear at every position across the river from to 1 to X.
public class FrogRiverOne {
    public static int solution(int X, int[] A){
        //개구리는 주어진 X 위치까지 건너가야한다. 이때, 개구리가 현재 위치하는 1에서부터 X까지는 모두 나뭇잎이 떨어져있어야한다.
        //즉, 1~X까지 하나라도 비어있는 나뭇잎이 존재한다면, 개구리는 강을 건널 수 없으므로 -1을 리턴한다.
        int rst = -1;
        if(A.length < X) return rst; //배열의 길이가 X보다도 작으면 개구리는 강을 건널 수 없다.

        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < A.length; i++){
            set.add(A[i]);
            //0번째부터 차례대로(시간순서대로) set에 자료를 채운다.
            if(set.size() == X && set.contains(X)){
                //set은 중복된 수는 들어가지 않는다.
                rst = i;
                break;
            }
        }

        return rst;
    }
}