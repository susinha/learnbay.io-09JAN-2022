class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)
            return nums[0];
        Arrays.sort(nums);
        int LEFT=0,RIGHT=nums.length-1,CURRENT=1;
        if(nums[LEFT] != nums[LEFT+1])
        	return nums[LEFT];
        if(nums[RIGHT] != nums[RIGHT-1])
        	return nums[RIGHT];
        while(CURRENT < nums.length) {
        	if(nums[CURRENT] != nums[CURRENT-1]) {
        		return nums[CURRENT-1];
        	}
        	CURRENT=CURRENT+3;
        }
        return 0;
    
    }
}