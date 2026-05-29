class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                int num = board[i][j];
                if(num != '.') {
                    if(!seen.add(num + " at row " + i) || !seen.add(num + " at col " + j) || !seen.add(num + " at 3rd " + i/3 + " " + j/3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
