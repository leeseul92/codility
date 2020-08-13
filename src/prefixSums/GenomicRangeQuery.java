package prefixSums;

import java.util.*;

//Find the minmal nucleotide from a range of sequence DNA.
public class GenomicRangeQuery {

    static Set<Character> cSet;
    public static int[] solution(String S, int[] P, int[] Q){
        //A = 1, C = 2, G = 3, T = 4
        int M = P.length;
        int[] rst = new int[M];

        int n = 0;
        //0부터 M-1까지 진행
        while(n < M){
            cSet = new HashSet<Character>();
            int p = P[n];
            int q = Q[n];
            
            if(p <= q){
                for(int i = p; i <= q; i++){
                    cSet.add(S.charAt(i)); //중복된 값은 사라짐
                }
            } else{
                for(int i = q; i < p; i++){
                    cSet.add(S.charAt(i));
                }
            }

            //최소값 찾기
            char cTmp = Collections.min(cSet);

            switch(cTmp){
                case 'A':
                    rst[n] = 1;
                    break;
                case 'C':
                    rst[n] = 2;
                    break;
                case 'G':
                    rst[n] = 3;
                    break;
                default :
                    rst[n] = 4;
                    break;
            }

            n++;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        int[] rst = solution("CGCCATC", P, Q);
        for(int A : rst){
            System.out.print(A + " ");
        }
    }
}