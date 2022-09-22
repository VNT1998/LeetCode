class Solution {
    public int pivotIndex(int[] nums) {
        int total=0, sum=0; 
        for(int item : nums) total+=item;
        for(int i=0;i<nums.length;i++){
            if (i != 0) sum += nums[i - 1];
            if (total - sum - nums[i] == sum) return i;
        }
        return -1;
        }
}