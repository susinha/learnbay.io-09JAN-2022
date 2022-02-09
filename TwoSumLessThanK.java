package test.subha.deep.dsa;

import java.util.Arrays;

public class TwoSumLessK {
	
	public int twoSumLessThanK(int[] A,int K) {
		int maxLen = -1;
		Arrays.sort(A);
		int LEFT=0,RIGHT=A.length-1;
		while(LEFT < RIGHT) {
			int sum=A[LEFT]+A[RIGHT];
			if(sum < K) {
				if(sum > maxLen)
					maxLen=sum;
				LEFT++;
			}
			else {
				RIGHT--;
			}
		}
		return maxLen;		
	}

}
