class Solution { 
    String removeNonAlphanumeric(String str)
    {
        // replace the given string
        // with empty string
        // except the pattern "[^a-zA-Z0-9]"
        str = str.replaceAll(
          "[^a-zA-Z0-9]", "");
        return str;
    }
    public boolean isPalindrome(String s) { 
        String str=removeNonAlphanumeric(s).toLowerCase();
         int j=0 , k=str.length()-1;
        for(int i =0 ;i<str.length();i++){        
            if(str.charAt(j)!=str.charAt(k)){
               return false; 
            }
            j++;
            k--;
        }
       return true;
    }
}
