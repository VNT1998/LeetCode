class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int sb=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                sb++;
            }else if(sb>0){
                int t=nums[i];
                nums[i]=nums[i-sb];
                nums[i-sb]=t;
            }
        }
        return nums;
    }
}