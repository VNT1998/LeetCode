class Solution {
    public int findNumbers(int[] nums) {
        int itemCount=0;
        for(int element: nums){
            int digit = 0;
            while(element>0){
                element /= 10;
                digit++;
            }
            if(digit%2==0){
                itemCount++;
            };
        }
        return itemCount;
    }
}