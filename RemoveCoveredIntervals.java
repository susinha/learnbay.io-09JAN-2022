class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
      
     
        Arrays.sort(intervals,(o1,o2) -> o1[0]-o2[0]);
        int count=0;
        int[][] currentValue=new int[][] {{intervals[0][0],intervals[0][1]}};
        /*
         
         15-------------------------------------------91
                  29-------------------------66
                       34------39
		                          40----------------------------93
                                       53-----------69

         */
        for(int i=1;i<intervals.length;i++) {
        	if(intervals[i][0]>=currentValue[0][0] && 
        	   intervals[i][1]<=currentValue[0][1]	) {
        		count=count+1;        		
        	}
        	else if(intervals[i][0] ==currentValue[0][0] &&
        			intervals[i][1] >= currentValue[0][1]) {
        		count=count+1;
        		currentValue[0][0]=intervals[i][0];
        		currentValue[0][1]=intervals[i][1];
        	}
        	else {
        		currentValue[0][0]=intervals[i][0];
        		currentValue[0][1]=intervals[i][1];
        	}
        }
        return intervals.length-count;	
		
		
     
    }
}