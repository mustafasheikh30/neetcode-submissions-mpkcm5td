class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder(word1.length() + word2.length());
        int i = 0;

        // alternate while both have chars
        while (i < word1.length() && i < word2.length()) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }

        // append remaining part
        while (i < word1.length()) {
            sb.append(word1.charAt(i++));
        }
        while (i < word2.length()) {
            sb.append(word2.charAt(i++));
        }

        return sb.toString();
    }
}