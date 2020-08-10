package timeComplexity;

// import java.util.*;

public class PerMissingEle03{
    public int solution(int[] A){
        int result = 0;

        //배열의 길이 +1 만큼의 boolean 배열을 생성 
        boolean[] bArr = new boolean[A.length+1];
        
        //A배열을 돌면서 배열값의 -1 값을 인덱스로 하여 boolean 값을 true로 변경해준다.
        for(int i = 0; i < A.length; i++){
            int index = A[i];
            bArr[index - 1] = true;
        }

        for(int i = 0; i < bArr.length; i++){
            if(!bArr[i]){
                result = ++i;
            }
        }

        return result;
    }
}