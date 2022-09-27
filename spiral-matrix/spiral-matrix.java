class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<Integer>();
        if(matrix==null||matrix.length==0) return result;
        int sr=0, er=matrix.length-1, sc=0, ec=matrix[0].length-1, dir=0; // Start Row, End Row, Start Column, End Column, Direction.
        while(sr<=er&&sc<=ec){
            switch (dir){
                case 0: //Top
                    for(int col=sc;col<=ec;col++)
                        result.add(matrix[sr][col]);
                    sr++;
                    break;
                case 1: //Right
                    for(int row=sr;row<=er;row++)
                        result.add(matrix[row][ec]);
                    ec--;
                    break;
                case 2: //Bottom
                    for(int col=ec;col>=sc;col--)
                        result.add(matrix[er][col]);
                    er--;
                    break;
                case 3: //Left
                    for(int row=er;row>=sr;row--)
                        result.add(matrix[row][sc]);
                    sc++;
                    break;
            }
            dir=(dir+1)%4;
        }
        return result;
    }
}