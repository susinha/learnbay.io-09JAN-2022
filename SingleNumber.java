class Solution {
    public int singleNumber(int[] nums) {
          int count=0,RIGHT=1,LEFT=0;;
	        Arrays.sort(nums);	       
	        while(RIGHT < nums.length ){
	        	   	if(nums[LEFT]==nums[RIGHT]) {
	        		count =count +1 ;
	        		RIGHT++;
	        	}
	        	else {
	        		if(count ==0)
	    				return nums[LEFT];
	    			LEFT=RIGHT;
	    			RIGHT++;
	    			count=0;
	        	}
	        	
	        }
	        return nums[nums.length-1];
	    }
    }
