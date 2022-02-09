package test.subha.deep.dsa;

import java.util.HashMap;
import java.util.Map;

public class LargestSubStringBwnEqualChars {	
	//scayofdzca
	 public int maxLengthBetweenEqualCharacters(String s) {
		Map<Character,Integer> map= new HashMap();
		char[] strChar = s.toCharArray();
		int maxLen=-1;
		
		for(int i=0;i<strChar.length;i++) {
			if(map.containsKey(strChar[i])) {
				int currMax =(i - map.get(strChar[i]))-1;
				if(currMax > maxLen) {
					maxLen=currMax;
				}
			}
			else {
				map.put(strChar[i], i);
			}
			
		}		
		return maxLen;
	    }

}


