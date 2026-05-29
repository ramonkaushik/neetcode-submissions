class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[rows - 1].length;

        int lo = 0;
        int hi = rows * cols - 1;
        int mid;

        while(lo <= hi) {
            mid = lo + (hi - lo) / 2;

            int midElem = matrix[mid/cols][mid%cols];

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
