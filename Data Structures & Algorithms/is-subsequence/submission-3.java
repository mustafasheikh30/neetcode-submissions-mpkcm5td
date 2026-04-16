class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean ans = false;
        int i=0;
        for(int j =0 ;j<t.length() && i < s.length();j++){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
        }
        if(i==s.length()){
            ans=true;
        }
        return ans;
    }
}