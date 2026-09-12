class Solution {
    private int count = 0;

    public int totalNQueens(int n) {
        backtrack(0, 0, 0, 0, n);
        return count;
    }

    private void backtrack(int row, int cols, int diag1, int diag2, int n) {
        if (row == n) {
            count++;
            return;
        }
        int availableMask = ((1 << n) - 1) & ~(cols | diag1 | diag2);

        while (availableMask != 0) {
            int p = availableMask & -availableMask;
            availableMask ^= p;
            backtrack(row + 1, cols | p, (diag1 | p) << 1, (diag2 | p) >> 1, n);
        }
    }
}