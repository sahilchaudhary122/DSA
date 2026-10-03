/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private static class NodeInfo implements Comparable<NodeInfo> {
        int row, col, val;
        NodeInfo(int row, int col, int val) {
            this.row = row;
            this.col = col;
            this.val = val;
        }
        @Override
        public int compareTo(NodeInfo other) {
            if (this.col != other.col) {
                return Integer.compare(this.col, other.col);
            }
            if (this.row != other.row) {
                return Integer.compare(this.row, other.row);
            }
            return Integer.compare(this.val, other.val);
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<NodeInfo> list = new ArrayList<>();
        dfs(root, 0, 0, list);
        Collections.sort(list);
        
        List<List<Integer>> result = new ArrayList<>();
        if (list.isEmpty()) return result;
        
        int prevCol = Integer.MIN_VALUE;
        List<Integer> currentColumn = null;
        
        for (NodeInfo node : list) {
            if (node.col != prevCol) {
                currentColumn = new ArrayList<>();
                result.add(currentColumn);
                prevCol = node.col;
            }
            currentColumn.add(node.val);
        }
        
        return result;
    }

    private void dfs(TreeNode node, int row, int col, List<NodeInfo> list) {
        if (node == null) return;
        list.add(new NodeInfo(row, col, node.val));
        dfs(node.left, row + 1, col - 1, list);
        dfs(node.right, row + 1, col + 1, list);
    }
}