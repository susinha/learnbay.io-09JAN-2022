class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
		int initalLength = intervals.length;
		Arrays.sort(intervals, (o1,o2) -> o1[0]-o2[0]);
		int j=0,k=1;
		while(k<intervals.length) {
			if(intervals[j][1] > intervals[k][0]) {
				intervals[j][1] = Math.min(intervals[j][1], intervals[k][1]);
			}
			else {
				j++;
				intervals[j]=intervals[k];
			}
			k++;
		}
		System.out.println("====> "+j);
		return initalLength-(j+1);
		
	
    }
}