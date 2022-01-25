package test.subha.deep.dsa;

import java.util.Arrays;

public class ThreeSumClosest {
	
	  public int threeSumClosest(int[] nums, int target) {
		    Arrays.sort(nums);
	        int min=Integer.MAX_VALUE;
	        int res=0;
	        int sum=0;
	        for(int i=0;i<nums.length-2;i++){
	            int LEFT = i+1, RIGHT= nums.length-1;
	            while(LEFT < RIGHT){
	            	 sum = nums[i]+nums[LEFT]+nums[LEFT];
	            	 int dif=Math.abs(sum-target);
	            	 if(dif < min) {
	            		 min=dif;
	            		 res=sum;
	            	 }
	            	 if(sum < target)
	            		 LEFT++;
	            	 else
	            		 RIGHT--;
	            }
	  }
	        return res;

}
}
