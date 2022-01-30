class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        int power=0;
        for(int i=columnTitle.length()-1;i>=0;i--){
           char c=columnTitle.charAt(i);
            int val=(int)c-64;
            ans += val*Math.pow(26,power);
            power++;
        }
        return ans;
    }
}