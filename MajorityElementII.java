class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
     
        List<Integer> arrCount = new ArrayList();
        Map<Integer,Integer> m1= new HashMap();
        int count=nums.length/3;
        for(int i=0;i<nums.length;i++) {
        	if(m1.containsKey(nums[i])) {
        		m1.put(nums[i], m1.get(nums[i])+1);
        	}
        	else {
        		m1.put(nums[i],1);
        	}
        	int checkCount = m1.get(nums[i]);
    		if(checkCount > count && !arrCount.contains(nums[i]) ) {
    			arrCount.add(nums[i]);
    		}
        }
       
        return arrCount;
    
    
    }
}