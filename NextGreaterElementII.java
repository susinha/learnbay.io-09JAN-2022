class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
       Stack<Integer> st = new Stack();
       int arrSize=nums.length;
       for(int i=nums.length*2-1;i>=0;i--) {
    	   int valAti=nums[i%arrSize];
    	   while(!st.empty() && st.peek() <= valAti) {
    		   st.pop();
    	   }
    	   if(i<nums.length) {
    		   if(!st.empty()) {
    			   nums[i]=st.peek();
    		   }
    		   else {
    			   nums[i]=-1;
    		   }
    		   
    	   }
    	   st.add(valAti);
       }
        return nums;
    
    }
}