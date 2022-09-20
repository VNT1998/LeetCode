class Solution {
    public int heightChecker(int[] heights) {
        int b[]= new int[101];
        for(int height:heights){
            b[height]++;
        }
        int wn=0, index=0;
        for(int i=1; i<=100; i++){
            while(b[i]>0){
                if(i!=heights[index++]) wn++;
                b[i]--;
            }
        }
        return wn;
    }
}