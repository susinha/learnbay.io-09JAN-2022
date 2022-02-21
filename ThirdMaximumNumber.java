class Solution {
    public int thirdMax(int[] nums) {
        
		int max=nums[0];
		int second_max=Integer.MIN_VALUE;
		int third_max=Integer.MIN_VALUE;
		
		for(int i=1;i<nums.length;i++) {
			int num=nums[i];
			if(num > max) {
				third_max=second_max;
				second_max=max;
				max=num;
			}
			else if(num > second_max && num < max) {
				third_max=second_max;
				second_max=num;
			}
			else if(num > third_max && num < second_max){
				third_max=num;
			}
		}
		
		return third_max == Integer.MIN_VALUE ? max : third_max;
		
        
    
    }
}