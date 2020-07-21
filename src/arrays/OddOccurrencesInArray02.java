package arrays;

import java.util.*;

public class OddOccurrencesInArray02 {
	public int solution(int[] A) {
		//List 사용
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < A.length; i++) {
			if(list.isEmpty()) {
				list.add(A[i]);
			} else {
				for(int j = 0; j < list.size(); j++) {
					if(list.get(j) == A[i]) {
						
					}
				}
			}
		}
		return 0;
	}
}
