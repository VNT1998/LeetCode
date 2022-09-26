class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length==0) return new int[0];
        int m = mat.length, n=mat[0].length;
        int[] result=new int[m*n];
        int r=0, c=0;
        for(int i=0;i<result.length;i++){
            result[i]=mat[r][c];
            if((r+c)%2==0){ //if m+n is even then move up
                if(c==n-1) {r++;} //Rigth wall
                else if(r==0) {c++;} //Top wall
                else {r--; c++; }
            }else{ //if m+n is odd move down
                if(r==m-1) {c++;} //Bottom wall
                else if(c==0) {r++;} //Left wall
                else { r++; c--; }
            }
        }
        return result;
    }
}