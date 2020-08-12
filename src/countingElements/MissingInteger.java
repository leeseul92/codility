package countingElements;

import java.util.*;

//Find the smallest positive integer (greater than 0) that does not occur in a given sequence.
public class MissingInteger {
    public int solution(int[] A){
        int rst = 0;

        //set 사용하여 배열A의 원소로 채워 중복값을 제거한다.
        //1씩 증가시킨 값이 set에 존재하는지 파악한다.
        //이때, 0과 음수는 제외시켜야함을 잊지 말 것.
        Set<Integer> posInt = new HashSet<Integer>();
        
        //데이터 채우기
        for(int N : A){
            posInt.add(N);
        }

        //최소값 찾기 >> 어차피 양수의 최소값을 구하는 것이므로 음수가 들어있다고 해도 최소값은 0부터 시작하면됨.
        // int min = (Integer)Collections.min(posInt);
        int min = 0;

        // if(min > 0){ //set의 최소값이 음수가 아닌 양수부터 시작한다면 최소값은 0이 될 것.
        //     min = 0;
        // }

        while(true){
            min++;
            if(posInt.contains(min)){
                continue;
            }

            //만일, 1씩 증가시킨 min값이 posInt에 존재하지 않는다면 위의 조건식을 돌지 않고 이 부분으로 들어올 것.
            rst = min;
            break; //반복문 탈출 
            // if(rst > 0){
            //     break;
            // }else{
            //     continue;
            // }
        }
        
        return rst;
    }
}