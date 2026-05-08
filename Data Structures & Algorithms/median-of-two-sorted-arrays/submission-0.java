class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len=nums1.length+nums2.length;
        int merged[]=new int[len];
        int i=0;
        while(i<nums1.length){
            merged[i]=nums1[i];
            i++;
        }  
           int j=0;
        while(i<len){
       
            merged[i]=nums2[j];
            j++;
            i++;
        }
        Arrays.sort(merged);
        int n = (len/2);
        if(len%2!=0){
            return merged[n];
        }else{
            return ((merged[n-1]+merged[n])/2.0);
          }
        
    }
}