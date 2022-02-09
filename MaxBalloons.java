package test.subha.deep.dsa;

public class MaxNumberOfBalloons {	
	
	public int maxNumberOfBalloons(String text) {
		int maxNumber=Integer.MAX_VALUE;
        int[] freqArr=new int[26];
        for(int i=0;i<text.length();i++) {
        	char s= text.charAt(i);
        	freqArr[s-'a']++;
        }        
        char[] balloon = new char[] {'b','a','l','o','n'};
        for(char c : balloon) {
        	if(c=='l' || c=='o') {
        		freqArr[c-'a']=freqArr[c-'a']/2;
        	}
        	maxNumber=Math.min(maxNumber, freqArr[c-'a']);
        }        
        return maxNumber;
    }

}
