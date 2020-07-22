package arrays;

import java.util.*;

import javax.swing.*;

public class OddOccurrencesInArray02 {
	public int solution(int[] A) {
		//List 사용
		// List<Integer> list = new ArrayList<Integer>();
		//HashSet 사용
		HashSet<Integer> hSet = new HashSet<Integer>();

		for(int i = 0; i < A.length; i++){
			if(hSet.isEmpty()){
				hSet.add(A[i]);
			}else{
				if(hSet.add(A[i]) == false){
					hSet.remove(A[i]);
				}
			}
		}

		Iterator<Integer> itor = hSet.iterator();
		
		return itor.next();
	}
}
