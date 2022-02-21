class Solution {
    public boolean isIsomorphic(String s, String t) {
        
		
		Map<Character,Character> sMap= new HashMap<Character,Character>();
		Map<Character,Character> tMap= new HashMap<Character,Character>();
		for(int i=0;i< s.length();i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
			
			if(sMap.containsKey(sChar)) {
				char sMapVal=sMap.get(sChar);
				if(sMapVal != tChar) 
					return false;				
			}			

			if(tMap.containsKey(tChar)) {
				char tMapVal=tMap.get(tChar);
				if(tMapVal != sChar) 
					return false;				
			}
			sMap.put(sChar,tChar);
			tMap.put(tChar, sChar);
		}
        return true;
    
    }
}