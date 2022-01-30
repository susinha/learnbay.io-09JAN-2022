class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
      
       
        Map<String,Integer> finalMap = new HashMap<String,Integer>();
        List<String> finalList=new ArrayList<String>();
		for(String str : cpdomains) {
			String[] arrCount = str.split(" ");
			String[] arrDomain= arrCount[1].split("\\.");		
			String keyString="";
			boolean firstTime=true;
			for(int i=arrDomain.length-1; i >= 0 ;i--) {
				if(firstTime) {
					keyString=arrDomain[i];
					firstTime=false;
				}
				else {
					keyString=arrDomain[i]+"."+keyString;
				}
				
				if(finalMap.containsKey(keyString)) {
					finalMap.put(keyString,finalMap.get(keyString)+Integer.valueOf(arrCount[0]));
				}
				else {
					finalMap.put(keyString,Integer.valueOf(arrCount[0]));
				}
			}
		}
		for(Map.Entry<String, Integer> m : finalMap.entrySet()) {
			finalList.add(m.getValue()+" "+m.getKey());
		}
		return finalList;
		
    
    
    }
}