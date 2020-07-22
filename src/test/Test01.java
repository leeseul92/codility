package test;

public class Test01 {
	public static int solution(int A, int B) {
        // write your code in Java SE 8
		int rst = A * B;
		int cnt = 0;
		String binary = Integer.toBinaryString(rst);
		
		System.out.println(binary);
		
		for(int i = 0; i < binary.length(); i++) {
			if(binary.charAt(i) == '1') {
				cnt++;
			}
		}
		
		return cnt;
    }
	
	public static void main(String[] args) {
		int cnt = solution(9, 8);
		System.out.println(cnt);
	}
}
