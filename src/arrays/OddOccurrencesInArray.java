package arrays;
/**
 * 이 클래스는 해당 문제를 스택을 사용한 클래스입니다.
 * --오답--
 * @author leeseulkim
 * @see
 * 	OddOccurrencesInArray02.java
 */

import java.util.*;

class OddOccurrencesInArray {
    public int solution(int[] A){
        //stack 사용
    	Stack<Integer> stack = new Stack<Integer>();
    	
//    	//첫번째 배열의 값을 스택에 push해준다.
//    	stack.push(A[0]);
    	
    	for(int i = 0; i < A.length; i++) {
    		if(stack.isEmpty()) {
    			stack.push(A[i]);
    		} else {
    			if(stack.peek() == A[i]) {
    				stack.pop();
    			} else {
    				stack.push(A[i]);
    			}
    		}
    	}
    	
        return stack.peek();
    }
}