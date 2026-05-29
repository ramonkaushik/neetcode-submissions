class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[row - 1].length;
        
        int lo = 0;
        int hi = row * col - 1;

        int mid;

        while(lo <= hi) {
            mid = lo + (hi - lo) / 2;

            int midElem = matrix[mid/col][mid%col];

            if(midElem == target) {
                return true;
            } else if(midElem > target) {
                hi = mid - 1;
            } else if(midElem < target) {
                lo = mid + 1;
            }
        }

        return false;
    }
}
