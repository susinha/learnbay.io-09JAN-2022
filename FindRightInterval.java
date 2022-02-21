class Solution {
    public int[] findRightInterval(int[][] intervals) {
        		
				
		int[] answer=new int[intervals.length];
		Map<Integer,Integer> hMap=new HashMap<Integer,Integer>();
		int[] firstIntervalArr=new int[intervals.length];
		//{3,4} {2,3} {1,2}
		//m : 1,2   2,1    3,0
		// first : 1,2,3
		for(int i=0;i<intervals.length;i++) {
			firstIntervalArr[i]=intervals[i][0];
			hMap.put(intervals[i][0], i);
		}
		Arrays.sort(firstIntervalArr);
		for(int i=0;i<intervals.length;i++) {
			int endInterval=intervals[i][1];
			int key=binarySearch(endInterval,firstIntervalArr);
			
			if(endInterval > firstIntervalArr[firstIntervalArr.length-1]) {
				answer[i]=-1;
			}
			else {
				answer[i]=hMap.get(firstIntervalArr[key]);
			}
			
			
		}
		return answer;      
    }
     public int binarySearch(int target ,int[] arr)
	    {
	        int s  =0 ;
	        int e = arr.length-1;
	        while(s <e)
	        {
	            int mid = s +(e-s)/2 ;
	            if(arr[mid]<target)
	                s=mid+1;
	            else
	                e=mid;
	        }
	        return s;
	    }
}