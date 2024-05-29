class Solution {
    public int diagonalSum(int[][] mat) {
        final int row = mat.length;
        final int col = mat[0].length;
        
        int sumOfDiagonals = 0;
        
        for (int rowNumber = 0; rowNumber < row; rowNumber ++) {
            int colNumber = col - rowNumber - 1;
            int primaryDiagonal = mat[rowNumber][rowNumber];
            int secondaryDiagonal = mat[rowNumber][colNumber];
            
            sumOfDiagonals += primaryDiagonal;
            if (rowNumber != colNumber) {
                sumOfDiagonals += secondaryDiagonal;
            }
            
        }
        
        return sumOfDiagonals;
    }
}