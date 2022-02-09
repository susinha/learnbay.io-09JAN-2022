package test.subha.deep.dsa;

public class SmoothDecentPeriodStock {

	 public long getDescentPeriods(int[] prices) {
	   	 int count=0;
		 int LEFT=0, RIGHT=0;
		 while(RIGHT < prices.length) {
			 if(LEFT==RIGHT) {
				 count=count+(RIGHT-LEFT+1);
				 RIGHT++;
			 }
			 else if(prices[RIGHT-1]-prices[RIGHT]==1) {
				 count=count+(RIGHT-LEFT+1);
				 RIGHT++;
			}
			 else {
				 LEFT=RIGHT;
			 }
			 
			
		 }
		 return count;		 
	    }
}
