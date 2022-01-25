class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
	
	int sum=0;
	Arrays.sort(nums);
	List<List<Integer>> finalList = new ArrayList<>();
    for(int i=0;i<nums.length-3;i++) {
    	for(int j=i+1;j<nums.length;j++) {
    	int LEFT = j+1;
    	int RIGHT = nums.length-1;
    	while(LEFT < RIGHT) {
            sum=nums[i]+nums[j]+nums[LEFT]+nums[RIGHT];
    		if(sum==target) {
    			List<Integer> sumList= new ArrayList<>();
    			sumList.add(nums[i]);
    			sumList.add(nums[j]);
    			sumList.add(nums[LEFT]);
    			sumList.add(nums[RIGHT]);
                if(!finalList.contains(sumList))
                	finalList.add(sumList);
    		}
    		if(sum < target)
    			LEFT++;
    		else
    			RIGHT--;
    	 }
    	}
    }
    return finalList;    
    }
}