class Solution {
    public boolean validMountainArray(int[] arr) {
        int f=0; 
        int l=arr.length-1;
        if(arr.length < 3) return false;
        while(((f + 1) < l) && (arr[f] < arr[f + 1])) {
            f++;
        }
        while(((l - 1) > 0) && (arr[l] < arr[l - 1])) {
            l--;
        }
        return f == l;
    }
}