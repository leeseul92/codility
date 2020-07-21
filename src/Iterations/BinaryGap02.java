package Iterations;
/**
 * 이 클래스는 이진법 계산을 반복문을 가지고 만든 binary gap 클래스입니다.
 * @author leeseulkim
 * @see 
 * 	BinaryGap01.java
 * 	위 클래스의 코드보다 속도면에서 향상되었음. 
 */

import java.util.*;
import java.io.*;

public class BinaryGap02 {

	public int solution(int N) {
		String bNum = "";
		ArrayList<Integer> nArr = new ArrayList<Integer>();
		
		while(N != 1) {
			bNum += (N % 2);
			N /= 2;
		}
		bNum += N;
		
		for(int i = 0; i < bNum.length(); i++) {
			if(bNum.charAt(i) == '1') {
				nArr.add(i);
			}
		}
		
		int rst = 0;
		if(bNum.length() != nArr.size()) {
			if(nArr.size() >= 2) {
				int tmp = 0;
				for(int i = 0; i < nArr.size()-1; i++) {
					tmp = nArr.get(i+1) - nArr.get(i);
					
					if(rst < tmp) {
						rst = tmp;
					}
				}
				rst--;
			}
		}
		
		return rst;
	}
}
