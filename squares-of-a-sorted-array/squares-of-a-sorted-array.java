class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length-1;
        int p1=0, p2=n;
        int[] result = new int[n+1];
        for(int i=n; i>=0; i--){
            if(Math.abs(nums[p1])>Math.abs(nums[p2])){
                result[i]=nums[p1]*nums[p1];
                p1++;
            }else{
                result[i]=nums[p2]*nums[p2];
                p2--;
            }
        }
        return result;

    }
}