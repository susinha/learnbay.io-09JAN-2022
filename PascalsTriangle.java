class Solution {
    public ListListInteger generate(int numRows) {
        
	ListListInteger finalList = new ArrayList();	
	for(int i=0;inumRows;i++) {
		ListInteger lst=new ArrayList();
		if(i==0) 		
			lst.add(1);
		else if(i==1){
			lst.add(1);
			lst.add(1);
		}
		else {
			lst.add(1);
			ListInteger prevlst = finalList.get(i-1);
			for(int j=0;ji-1;j++) {			
				lst.add(prevlst.get(j)+prevlst.get(j+1));
			}
			lst.add(1);
		}
			
		finalList.add(lst);	
	}	
		return finalList;        
    
    }
}