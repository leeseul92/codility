package test;

// import java.util.*;

public class Test03 {
	public static int solution(String S) {
        // write your code in Java SE 8
		int len = S.length();
		//결과값
		int rst = 0;
		//a의 갯수 
		int cnt = 0;
		// String[] sRst = new String[3];
		
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == 'a') {
				cnt++;
			}
		}
		
		if(cnt % 3 == 0) {
			if(cnt == 0) { //a가 존재하지 않을때 
				//b의 갯수는 len와 동일 
				for(int i = 1; i <= len - 2; i++) {
					rst += i;
				}
			} else if(cnt == len) { //a의 갯수가 len과 동일할 때 
				rst = 1;
			}
		} else {
			
		}
		
//		System.out.println(cnt);
		return rst;
    }
	
	public static void main(String[] args) {
		int rst = solution("aaaaaa");
		System.out.println(rst);
	}
}
