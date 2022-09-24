class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        //Only then number is 9,999 which should return 10,000
        int[] newL=new int[digits.length+1];
        newL[0]=1;
        return newL;
    }
}