package countingElements;

import java.util.*;

public class MaxCounters02 {
    public static int[] solution(int N, int[] A){
        int[] rst = new int[N];

        //주어진 배열 A가 원소 하나만을 가질 때
        if(A.length == 1){
            rst[0]++;
        } else{
            int maxIdx = 0;
            //N+1의 값을 갖는 배열A의 가장 큰 인덱스
            for(int i = 0; i < A.length; i++){
                if(A[i] == N+1){
                    maxIdx = i;
                }
            }
            System.out.println(maxIdx);

            //최대빈수 찾기
            for(int i = 0; i < maxIdx; i++){
                //중간에 N+1값이 존재하는 경우는 카운트하지 않고 다시 조건식 증감식으로 이동
                if(A[i] == N+1){
                    continue;
                } else{
                    rst[A[i]-1]++; //N+1을 마지막으로 갖는 A배열의 인덱스까지 모두 돌면서 카운팅됨.
                }
            }

            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < rst.length; i++){
                list.add(rst[i]);
            }

            //오름차순 정렬
            Collections.sort(list); //제일 마지막에 있는 원소가 최대빈수임.
            System.out.println(list.get(list.size()-1));

            for(int i = 0; i < N; i++){
                rst[i] = list.get(list.size()-1);
            }

            if(A.length > maxIdx){
                //배열A의 길이가 maxIdx보다 더 길다면 나머지 값들을 다시 1씩 올려줘야함.
                for(int i = maxIdx + 1; i < A.length; i++){
                    rst[A[i]-1]++;
                }
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] A = {3,4,4,6,1,4,4,6,1,5,4,1,3,2,4,5,6,5,1,4,4,5,1,3,6,1,5,4,6,1,4,5};
        int[] rst = solution(5, A);
        for(int i = 0; i < rst.length; i++){
            System.out.print(rst[i] + " ");
        }
    }
}