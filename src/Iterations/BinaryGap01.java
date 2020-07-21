package Iterations;
/**
 * 이 클래스는 String 클래스 중 binary number 로 변환해주는 함수를 사용하여,
 * binary gap을 구한 클래스입니다.
 */

import java.util.*;
import java.io.*;

public class BinaryGap01 {
	public static int solution(int N) {
		//이진법으로 바꿔주기 
		String bNum = Integer.toBinaryString(N);
//		System.out.println(bNum);
		ArrayList<Integer> nArr = new ArrayList<Integer>();
		int rst = 0;
		
		//1을 가지고 있는 인덱스를 배열에 담기 
		for(int i = 0; i < bNum.length(); i++) {
			if(bNum.charAt(i) == '1') {
				nArr.add(i);
			}
		}
		
		//배열사이의 값을 빼어 0 카운트 
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
		}//배열의 길이가 이진법으로 바꾼 길이와 동일하다면 0을 출력
		
		return rst;
	}
	
//	public static void main(String[] args) {
//		int a = solution(15);
//	}//main
}
