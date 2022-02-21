class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       if(m==0){
			nums1[0]=nums2[0];
       }
		int mPtr=m-1;
		int nPtr=n-1;
		int posToReplace=nums1.length-1;		
		while(mPtr >=0 && nPtr>=0) {
			if(nums1[mPtr] > nums2[nPtr]) {
				nums1[posToReplace]=nums1[mPtr];
				mPtr--;				
			}
			else {
				nums1[posToReplace]=nums2[nPtr];
				nPtr--;
			}
			posToReplace--;
		}
        while(nPtr >=0) {
 			nums1[posToReplace]=nums2[nPtr];
 			posToReplace--;
 			nPtr--;
 		}
	}
}