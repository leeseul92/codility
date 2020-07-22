package test;

public class Test02 {
	public static int[] solution(int[] A, int F, int M) {
        // write your code in Java SE 8
		//주사위를 총 굴린 횟수 
		int totalRoll = A.length + F;
		
		//F의 값을 모두 더한 값
		int fSum = 0;
		
		//배열 A를 모두 더한 값
		int rst = 0;
		
		//배열리턴
		int[] rArr = {};
		
		for(int i = 0; i < A.length; i++) {
			rst += A[i];
		}
		
		fSum = M * totalRoll - rst;
		
		if(fSum <= 0) {
			rArr = new int[1];
			rArr[0] = 0;
			return rArr;
		} else if(F < fSum & (6*F) > fSum) {
			rArr = new int[F];
			rArr[0] = 6;
			for(int i = 1; i < F; i++) {
				rArr[i] = 1;
			}
			return rArr;
		} else if(F == fSum || (6*F) == fSum) {
			rArr = new int[F];
			if((6*F) == fSum) {
				for(int i = 0; i < F; i++) {
					rArr[i] = 6;
				}
			} else {
				for(int i = 0; i < F; i++) {
					rArr[i] = 1;
				}
			}
		}
		
		return rArr;
		
    }
	
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4};
		int[] arr = solution(A, 4, 6);
		System.out.println(arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
