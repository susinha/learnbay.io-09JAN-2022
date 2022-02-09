package test.subha.deep.dsa;

import java.util.HashMap;
import java.util.Map;

public class MaxUniqueSubArr {
	
	 public int maximumUniqueSubarray(int[] nums) {
	      int maxSubArraySum = Integer.MIN_VALUE;
		  int LEFT=0,RIGHT=0,SUM=0;
		  Map<Integer,Integer> m1 = new HashMap();
		  while(RIGHT < nums.length) {
			  SUM=SUM+nums[RIGHT];
			  while(m1.containsKey(nums[RIGHT])) {
					 SUM=SUM-nums[LEFT];
					 m1.remove(nums[LEFT]);
					 LEFT++;
				}
			  if(SUM > maxSubArraySum) {
				  maxSubArraySum=SUM;
			  }
			  m1.put(nums[RIGHT],1);
			  RIGHT++;			  
		  }		 
		 return maxSubArraySum;		 
	 }
}
