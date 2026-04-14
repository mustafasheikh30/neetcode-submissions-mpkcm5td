class Solution {
   
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int  j = nums.length-1;j>=0;j--){
                if (nums[i]+nums[j]==target&&i!=j) {
                    index[0]=j;
                    index[1]=i;
                  
                }
            }
        }
          return index;
    }
}
