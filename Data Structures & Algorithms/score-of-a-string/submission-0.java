class Solution {
    public int scoreOfString(String s) {
        int asciiadj=0,ascii,asciisum;
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            ascii =(int) ch[i];
            asciisum=Math.abs(ascii-(int) ch[i+1]);
            asciiadj+=asciisum;
            


        }
        return asciiadj;
    }
}