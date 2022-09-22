class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1, sm=-1, index=-1; 
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                sm=max;
                max=nums[i];
                index=i;
            }else if(nums[i]>sm){
                sm=nums[i];
            }
        }
        return sm*2 > max? -1 : index;
    }
}