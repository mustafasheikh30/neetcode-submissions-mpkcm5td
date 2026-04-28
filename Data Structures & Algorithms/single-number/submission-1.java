class Solution {
    public int singleNumber(int[] nums) {
        int i = 0, j = 0;
        boolean foundDuplicate = false;

        while (i < nums.length) {

            if (i != j && nums[i] == nums[j]) {
                foundDuplicate = true;
            }
            j++;

            if (j == nums.length) {
                if (!foundDuplicate) {
                    return nums[i];
                }
                i++;
                j = 0;
                foundDuplicate = false;
            }
        }

        return -1;
    }
}