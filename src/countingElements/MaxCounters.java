package countingElements;

/**
 * @author leeseul kim
 * 
 * 해당 솔루션은 25%의 정확도를 가짐. >> 많은 경우의 수를 생각하여 다시 계싼해볼것  
 */

import java.util.*;

//Calculate the value of counters after applying all alternating operations: increase counter by 1; set value of all counters to current maximum.
public class MaxCounters {
    public static int[] solution(int N, int[] A){
        int[] rst = new int[N];

        //N+1의 값을 갖는 배열A의 가장 큰 인덱스를 찾기
        int maxIdx = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == N+1){
                maxIdx = i;
            }
        }

        //최대빈수 찾기 
        for(int i = 0; i < maxIdx; i++){
            //중간에 N+1값이 존재하는 경우는 continue 해야함
            if(A[i] == N+1){
                continue;
            }
            rst[A[i]-1]++; //A배열을 돌면서 모든 값이 채워짐
        }
        
        ArrayList<Integer> modeList = new ArrayList<Integer>();
        for(int i = 0; i < rst.length; i++){
            modeList.add(rst[i]);
        }

        //오름차순정렬
        Collections.sort(modeList);
        //제일 마지막에 있는 원소가 최대빈수임.
        
        for(int i = 0; i < N; i++){
            rst[i] = modeList.get(modeList.size()-1);
        }

        //나머지 값들을 1씩 올려준다.
        for(int i = maxIdx+1; i < A.length; i++){
            rst[A[i]-1]++;
        }

        return rst;
    }

    public static void main(String[] args) {
        int[] A = {3,4,4,6,1,4,4,6,1};
        int[] rst = solution(5, A);
        for(int i = 0; i < rst.length; i++){
            System.out.print(rst[i] + " ");
        }
    }
}