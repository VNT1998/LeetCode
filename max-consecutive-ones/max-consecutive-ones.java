class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCon1=0;
        int tempmaxCon1=0;
        for(int element:nums){
            if(element==1){
                tempmaxCon1++;
            }else{
                tempmaxCon1=0;
            }
            if(maxCon1<tempmaxCon1){
                maxCon1=tempmaxCon1;
            }
        }
        return maxCon1;
    }
}